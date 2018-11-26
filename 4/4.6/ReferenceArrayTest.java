class Person
{
	public int age;
	public float height;
	public void info()
	{
		System.out.println("My age is:" + age + " My height is:" + height);
	}
}

public class ReferenceArrayTest
{
	public static void main(String[] args)
	{
		Person[] students;
		students = new Person[2];
		Person zhang = new Person();
		zhang.age = 15;
		zhang.height = 1.77f;
		Person wang = new Person();
		wang.age = 20;
		wang.height = 1.8f;
		students[0] = zhang;
		students[1] = wang;
		zhang.info();
		students[0].info();
	}
}