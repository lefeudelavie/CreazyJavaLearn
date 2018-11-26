public class GenderTest
{
	public static void main(String[] args)
	{
		Gender g = Gender.valueOf("MALE");
		System.out.println("g代表" + g.getName());
	}
}