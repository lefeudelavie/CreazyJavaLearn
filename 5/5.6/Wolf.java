class Creature
{
	public Creature()
	{
		System.out.println("Creatur无参数的构造器");
	}
}


class Animal extends Creature
{
	public Animal(String name)
	{
		System.out.println("Animal 带一个参数的构造器," + "该动物的名字为：" + name);
	}

	public Animal(String name, int age)
	{
		this(name);
		System.out.println("Animal 带两个参数的构造器," + "它的age为：" + age);
	}
}


class Wolf extends Animal
{
	public Wolf()
	{
		super("老狼", 5);
		System.out.println("Wolf 无参数的构造器");
	}

	public static void main(String[] args)
	{
		new Wolf();
	}
}
