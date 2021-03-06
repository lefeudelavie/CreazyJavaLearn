import java.io.*;
import java.awt.*;
import java.awt.image.*;
import javax.imageio.*;

public class ZoomImage
{
    private final int WIDTH = 80;
    private final int HEIGHT = 60;

    BufferedImage image = new BufferedImage(WIDTH, HEIGHT
            , BufferedImage.TYPE_INT_RGB);
    Graphics g = image.getGraphics();
    public void zoom() throws Exception
    {
        Image srcImage = ImageIO.read(new File("image/board.jpg"));
        g.drawImage(srcImage, 0, 0, WIDTH, HEIGHT, null);
        ImageIO.write(image, "jpeg"
                , new File(System.currentTimeMillis() + ".jpg"));
    }

    public static void main(String[] args) throws Exception
    {
        new ZoomImage().zoom();
    }
}
