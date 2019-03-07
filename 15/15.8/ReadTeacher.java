import java.io.*;

public class ReadTeacher
{
    public static void main(String[] args)
    {
	try (
	    ObjectInputStream ois = new ObjectInputStream(
		new FileInputStream("teacher.txt")))
	{
	    Teacher t1 = (Teacher)ois.readObject();
	    Teacher t2 = (Teacher)ois.readObject();
	    Person p = (Person)ois.readObject();
	    Teacher t3 = (Teacher)ois.readObject();

	    System.out.println("t1��student���ú�p�Ƿ���ͬ��" 
		    + (t1.getStudent() == p));
	    System.out.println("t2��student���ú�p�Ƿ���ͬ��"
		    + (t2.getStudent() == p));
	    System.out.println("t2��t3�Ƿ���ͬһ������"
		    + (t2 == t3));
	}
	catch (Exception ex)
	{
	    ex.printStackTrace();
	}
    }
}
