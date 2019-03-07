import java.io.*;

public class TransientTest
{
    public static void main(String[] args)
    {
	try(
	    ObjectOutputStream oos = new ObjectOutputStream(
		new FileOutputStream("transient.txt"));
	    ObjectInputStream ois = new ObjectInputStream(
		new FileInputStream("transient.txt")))
	{
	    Person per = new Person("孙悟空", 500);
	    oos.writeObject(per);
	    Person p = (Person)ois.readObject();
	    System.out.println(p.getAge());
	}
	catch (Exception ex)
	{
	    ex.printStackTrace();
	}
    }
}
