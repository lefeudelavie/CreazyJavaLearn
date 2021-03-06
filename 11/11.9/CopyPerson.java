import java.awt.*;
import java.awt.datatransfer.*;
import java.awt.event.*;

class Person
{
    private int age;
    private String name; 

    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public void setName(String Name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return this.age;
    }

    public String getName()
    {
        return this.name;
    }

    public String toString()
    {
        return "Person[Name:" + this.name + " Age:" + this.age + ']';
    }
}


public class CopyPerson
{
    Frame f = new Frame("复制对象");
    Button copy = new Button("复制");
    Button paste = new Button("粘贴");

    TextField name = new TextField(15);
    TextField age = new TextField(15);

    TextArea ta = new TextArea(3, 30);
    Clipboard clipboard = new Clipboard("cp"); 

    public void init()
    {
        Panel p = new Panel();
        p.add(new Label("姓名"));
        p.add(name);
        p.add(new Label("年龄"));
        p.add(age);

        Panel bp = new Panel();
        bp.add(copy);
        bp.add(paste);

        copy.addActionListener(event -> copyPerson());
        paste.addActionListener(event ->
        {
            try
            {
                readPerson();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        });
        
        f.add(p, BorderLayout.NORTH);
        f.add(ta);
        f.add(bp, BorderLayout.SOUTH);
        
        f.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });

        f.pack();
        f.setVisible(true);
    }

    public void copyPerson()
    {
        Person p = new Person(name.getText(),
                Integer.parseInt(age.getText()));
        LocalObjectSelection contents = new LocalObjectSelection(p);
        clipboard.setContents(contents, null);
    }

    public void readPerson() throws Exception
    {
        DataFlavor personFlavor = new DataFlavor(
                "application/x-java-jvm-local-objectref;class=Person");

        if (clipboard.isDataFlavorAvailable(DataFlavor.stringFlavor))
        {
            Person p = (Person)clipboard.getData(personFlavor);
            ta.setText(p.toString());
        }
    }

    public static void main(String[] args)
    {
        new CopyPerson().init();
    }
}
