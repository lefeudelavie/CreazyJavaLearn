import java.util.*;

public class ScannerKeyBoardTest
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext())
		{
			System.out.println("键盘输入的内容为:" + sc.next());
		}
	}
}