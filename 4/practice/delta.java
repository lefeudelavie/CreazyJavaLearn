import java.io.*;

public class delta
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader inputer = new BufferedReader(new InputStreamReader(System.in));
		String inputInt = null;

		System.out.println("请输入您要打印的等腰三角形的size:");
		while ( (inputInt = inputer.readLine()) != null ) 
		{
			int size = Integer.parseInt( inputInt );
			System.out.println("您输入的数字是：" + size);

			int delta_start = size - 1;

			for (int i = 0; i < size; i++)
			{
				// 找到每行的起始点
				for ( int m = 0 ; m < delta_start - i; m++ )
					System.out.print(" ");
				for ( int j = 0 ; j < 2*i + 1 ; j++ )
					System.out.print("*");
				System.out.println();
			}
			System.out.println("请再次输入您要打印的等腰三角形的size:");
		}
	}	
}