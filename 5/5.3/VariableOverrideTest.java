public class VariableOverrideTest
{
	private String name = "安宇";
	private static double price = 88.8;
	public static void main(String[] args)
	{
		int price = 65;
		System.out.println(price);
		System.out.println(VariableOverrideTest.price);
		// System.out.println(this.price);
		new VariableOverrideTest().info();
		//VariableOverrideTest.info();
	}

	public void info()
	{
		String name = "查理芒格";
		System.out.println(name);
		System.out.println(this.name);	
	}
}