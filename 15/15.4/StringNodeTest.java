import java.io.*;

public class StringNodeTest
{
    public static void main(String[] args)
    {
        String src = "从明天起，做一个幸福的人\n"
            + "喂马，劈材，周游世界\n"
            + "从明天起，关心蔬菜和粮食\n"
            + "我有一所房子，面朝大海，春暖花开\n"
            + "从明天起，和每一个亲人通信\n"
            + "告诉他们我的幸福\n";
        char[] buffer = new char[32];
        int hasRead = 0 ;
        try(
           StringReader sr = new StringReader(src) )
        {
            while((hasRead = sr.read(buffer)) > 0)
            {
                System.out.print(new String(buffer, 0, hasRead));
            }
        }
        catch (IOException ioe)
        {
            ioe.printStackTrace();
        }
        try(
            StringWriter sw = new StringWriter())
        {
            sw.write("有一个美丽的新世界，\n");
            sw.write("她在远方等我，\n");
            sw.write("那里有天真的孩子，\n");
            sw.write("还有姑娘的酒窝\n");
            System.out.println("----下面是sw字符串节点里的内容---");
            System.out.println(sw.toString());
        }
        catch (IOException ioe)
        {
            ioe.printStackTrace();
        }
    }
}
