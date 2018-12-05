public class ArrayErr
{
     public static void main(String[] args)
     {
	 Integer[] ia = new Integer[5];
	 Number[] na = ia;
	 na[1] = 3.5;
     }
}
