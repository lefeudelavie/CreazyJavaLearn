import java.io.*;

public class ThrowsTest2
{
    public static void main(String[] args) throws Exception
    {
        test();
    }

    public static void test() throws IOException
    {
        FileInputStream fi = new FileInputStream("a.txt");
    }
}
