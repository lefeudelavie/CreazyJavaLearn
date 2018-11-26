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

public class Sub extends Base
{
	public String color;
	public Sub(double size, String name, String color)
	{
		super(size, name);
		this.color = color;
	}

	public static void main(String[] args)
	{
		Sub s = new Sub(3.56, "alex", "red");
		System.out.println("名字：" + s.name + " size：" + s.size + " 颜色：" + s.color);
			
	}
}
