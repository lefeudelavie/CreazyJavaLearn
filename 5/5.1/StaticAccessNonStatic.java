public class StaticAccessNonStatic
{
	public void info()
	{
		System.out.println("调用info方法");
	}

	public static void main(String[] args)
	{
		info();
	}
}