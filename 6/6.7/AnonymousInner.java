abstract class Device
{
	private String name;
	abstract double getPrice();

	public Device() {};
	public Device(String name)
	{
		this.name = name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return this.name;
	}

}


public class AnonymousInner
{
	public void test(Device d)
	{
		System.out.println("设备" + d.getName() + "的价格是:" + d.getPrice());
	}

	public static void main(String[] args)
	{
		AnonymousInner a = new AnonymousInner();
		a.test(new Device("收音机")
		{
			public double getPrice()
			{
				return 65.1; 
			}
		});

		Device d = new Device()
		{
			{
				System.out.println("匿名内部类的初始化块...");
			}

			public double getPrice()
			{
				return 55.3;
			}

			public String getName()
			{
				return "电子秤";
			}
		};

		a.test(d);
	}
}