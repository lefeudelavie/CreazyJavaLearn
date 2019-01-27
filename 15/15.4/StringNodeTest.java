import java.io.*;

public class StringNodeTest
{
    public static void main(String[] args)
    {
        String src = "����������һ���Ҹ�����\n"
            + "ι�������ģ���������\n"
            + "�������𣬹����߲˺���ʳ\n"
            + "����һ�����ӣ��泯�󺣣���ů����\n"
            + "�������𣬺�ÿһ������ͨ��\n"
            + "���������ҵ��Ҹ�\n";
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
            sw.write("��һ�������������磬\n");
            sw.write("����Զ�����ң�\n");
            sw.write("����������ĺ��ӣ�\n");
            sw.write("���й���ľ���\n");
            System.out.println("----������sw�ַ����ڵ��������---");
            System.out.println(sw.toString());
        }
        catch (IOException ioe)
        {
            ioe.printStackTrace();
        }
    }
}