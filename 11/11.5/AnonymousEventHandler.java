import java.awt.*;
import java.awt.event.*;

public class AnonymousEventHandler
{
    private Frame f = new Frame("测试窗口");
    private TextField tf = new TextField(50);
    public void init()
    {
        f.add(tf);
        f.addWindowListener(new WindowAdapter()
                {
                    public void windowClosing(WindowEvent e)
                    {
                        System.out.println("用户正在关闭窗口\n");
                        System.exit(0);
                    }
                });
        f.pack();
        f.setVisible(true);
    }
    public static void main(String[] args)
    {
        new AnonymousEventHandler().init();
    }
}
