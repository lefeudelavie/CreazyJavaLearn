import java.awt.*;
import javax.swing.*;

public class BoxTest
{
    private Frame f = new Frame("测试窗口");
    private Box horizontal = Box.createHorizontalBox();
    private Box vertical = Box.createVerticalBox();
   
    public void init()
    {
        horizontal.add(new Button("第一个按钮"));
        horizontal.add(new Button("第二个按钮"));
        vertical.add(new Button("第一个按钮"));
        vertical.add(new Button("第二个按钮"));
        f.add(horizontal, BorderLayout.NORTH);
        f.add(vertical);
        f.pack();
        f.setVisible(true);
    }


    public static void main(String[] args)
    {
        new BoxTest().init();
    }
}
