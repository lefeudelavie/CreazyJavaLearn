interface Eatable
{
	public void taste();
}

interface Flyable
{
	public void fly(String weather);
}

interface Addable
{
	public int add(int a, int b);
}


public class LambdaQs
{
	public void eat(Eatable e)
	{
		System.out.println(e);
		e.taste();
	}

	public void drive(Flyable f)
	{
		System.out.println(f);
		f.fly("阳光明媚，万里无云。");
	}

	public void compute(Addable a)
	{
		System.out.println("3 + 5 的和为:"+ a.add(3,5));
	}

	public static void main(String[] args)
	{
		LambdaQs lq = new LambdaQs();
		lq.eat(()->{
			System.out.println("尝起来真不错。");
		});
		lq.drive((weather)->{
			System.out.println("飞翔在："+weather);
		});
		lq.compute((a,b)->a+b);
	}
}