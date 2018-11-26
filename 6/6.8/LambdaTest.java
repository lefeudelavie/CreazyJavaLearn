@FunctionalInterface
interface FkTest
{
	void run();
}



public class LambdaTest
{
	public static void main(String[] args)
	{
		Runnable r = () -> {
			for (int i = 0; i < 10 ; i++)
			{
				System.out.println("i is:" + i);
			}
		};			
		System.out.println(r);	
		r.run();


		Object obj = (Runnable)() -> {
			for ( int i = 0; i < 10 ; i++)
			{
				System.out.println("i");
			}
		};
		System.out.println("obj is:" + obj);

		Object obj2 = (FkTest)() -> {
			for ( int i = 0; i < 10 ; i++)
			{
				System.out.println("i");
			}			
		};

	}

}
