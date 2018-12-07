import java.util.*;


public class NullTest
{
     public static void main(String[] args)
     {
	 try
	 {
	     /*
	      String a = null;
	      System.out.println(a.length());
	      */
	    
	     Date d = null;
	     System.out.println(d.after(new Date()));
	 }
	 catch (NullPointerException ne)
	 {
	      System.out.println("错误的访问了空对象");
	 }
	 catch (Exception e)
	 {
	      System.out.println("未知异常");
	 }
     }
}
