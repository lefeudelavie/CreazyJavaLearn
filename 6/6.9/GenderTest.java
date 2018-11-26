public class GenderTest
{
	public static void main(String[] args)
	{
		Gender g = Enum.valueOf(Gender.class, "MALE");
		/*
		g.name = "男";
		System.out.println("g 's name is:" + g.name);
		*/

		g.setName("女");
		System.out.println("g的性别是：" + g.getName());
	}
}