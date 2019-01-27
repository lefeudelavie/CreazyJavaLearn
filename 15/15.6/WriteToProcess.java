import java.io.*;
import java.util.*;

public class WriteToProcess
{
    public static void main(String[] args)
        throws IOException
    {
        Process p = Runtime.getRuntime().exec("java ReadStandard");
        try(
            PrintStream ps = new PrintStream(p.getOutputStream()))
        {
            ps.println("��ͨ�ַ���");
            ps.println(new WriteToProcess());
        }
    }
}


class ReadStandard
{
    public static void main(String[] args)
    {
        try(
            Scanner sc = new Scanner(System.in);
            PrintStream ps = new PrintStream(
            new FileOutputStream("out.txt")))
        {
            sc.useDelimiter("\n");
            while(sc.hasNext())
            {
                ps.println("��������������ǣ�" + sc.next());
            }
        }
        catch(IOException ioe)
        {
            ioe.printStackTrace();
        }
    }
}
