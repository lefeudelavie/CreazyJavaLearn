public class GenderTest
{
	public static void main(String[] args)
	{
		Gender g = Gender.valueOf("MALE");
		g.info();
		System.out.println("g 代表:" + g.getName());
	}
}