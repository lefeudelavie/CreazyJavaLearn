public class EnumTest
{
	public void judge(SeasonEnum e)
	{
		switch (e) 
		{
			case SPRING:
				System.out.println("Spring is coming!");
				break;
			case SUMMER:
				System.out.println("Summer is so hot!") ;
				break;
			case AUTUM:
				System.out.println("Autum is so cool!");
				break;
			case WINTER:
				System.out.println("Winter is so cold!");
				break;
		}
	}

	public static void main(String[] args)
	{

		for (SeasonEnum s :SeasonEnum.values())
		{
			System.out.println(s);
		}

		EnumTest et = new EnumTest();
		SeasonEnum a = SeasonEnum.SPRING;
		et.judge(a);

	} 
}