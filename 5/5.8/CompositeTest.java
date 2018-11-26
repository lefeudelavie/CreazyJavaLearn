class Animal
{
	private void beat()
	{

		System.out.println("心儿扑通扑通的跳。");
	}

	public void breath()
	{
		beat();
		System.out.println("呼气，吸气。");
	}

}


class Bird
{
	private Animal a;
	public  Bird(Animal a1)
	{
		this.a = a1;
	}

	public void breath()
	{
		a.breath();
	}

	public void fly()
	{
		System.out.println("飞翔在蓝天。");
	}
}


class Wolf
{
	private Animal a;
	public  Wolf(Animal a1)
	{
		this.a = a1;
	}

	public void breath()
	{
		a.breath();
	}

	public void run()
	{
		System.out.println("奔跑在草原。");
	}
}

public class CompositeTest
{
	public static void main(String[] args)
	{
		Animal a = new Animal();
		Bird b = new Bird(a);
		b.breath();
		b.fly();

		Wolf w = new Wolf(a);
		w.breath();
		w.run();

	}
}
