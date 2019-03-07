import java.io.*;

public class Person
    implements java.io.Serializaable
{
    private String name;
    private int age;

    public Person(String name, int age)
    {
	System.out.println("有参数构造器");
	this.name = name;
	this.age = age;
    }


}
