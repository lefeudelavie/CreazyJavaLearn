public class Cow
{
	private double weight;
	public Cow() {};
	public Cow(double weight)
	{
		this.weight = weight;
	}

	private class CowLeg
	{
		private String color;
		private double length;
		public CowLeg() {};
		public CowLeg(String color, double length)
		{
			this.color = color;
			this.length = length;
		}

		public void info()
		{
			System.out.println("牛腿长" + length + "厘米," + color + "色。");
			System.out.println("牛腿所在牛重:" + weight + "斤");
		}
	}

	public void test()
	{
		CowLeg cl = new CowLeg("黄", 30.5);
		cl.info();
	}

	public static void main(String[] args)
	{
		Cow c = new Cow(955.5);
		c.test();
	}

}