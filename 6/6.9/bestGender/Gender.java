public enum Gender
{
	MALE("男"),FEMAL("女");
	private final String name;
	private Gender(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return this.name;
	}
}