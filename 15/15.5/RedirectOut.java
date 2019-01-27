import java.io.*;

public class RedirectOut
{
    public static void main(String[] args)
    {
        try(
            PrintStream ps = new PrintStream(new FileOutputStream("out.txt")))
        {
            System.setOut(ps);
            System.out.println("ÆÕÍ¨×Ö·û´®");
            System.out.println(new RedirectOut());
        }
        catch (IOException ioe)
        {
            ioe.printStackTrace();
        }

    }
}
