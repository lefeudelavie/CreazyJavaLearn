import java.io.*;

public class OverrideThrows
{
    public void test() throws IOException
    {
        FileInputStream fi = new FileInputStream("a.txt");
    }
}

class Sub extends OverrideThrows
{
    public void test() throws Exception
    {

    }
}
