import java.util.*;
import java.io.*;

public class SetPrac
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader inputer = new BufferedReader(new InputStreamReader(System.in));
        HashSet hs = new HashSet();
        String inputStr = null;
        for ( int i = 0 ; i < 20; i++)
        {
             System.out.println("输入字符串:");
             inputStr = inputer.readLine();
             if ( inputStr != null)
                hs.add( inputStr);
             else
                 break;
        }

        System.out.println("输入的字符串集合是：");
        System.out.println(hs);

    }
}
