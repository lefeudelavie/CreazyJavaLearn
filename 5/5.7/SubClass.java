class BaseClass
{
	public int book = 6;
	public void base()
	{
		System.out.println("父类的普通方法");
	}

	public void test()
	{
		System.out.println("父类的被覆盖的方法");
	}
}

public class SubClass extends BaseClass
{
	public String book = "测试书籍";
	public void test()
	{
		System.out.println("子类的覆盖父类的方法");
	}

	public void sub()
	{
		System.out.println("子类的普通方法");
	}

	public static void main(String[] args)
	{
		BaseClass bc = new BaseClass();
		System.out.println(bc.book);
		bc.base();
		bc.test();

		SubClass sc = new SubClass();
		System.out.println(sc.book);
		sc.base();
		sc.test();

		BaseClass ploymopicBc = new SubClass();
		System.out.println(ploymopicBc.book);
		ploymopicBc.base();
		ploymopicBc.test();
		//ploymopicBc.sub();
	}
}

