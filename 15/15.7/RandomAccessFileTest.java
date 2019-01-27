import java.io.*;

public class RandomAccessFileTest
{
    public static void main(String[] args)
    {
        try(
            RandomAccessFile raf = new RandomAccessFile(
                "RandomAccessFileTest.java" , "r"))
        {
            System.out.println("RandomAccessFile���ļ�ָ��ĳ�ʼλ�ã�"
                    + raf.getFilePointer());
            raf.seek(300);
            byte[] bbuf = new byte[1024];
            int hasRead = 0;
            while((hasRead = raf.read(bbuf)) > 0)
            {
                System.out.print(new String(bbuf, 0, hasRead));
            }
        }
        catch(IOException ioe)
        {
            ioe.printStackTrace();
        }
    }
}
