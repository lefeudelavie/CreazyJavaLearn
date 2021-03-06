import java.awt.*;
import java.awt.event.*;
import java.awt.datatransfer.*;

class Dog
{
    private String name;
    private int age;

    public Dog(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getName()
    {
        return this.name;
    }

    public int getAge()
    {
        return this.age;
    }

    public String toString()
    {
        return "Dog:[name:" + this.name + " age:" + this.age + "]";
    }
}

public class CopySerializable 
{
    private Frame f = new Frame("复制对象");
    private TextField name = new TextField(15);
    private TextField age = new TextField(15);

    private TextArea ta = new TextArea(3, 30);

    private Button copy = new Button("复制");
    private Button paste = new Button("粘贴");
    private Clipboard clipboard = Toolkit.getDefaultToolkit()
        .getSystemClipboard();

    public void init()
    {
        Panel p = new Panel();
        p.add(new Label("姓名"));
        p.add(name);
        p.add(new Label("年龄"));
        p.add(age);
        f.add(p,BorderLayout.NORTH);

        f.add(ta);

        Panel bp = new Panel();
        bp.add(copy);
        bp.add(paste);
        f.add(bp, BorderLayout.SOUTH);

        copy.addActionListener(e -> copyDog());
        paste.addActionListener(e -> 
        {
            try
            {
                readDog();
            }
            catch (Exception ee)
            {
                ee.printStackTrace(); 
            }
        });

        f.pack();
        f.setVisible(true);
    }

    public void copyDog()
    {
        Dog dog = new Dog(name.getText()
                , Integer.parseInt(age.getText()));

        SerialSelection ls = new SerialSelection(dog);
        clipboard.setContents(ls, null);
    }

    public void readDog() throws Exception
    {
        DataFlavor dogFlavor = new DataFlavor(DataFlavor.
                javaSerializedObjectMimeType + ";class=Dog");
        if (clipboard.isDataFlavorAvailable(DataFlavor.stringFlavor))
        {
            Dog d = (Dog)clipboard.getData(dogFlavor);
            ta.setText(d.toString());
        }
    }
    

    public static void main(String[] args)
    {
        new CopySerializable().init();
    }

}
