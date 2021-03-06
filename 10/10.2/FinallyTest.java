import java.io.*;
import java.util.*;


public class FinallyTest
{
     public static void main(String[] args)
     {	 
	 FileInputStream fis = null;
	 try
	 {
	      fis = new FileInputStream("a.txt");
	 }
	 catch (IOException ioe)
	 {
	      System.out.println(ioe.getMessage());
	      return;
	 }
	 finally
	 {
	      if (fis != null)
	      {
		  try
		  {
		       fis.close();
		  }
		  catch (IOException ioe)
		  {
		       ioe.printStackTrace();
		  }
	      }
	      System.out.println("执行finally里面的资源回收。");
	 }
     }
}
