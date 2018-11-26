class Person
{
	{
		int a = 6;
		System.out.println("第一个初始化代码块。 a=" + a);
	}

	{
		int a = 9;
		System.out.println("第二个初始化代码块, a=" + a);
	}


	public Person()
	{
		System.out.println("无参数的构造器。");
	}


	public static void main(String[] args)
	{
		Person p = new Person();
	}
}