import java.awt.*;
import javax.swing.*;

public class BoxSpaceTest
{
    private Frame f = new Frame("测试窗口");
    private Box horizontal = Box.createHorizontalBox();
    private Box vertical = Box.createVerticalBox();
   
    public void init()
    {
        horizontal.add(new Button("第一个按钮"));

        horizontal.add(Box.createHorizontalGlue());
        horizontal.add(new Button("第二个按钮"));

        horizontal.add(Box.createHorizontalStrut(10));
        horizontal.add(new Button("第三个按钮"));

        vertical.add(new Button("第一个按钮"));

        vertical.add(Box.createVerticalGlue());
        vertical.add(new Button("第二个按钮"));

        vertical.add(Box.createVerticalStrut(10));
        vertical.add(new Button("第三个按钮"));
        f.add(horizontal, BorderLayout.NORTH);
        f.add(vertical);
        f.pack();
        f.setVisible(true);
    }


    public static void main(String[] args)
    {
        new BoxSpaceTest().init();
    }
}
