public class MultiException
{
     public static void main(String[] args)
     {
	 try
	 {
	      int a = Integer.parseInt(args[0]);
	      int b = Integer.parseInt(args[1]);
	      int c = a / b;
	      System.out.println("两个数相除的结果是：" + c);
	 }
	 catch ( IndexOutOfBoundsException | NumberFormatException | 
		 ArithmeticException me)
	 {
	      System.out.println("程序发生了数组越界异常、数字格式异常以及算术异常之一");
	      //me = new ArithmeticException("Test");
	 }
	 catch ( Exception e)
	 {
	      System.out.println("未知异常");
	      e = new RuntimeException("Test2");
	 }
     }
}
