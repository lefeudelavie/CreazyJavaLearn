import java.io.*;

public class SerializeMutable
{
    public static void main(String[] args)
    {
	try(
	    ObjectOutputStream oos = new ObjectOutputStream(
		new FileOutputStream("mutable.txt"));
	    ObjectInputStream ois = new ObjectInputStream(
		new FileInputStream("mutable.txt")))
	{
	    Person per = new Person("孙悟空", 500);
	    oos.writeObject(per);
	    per.setName("猪八戒");
	    oos.writeObject(per);
	    Person p1 = (Person)ois.readObject();
	    Person p2 = (Person)ois.readObject();

	    System.out.println(p1 == p2);
	    System.out.println(p2.getName());
	}
	catch (Exception ex)
	{
	    ex.printStackTrace();
	}
    }
}
