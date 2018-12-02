import java.util.*;
import java.io.*;

public class PropertiesTest
{
	public static void main(String[] args) throws Exception
	{
    	Properties props = new Properties();
		props.setProperty("username", "andrew");
		props.setProperty("password", "~!@123");
		props.store(new FileOutputStream("prop.ini"), "comment line");
		Properties props2 = new Properties();
		props2.setProperty("gender", "Female");
		props2.load(new FileInputStream("prop.ini"));
		System.out.println(props2);
		
	}
}
