public class ContinueTest
{
	public static void main(String[] arg)
	{

		for ( int i = 0; i < 5; i++ )
		{
			for ( int j = 0 ; j < 3; j++)
			{
				System.out.println("i的值为:" + i + " j的值为：" + j);
				if ( j == 1)
					continue;
			}
		}
		System.out.println("########1#######");
		System.out.println("########1#######");

		outer:
		for ( int i = 0; i < 5; i++ )
		{
			for ( int j = 0 ; j < 3; j++)
			{
				System.out.println("i的值为:" + i + " j的值为：" + j);
				if ( j == 1)
					continue outer;
			}
		}

		System.out.println("########2#######");
		System.out.println("########2#######");
		for ( int i = 0; i < 5; i++ )
		{
			for ( int j = 0 ; j < 3; j++)
			{
				System.out.println("i的值为:" + i + " j的值为：" + j);
				if ( j == 1)
					break;
			}
		}


		System.out.println("########3#######");
		System.out.println("########3#######");
		outer:
		for ( int i = 0; i < 5; i++ )
		{
			for ( int j = 0 ; j < 3; j++)
			{
				System.out.println("i的值为:" + i + " j的值为：" + j);
				if ( j == 1)
					break outer;
			}
		}

	}
}