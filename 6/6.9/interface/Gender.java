public enum Gender implements GenderDesc
{
	//MALE("男"), FEMALE("女");
	MALE("男")
	{
		public void info()
		{
			System.out.println("该性别代表男性");
		}
	},
	FEMALE("女")
	{
		public void info()
		{
			System.out.println("该性别代表女性");
		}
	};

	private final String name;
	private Gender(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return this.name;
	}
/*
	public void info()
	{
		System.out.println("这是一个显示性别的枚举类。");
	}
*/


}