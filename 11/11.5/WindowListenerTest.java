import java.awt.*;
import java.awt.event.*;

public class WindowListenerTest
{
    private Frame f = new Frame("测试窗口");
    private TextArea ta = new TextArea(6, 40);
    public void init()
    {
        f.addWindowListener(new  MyListener());
        f.add(ta);
        f.pack();
        f.setVisible(true);
    }

    class MyListener implements WindowListener
    {
        public void windowActivated(WindowEvent e)
        {
            ta.append("窗口被激活\n");
        }

        public void windowClosed(WindowEvent e)
        {
            ta.append("窗口被成功关闭\n");
        }

        public void windowClosing(WindowEvent e)
        {
            ta.append("用户关闭窗口\n");
            System.exit(0);
        }

        public void windowDeactivated(WindowEvent e)
        {
            ta.append("窗口失去焦点\n");
        }

        public void windowDeiconified(WindowEvent e)
        {
            ta.append("窗口被恢复\n");
        }

        public void windowIconified(WindowEvent e)
        {
            ta.append("窗口被最小化\n");
        }

        public void windowOpened(WindowEvent e)
        {
            ta.append("窗口初次被打开\n");
        }
    }
    public static void main(String[] args)
    {
        new WindowListenerTest().init();
    }
}
