interface Output
{
	int MAX_CACHE_LINE = 50;

	void getData(String msg);
	void out();

	default void print(String...msgs) 
	{
		for (String msg:msgs)
		{
			System.out.println(msg);
		}
	}

	default void test()
	{
		System.out.println("接口里的默认方法test()。");
	}

	static void staticTest()
	{
		System.out.println("接口里的类方法。");
	}


}


interface Product
{
	int getProduceTime();
}


public class Printer implements Output, Product
{

	private String[] printData = new String[MAX_CACHE_LINE];
	private int dataNum;

	public void out()
	{
		while ( dataNum > 0)
		{
			System.out.println("打印机打印：" + printData[0] );
			System.arraycopy(printData, 1, printData, 0, --dataNum);
		}
	}

	public void getData(String msg)
	{
		if (dataNum >= MAX_CACHE_LINE)
		{
			System.out.print("输出队列已满，添加失败");
		}
		else
		{
			printData[dataNum++] = msg; 
		}
	}

	public int getProduceTime()
	{
		return 45;
	}


	public static void main(String[] args)
	{
		Output o = new Printer();
		o.getData("Hello world，你好世界！");
		o.getData("Java流行全球.");
		o.out();
		o.getData("Bon jour, java.你好 java");
		o.getData("Java排名");
		o.out();
		o.print("葫芦娃","互撸娃","雷神");
		o.test();
		Product p = new Printer();
		System.out.println(p.getProduceTime());
		Object obj = p;	
	}
}

