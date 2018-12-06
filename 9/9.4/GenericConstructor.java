class Foo
{
     public <T> Foo(T t)
     {
	 System.out.println(t);
     }
}


public class GenericConstructor
{
    public static void main(String[] args)
    {
	 new Foo("疯狂构造器");
	 new Foo(8.29);
	 new <String> Foo("xxx");
	 //new <String> Foo(3);
    }
}
