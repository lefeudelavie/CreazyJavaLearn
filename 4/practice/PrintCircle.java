import java.io.*;

public class PrintCircle
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader inputer = new BufferedReader(new InputStreamReader(System.in));
		String inputInt = null;

		System.out.println("请输入您要打印的圆的半径(正整数):");
		while ( (inputInt = inputer.readLine()) != null ) 
		{
			int radius = Integer.parseInt(inputInt);
			System.out.println("您输入的圆半径为：" + radius);


			// 打印前一半圆
			for (int i = 0; i < radius; i++)
			{
				// 计算弦长
				int chord = (int)Math.round(Math.sqrt( radius* radius - (radius - i)*(radius-i) ));
				// 计算并行进到打印的起始点
				int startPoint = Math.round(((float) radius - (float) chord /2) * 3);

				System.out.println("chord:" + chord + " startPoint:" + startPoint);

				for (int k = 0; k < startPoint; k++)
				{
					System.out.print("");	
				}
				//打印构成圆的两个点
				System.out.print("*");
				for ( int j = 0 ; j < chord ;j++)
					System.out.print("   ");
				System.out.println("*");
			}

			//打印后一半圆
			for (int i = radius ; i >= 0 ; i--)
			{
				// 计算弦长
				int chord = (int)Math.round(Math.sqrt( radius* radius - (radius - i)*(radius-i) ));
				// 计算并行进到打印的起始点
				int startPoint = radius - chord /2;

				//System.out.println("chord:" + chord + " startPoint:" + startPoint);

				for (int k = 0; k < startPoint; k++)
				{
					System.out.print(" ");	
				}
				//打印构成圆的两个点
				System.out.print("*");
				for ( int j = 0 ; j < chord ;j++)
					System.out.print(" ");
				System.out.println("*");		
			}
		}
	}
}