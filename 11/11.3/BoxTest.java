import java.awt.*;
import javax.swing.*;

public class BoxTest
{
    private Frame f = new Frame("���Դ���");
    private Box horizontal = Box.createHorizontalBox();
    private Box vertical = Box.createVerticalBox();
   
    public void init()
    {
        horizontal.add(new Button("��һ����ť"));
        horizontal.add(new Button("�ڶ�����ť"));
        vertical.add(new Button("��һ����ť"));
        vertical.add(new Button("�ڶ�����ť"));
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