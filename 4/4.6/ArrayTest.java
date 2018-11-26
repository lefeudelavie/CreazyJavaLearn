import java.util.Arrays;

public class ArrayTest 
{
	public static void main(String[] args)
	{
		int[] a = new int[] {1, 2, 3, 4, 5};
		int[] a2= new int[] {1, 2, 3, 4, 5};

		System.out.println("Is a equals to a2? " + Arrays.equals(a, a2));

		int[] b = Arrays.copyOf(a, 7);
		System.out.println("Is a equals to b? " + Arrays.equals(a, b));

		System.out.println("Elements in b are:" + Arrays.toString(b));

		Arrays.fill(b, 2,4,1);
		System.out.println("Elements in b are:" + Arrays.toString(b));

		Arrays.sort(b);
		System.out.println("Elements in b are:" + Arrays.toString(b));
	}
}