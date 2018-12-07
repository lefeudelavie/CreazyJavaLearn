import java.util.*;

public class DivTest
{
     public static void main(String[] args)
     {
	 try
	 {
	     int a = Integer.parseInt(args[0]);
	     int b = Integer.parseInt(args[1]);
	     int c = a/b;
	     System.out.println("您输入的两个数相除的结果是：" + c);
	 }
	 catch (IndexOutOfBoundsException ie)
	 {
	      System.out.println("数组越界:没有输入足够的参数");
	 }
	 catch (NumberFormatException ne)
	 {
	      System.out.println("数字格式异常。");
	 }
	 catch (ArithmeticException ae)
	 {
	      System.out.println("算术异常：不能除0");
	 }
	 catch (Exception e)
	 {
	      System.out.println("未知异常。");
	 }
     }
}
