import java.awt.*;
import javax.swing.*;

public class BoxLayoutTest
{
    Frame f = new Frame("���Դ���");
    public void init()
    {
        f.setLayout(new BoxLayout(f, BoxLayout.Y_AXIS));

        f.add(new Button("��һ����ť"));
        f.add(new Button("�ڶ�����ť"));
        f.pack();
        f.setVisible(true);
    }
    public static void main(String[] args)
    {
        new BoxLayoutTest().init();
    }
    
}