import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import java.util.*;
import java.io.*;
import java.sql.*;

public class QueryExecutor
{
    JFrame jf = new JFrame("查询执行其");
    private JScrollPane scrollPane;
    private JButton execBn = new JButton("查询");
    // Text filed used to do the query
    private JTextField sqlField = new JTextField(45);
    private static Connection conn;
    private static Statement stmt;

    // Use static initialization to initiate Connection and Statement object
    static
    {
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
            stmt = conn.createStatement();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public void init()
    {
        JPanel top = new JPanel();
        top.add(new JLabel("输入查询语句："));
        top.add(sqlField);
        top.add(execBn);

        execBn.addActionListener(new ExecListener());
        sqlField.addActionListener(new ExecListener());
        jf.add(top, BorderLayout.NORTH);
        jf.setSize(680, 480);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }

    class ExecListener implements ActionListener
    {
        public void actionPerformed(ActionEvent evt)
        {
            if (scrollPane != null)
            {
                jf.remove(scrollPane);
            }
            try (
                    ResultSet rs = stmt.executeQuery(sqlField.getText()))
            {
                ResultSetMetaData rsmd = rs.getMetaData();
                Vector<String> columnNames = new Vector<>();
                Vector<Vector<String>> data = new Vector<>();

                for (int i = 0; i < rsmd.getColumnCount(); i++)
                {
                    columnNames.add(rsmd.getColumnName(i + 1));
                }

                while (rs.next())
                {
                    Vector<String> v = new Vector<>();
                    for (int i = 0; i < rsmd.getColumnCount(); i++)
                    {
                        v.add(rs.getString(i + 1));
                    }
                    data.add(v);
                }

                JTable table = new JTable(data, columnNames);
                scrollPane = new JScrollPane(table);
                jf.add(scrollPane);
                jf.validate();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args)
    {
        new QueryExecutor().init();
    }
}
