class Apple
{
    @Deprecated
    public void info()
    {
        System.out.println("Info method for apple");
    }
}

public class DeprecatedTest
{
    public static void main(String[] args)
    {
        new Apple().info();
    }
}

