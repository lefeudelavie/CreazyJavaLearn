import java.io.*;

public class Person
    implements java.io.Serializable
{
    private String name;
    private int age;
    public Person(String name, int age)
    {
        System.out.println("�в����Ĺ�����");
        this.name = name;
        this.age = age;
    }
}
