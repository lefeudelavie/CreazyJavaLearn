
class PersonTest
{
	public static void main(String[] args)
	{
		Person p = new Person();
		p.setAge(1000);
		System.out.println("未能设置age时，age为：" + p.getAge());

		p.setAge(30);
		System.out.println("成功设置age后，age为：" + p.getAge());

		p.setName("安宇");
		System.out.println("成功设置name成员变量后:" + p.getName());
	}
}