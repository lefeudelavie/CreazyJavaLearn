import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Properties;
import java.util.ArrayList;
import java.io.*;
import javax.swing.filechooser.FileFilter;

public class BlobTest
{
    JFrame jf = new JFrame("图片管理程序");
    private static Connection conn;
    private static PreparedStatement insert;
    private static PreparedStatement query;
    private static PreparedStatement queryAll;

    // Define a DefaultListMode object
    private DefaultListModel<ImageHolder> imageModel
        = new DefaultListModel<>();

    private JList<ImageHolder> imageList = new JList<>(imageModel);
    private JTextField filePath = new JTextField(26);
    private JButton browserBn = new JButton("...");
    private JButton uploadBn = new JButton("上传");
    private JLabel imageLabel = new JLabel();

    // create file based on current path
    JFileChooser  chooser = new JFileChooser(".");

    // create a file filter
    ExtensionFileFilter filter = new ExtensionFileFilter();
    static 
    {
        // connect mysql db
        try 
        {
            Properties props = new Properties();
            props.load(new FileInputStream("mysql.ini"));
            String driver = props.getProperty("driver");
            String url = props.getProperty("url");
            String user = props.getProperty("username");
            String pass = props.getProperty("password");

            Class.forName(driver);

            conn = DriverManager.getConnection(url, user, pass);
            
            // create preparedStatement object which do the insert  
            // this object can return the primary key after insert
            insert = conn.prepareStatement("insert into img_table"
                    + " values(null, ?, ?)" , Statement.RETURN_GENERATED_KEYS);
            
            // create two prepareStatement object, use them to query image, or query all images
            query = conn.prepareStatement("select img_data from img_table"
                    + " where img_id=?");
            queryAll = conn.prepareStatement("select img_id, "
                    + " img_name from img_table");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public void init() throws SQLException
    {
        // initiate file selector
        filter.addExtension("jpg");
        filter.addExtension("jpeg");
        filter.addExtension("gif");
        filter.addExtension("png");
        filter.setDescription("图片文件(*.jpg, *.jpeg, *.gif, *.png)");
        chooser.addChoosableFileFilter(filter);
        // disable "file type" list display "all file" selection.
        chooser.setAcceptAllFileFilterUsed(false);
        // ----- initiate program UI -----
        fillListModel();
        filePath.setEditable(false);
        // ---- radio choice ----
        imageList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JPanel jp = new JPanel();
        jp.add(filePath);
        jp.add(browserBn);
        browserBn.addActionListener(event -> {
            // diaplay file dialoge
            int result = chooser.showDialog(jf, "浏览图片文件上传");
            // if user select APPROVE button, open , save button
            if (result == JFileChooser.APPROVE_OPTION)
            {
                filePath.setText(chooser.getSelectedFile().getPath());
            }
        });
        jp.add(uploadBn);
        uploadBn.addActionListener(event -> {
            // if there is stuff in the upload dialog
            if (filePath.getText().trim().length() > 0)
            {
                // save file to database
                upload(filePath.getText());
                // clear contents in the text filed
                filePath.setText("");
            }
        });

        JPanel left = new JPanel();
        left.setLayout(new BorderLayout());
        left.add(new JScrollPane(imageLabel), BorderLayout.CENTER);
        left.add(jp, BorderLayout.SOUTH);
        jf.add(left);
        imageList.setFixedCellWidth(160);
        jf.add(new JScrollPane(imageList), BorderLayout.EAST);
        imageList.addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent e)
            {
                // if double click the mouse
                if (e.getClickCount() >= 2)
                {
                    // get the select list
                    ImageHolder cur = (ImageHolder)imageList.
                        getSelectedValue();
                    try
                    {
                        // display image that has selected
                        showImage(cur.getId());
                    }
                    catch (Exception sqle)
                    {
                        sqle.printStackTrace();
                    }
                }
            }
        });
        jf.setSize(620, 400);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }

    // ----- find the imag_table and fill in ListModel -------
    public void fillListModel() throws SQLException
    {
        try(
            // execute the query
            ResultSet rs = queryAll.executeQuery();)
        {
            // Clear all elements at first
            imageModel.clear();
            // add all queried records into the ListModel 
            while (rs.next())
            {
                imageModel.addElement(new ImageHolder(rs.getInt(1)
                            , rs.getString(2)));
            }
        }
    }

    //  ---- put image into the database -------
    public void upload(String fileName)
    {
        // get the filename
        String imageName = fileName.substring(fileName.lastIndexOf('\\')
                + 1, fileName.lastIndexOf('.'));
        File f = new File(fileName);
        try (
                InputStream is = new FileInputStream(f))
        {
            // set image name parameter
            insert.setString(1, imageName);
            // set binary stream paramenter
            insert.setBinaryStream(2, is, (int)f.length());
            int affect = insert.executeUpdate();
            if (affect == 1)
            {
                // renew ListModel, let JList show the latest image list
                fillListModel();
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    // ------- display image based on the ID -------
    public void showImage(int id) throws SQLException
    {
        // set paramenter
        query.setInt(1, id);
        try (
                // execute query
                ResultSet rs = query.executeQuery())
        {
            if (rs.next())
            {
                // get the Blob column
                Blob imgBlob = rs.getBlob(1);
                // get the data in Blob column
                ImageIcon icon = new ImageIcon(imgBlob.getBytes(1L
                            , (int)imgBlob.length()));
                imageLabel.setIcon(icon);
            }
        }
    }

    public static void main(String[] args) throws SQLException
    {
        new BlobTest().init();
    }
}




// create the sub class for FileFilter, use it to do the file filter -------
class ExtensionFileFilter extends FileFilter
{
    private String description = "";
    private ArrayList<String> extensions = new ArrayList<>();
    // self defined method, used to add file extension
    public void addExtension(String extension)
    {
        if (!extension.startsWith("."))
        {
            extension = "." + extension;
            extensions.add(extension.toLowerCase());
        }
    }
    // used to set file filter's description
    public void setDescription(String aDescription)
    {
        description = aDescription;
    }
    // extend FileFilter class, implement the abstract methos which return the filter description string
    public String getDescription()
    {
        return description;
    }
    // extend FileFilter class, implement abstract method , judge if the filter accept the file
    public boolean accept(File f)
    {
        // if the file is a path ,accept the file
        if (f.isDirectory()) return true;
        // change filename to lowercase
        String name = f.getName().toLowerCase();
        // travser all the extension, if extension hit, the file is acceptted
        for (String extension: extensions)
        {
            if (name.endsWith(extension))
            {
                return true;
            }
        }
        return false;
    }
}


// create ImageHolder class , use it to encapsulate image, image ID
class ImageHolder
{
    // encaps image's ID
    private int id;
    // encaps image's name
    private String name;
    public ImageHolder(){};
    public ImageHolder(int id, String name)
    {
        this.id = id;
        this.name = name;
    }
    // setter and getter for id
    public void setId(int id)
    {
        this.id = id;
    }

    public int getId()
    {
        return this.id;
    }

    // setter and getter for name
    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }

    // override toString 
    public String toString()
    {
        return name;
    }
}



