import java.awt.*;
import java.awt.event.*;

public class AnonymousEventHandler
{
    private Frame f = new Frame("���Դ���");
    private TextField tf = new TextField(50);
    public void init()
    {
        f.add(tf);
        f.addWindowListener(new WindowAdapter()
                {
                    public void windowClosing(WindowEvent e)
                    {
                        System.out.println("�û����ڹرմ���\n");
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