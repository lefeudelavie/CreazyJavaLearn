public class TwoDimensionTest
{
	public static void main(String[] args)
	{
		int[][] a;
		a = new int[5][];
		for (int i = 0 ,len = a.length; i < len; i++)
		{
			System.out.println(a[i]);
		}

		a[0] = new int[2];
		a[0][1] = 3;

		for (int i = 0, len = a[0].length; i < len; i++)
		{
			System.out.println(a[0][i]);
		}
		System.out.println("\n\n");

		int[][] b = {new int[4], new int[5], new int[6]};
		for (int i = 0, len = b[0].length; i < len; i++)
		{
			System.out.println(b[0][i]);
		}
		System.out.println("\n\n");	

		// int[][] c = new int[3][];
		// for (int i = 0, len = c[0].length; i < len; i++)
		// {
		// 	System.out.println(c[0][i]);
		// }		

		int[][] d = new int[3][5];
		for (int i = 0, len = d[0].length; i < len; i++)
		{
			System.out.println(d[0][i]);
		}		
		System.out.println("\n\n");	

		String[][] e = new String[][] {new String[3], new String[]{"Hello"}};
		for (int i = 0, len = e[1].length; i < len ; i++)
		{
			System.out.println(e[1][i]);
		}
	}
}