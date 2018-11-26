import java.util.*;
import java.io.*;


public class SystemTest
{
	public static void main(String[] args) throws Exception
	{
		Map<String, String> env = System.getenv();
		for (String name: env.keySet())
		{
			System.out.println(name + " ----> " + env.get(name));
		} 

		System.out.print("\n\n");
		System.out.println(System.getenv("JAVA_HOME") + "\n");
		Properties prop = System.getProperties();
		prop.store( new FileOutputStream("props2.txt"), "System Prop" );
		System.out.println(System.getProperty("os.name"));
	}
}