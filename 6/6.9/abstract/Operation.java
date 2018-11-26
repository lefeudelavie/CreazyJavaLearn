public enum Operation
{
	PLUS("加")
	{
		public double eval(double a, double b)
		{
			return a + b;
		}
	},
	MINUS("减")
	{
		public double eval(double a, double b)
		{
			return a - b;
		}

	},
	TIMES("乘")
	{
		public double eval(double a, double b)
		{
			return a * b;
		}

	},
	DIVIDE("除")
	{
		public double eval(double a, double b)
		{
			return a / b;
		}

	};

	private final String name;
	private Operation(String name)
	{
		this.name = name;
	}

	public abstract double eval(double a, double b);
	
	public static void main(String[] args)
	{

		System.out.println(Operation.PLUS.eval(3,5));
		System.out.println(Operation.MINUS.eval(3,5));
		System.out.println(Operation.TIMES.eval(3,5));
		System.out.println(Operation.DIVIDE.eval(3,5));
	}
}