import java.awt.*;
import java.awt.event.*;

public class WindowAdapterTest
{
    private Frame f = new Frame("���Դ���");
    private TextArea ta = new TextArea(10, 30);
    public void init()
    {
        f.addWindowListener(new MyListener());
        f.add(ta);
        f.pack();
        f.setVisible(true);
    }

    class MyListener extends WindowAdapter
    {
        public void windowClosing(WindowEvent e)
        {
            ta.append("�û����ڹرմ���\n");
            System.exit(0);
        }
    }

    public static void main(String[] args)
    {
        new WindowAdapterTest().init();
    }
}
