class Parent
{
	public String tag = "测试01";
}

class Derived extends Parent
{
	private String tag = "测试02";
}

public class HideTest
{
	public static void main(String[] args)
	{
		Derived d = new Derived();
		// System.out.println(d.tag);

		System.out.println(((Parent)d).tag );
	}
}