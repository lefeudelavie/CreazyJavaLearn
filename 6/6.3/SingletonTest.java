class SingletonTest
{
	private static SingletonTest instance;
	private SingletonTest() {};

	public static SingletonTest getInstance()
	{
		if (instance == null)
		{
			instance = new SingletonTest();
		}
		return instance;
	}


	public static void main(String[] args)
	{
		SingletonTest s1 = SingletonTest.getInstance();
		SingletonTest s2 = SingletonTest.getInstance();
		System.out.println("Is s1 == s2:" + (s1 == s2));
	}
}