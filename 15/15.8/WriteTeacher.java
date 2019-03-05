import java.io.*;

public class WriteTeacher
{
	public static void main(String[] args)
	{
		try(
			ObjectOutputStream oos = new ObjectOutputStream(
							new FileOutputStream("teacher.txt")))
		{
			Person per = new Person("孙行者", 500);
			Teacher t1 = new Teacher("菩提祖师", per);
			Teacher t2 = new Teacher("唐僧", per);

			oos.writeObject(t1);
			oos.wirteObject(t2);
			oos.wirteObject(per);
			oos.writeObject(t2);
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
	}
}
