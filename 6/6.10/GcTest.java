public class GcTest
{

	public static void main(String[] args)
	{
		for ( int i=0 ; i < 5 ; i++)	
		{
			new GcTest();
			//System.out.println("#########################");
			//System.out.println("i is:" + i);
			System.gc();
			//System.out.println("#########################");
		}
	}

	public void finalize()
	{
		System.out.println("系统正在清理GcTest对象的资源...");
	}


}