public class Fruit
{
    public void info()
    {
        System.out.println("水果的info方法...");
    }
}
class Apple extends Fruit
{
    @Override
    public void inf0()
    {
        System.out.println("苹果重写水果的info方法...");
    }
}
