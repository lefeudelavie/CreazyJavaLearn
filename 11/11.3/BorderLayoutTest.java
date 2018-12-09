import java.awt.*;
import static java.awt.BorderLayout.*;

public class BorderLayoutTest
{
    public static void main(String[] args)
    {
        Frame f = new Frame();
        f.setLayout(new BorderLayout(30, 5));
        f.add(new Button("南"), SOUTH);
        f.add(new Button("北"), NORTH);
        f.add(new Button("中"), CENTER);
        f.add(new Button("东"), EAST);
        f.add(new Button("西"), WEST);
        f.pack();
        f.setVisible(true);
    }
}
