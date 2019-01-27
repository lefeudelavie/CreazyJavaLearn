import java.io.*;
import java.util.*;

public class RedirectIn
{
    public static void main(String[] args)
    {
        try(
            FileInputStream fis = new FileInputStream("RedirectIn.java"))
        {
            System.setIn(fis);
            Scanner sc = new Scanner(System.in);
            sc.useDelimiter("\n");
            while(sc.hasNext())
            {
                System.out.println("��������������ǣ�" + sc.next());
            }
        }
        catch (IOException ioe)
        {
            ioe.printStackTrace();
        }
    }
}
