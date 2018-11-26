interface Product
{
	public int getPrice();
	public String getName();
}

public class AnonymousTest
{
	public void test(Product p)
	{
		System.out.println("产品名：" + p.getName() + "。的价格是：" + p.getPrice() );
	}

	public static void main(String[] args)
	{
		new AnonymousTest().test(new Product()
		{
			public int getPrice()
			{
				return 56;
			}

			public String getName()
			{
				return "蓝心";
			}
		})	;
	}
}