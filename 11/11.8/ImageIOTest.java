import javax.imageio.*;

public class ImageIOTest
{
    public static void main(String[] args)
    {
        String[] readFormat = ImageIO.getReaderFormatNames();
        System.out.println("-----Image�ܶ��������ļ���ʽ----");
        for ( String tmp: readFormat)
        {
            System.out.println(tmp);
        }
        String[] writeFormat = ImageIO.getWriterFormatNames();
        System.out.println("-----Image��д�������ļ���ʽ----");
        for ( String tmp: writeFormat)
        {
            System.out.println(tmp);
        }

    }
}
