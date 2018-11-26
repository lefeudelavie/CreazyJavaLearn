interface interfaceA
{
	int PROP_A = 1;
	void test();
}

interface interfaceB
{
	int PROP_B = 2;
	void test();
}

interface interfaceC extends interfaceA, interfaceB
{
	int PROP_C = 3;
	void test();
}


public class InterfaceExtendsTest
{
	public static void main(String[] args)
	{
		System.out.println(interfaceC.PROP_A);
		System.out.println(interfaceC.PROP_B);
		System.out.println(interfaceC.PROP_C);
	}
}
