@FunctionalInterface
public interface FunInterface
{
    static void foo()
    {
        System.out.println("foo类方法");
    }
    default void bar()
    {
        System.out.println("bar默认方法");
    }
    void test(); //抽象方法
    void abc();
}
