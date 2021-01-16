import java.io.*;
import java.util.*;

public class Person
    implements java.io.Serializable
{
    private String name;
    private int age;

    public Person(String name, int age)
    {
	System.out.println("有参数的构造器");
	this.name = name;
	this.age = age;
    }

    public String getName()
    {
	return this.name;
    }

    public int getAge()
    {
	return this.age;
    }

    public void setName(String name)
    {
	this.name = name;
    }

    public void setAge(int age)
    {
	this.age = age;
    }

    private Object writeReplace() throws ObjectStreamException
    {
	ArrayList<Object> list = new ArrayList<Object>();
	list.add(name);
	list.add(age);
	return list;
    }
}
