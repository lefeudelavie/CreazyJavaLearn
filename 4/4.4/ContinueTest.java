public class ContinueTest
{
	public static void main(String[] arg)
	{
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

		System.out.println();
		System.out.println();
		for ( int i = 0; i < 5; i++ )
		{
			for ( int j = 0 ; j < 3; j++)
			{
				System.out.println("i的值为:" + i + " j的值为：" + j);
				if ( j == 1)
					break;
			}
		}


		System.out.println();
		System.out.println();
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