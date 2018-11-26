public class DiscernVariable
{
	private String prop;
	public DiscernVariable() {};
	public DiscernVariable(String prop)
	{
		this.prop = prop;
	}

	private class InnerClass
	{
		private String prop;
		public InnerClass() {};
		public InnerClass(String prop) 
		{
			this.prop = prop;
		}

		public void info()
		{
			String prop = "局部变量";
			System.out.println("访问内部类的同名成员变量： prop is:" + this.prop);
			System.out.println("访问外部类的同名成员变量： prop is:" + DiscernVariable.this.prop);
			System.out.println("访问内部类的同名局部变量： prop is:" + prop);
		}
	}

	public void test()
	{
		InnerClass ic = new InnerClass("内部类");
		ic.info();
	}

	public static void main(String[] args)
	{
		new DiscernVariable("外部类").test();
	}
}