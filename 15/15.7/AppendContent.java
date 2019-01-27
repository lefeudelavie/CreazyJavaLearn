import java.io.*;

public class AppendContent
{
    public static void main(String[] args)
    {
        try(
            RandomAccessFile raf = new RandomAccessFile("out.txt", "rw"))
        {
            raf.seek(raf.length());
            raf.write("×·¼ÓµÄÄÚÈÝ£¡\r\n".getBytes());
        }
        catch(IOException ex)
        {
            ex.printStackTrace();
        }
    }
}
