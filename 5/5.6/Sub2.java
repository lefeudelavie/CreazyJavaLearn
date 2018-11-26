class Base
{
	public double size;
	public String name;
	public Base(double size,String name)
	{
		this.size = size;
		this.name = name;
	}
}

public class Sub2 extends Base
{
	public String color;
	public double size;
	public String name;
	public Sub2(double size, String name, String color)
	{
		super(7.7, "test" );
		this.size = size;
		this.name = name;
		this.color = color;
	}

	public static void main(String[] args)
	{
		Sub2 s = new Sub2(3.56, "alex", "red");
		System.out.println("名字：" + s.name + " size：" + s.size + " 颜色：" + s.color);

		System.out.println("名字：" + ((Base)s).name + " size：" + ((Base)s).size  );

		Base s2 = (Base)s;
			
		System.out.println("名字：" + s2.name + " size：" + s2.size  );
	}
}
