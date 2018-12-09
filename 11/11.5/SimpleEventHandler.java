import java.awt.*;
import java.awt.event.*;

public class SimpleEventHandler extends WindowAdapter
{
    private Frame f = new Frame("���Դ���");
    private TextArea ta = new TextArea(6, 45);
    public void init()
    {
        f.addWindowListener(this);
        f.add(ta);
        f.pack();
        f.setVisible(true);
    }

    public void windowClosing(WindowEvent e)
    {
        System.out.println("�û����ڹرմ���!\n");
        System.exit(0);
    }

    public static void main(String[] args)
    {
        new SimpleEventHandler().init();
    }
}
