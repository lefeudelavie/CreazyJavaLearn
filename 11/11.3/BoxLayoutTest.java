import java.awt.*;
import javax.swing.*;

public class BoxLayoutTest
{
    Frame f = new Frame("测试窗口");
    public void init()
    {
        f.setLayout(new BoxLayout(f, BoxLayout.Y_AXIS));

        f.add(new Button("第一个按钮"));
        f.add(new Button("第二个按钮"));
        f.pack();
        f.setVisible(true);
    }
    public static void main(String[] args)
    {
        new BoxLayoutTest().init();
    }
    
}
