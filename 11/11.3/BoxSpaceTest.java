import java.awt.*;
import javax.swing.*;

public class BoxSpaceTest
{
    private Frame f = new Frame("���Դ���");
    private Box horizontal = Box.createHorizontalBox();
    private Box vertical = Box.createVerticalBox();
   
    public void init()
    {
        horizontal.add(new Button("��һ����ť"));

        horizontal.add(Box.createHorizontalGlue());
        horizontal.add(new Button("�ڶ�����ť"));

        horizontal.add(Box.createHorizontalStrut(10));
        horizontal.add(new Button("��������ť"));

        vertical.add(new Button("��һ����ť"));

        vertical.add(Box.createVerticalGlue());
        vertical.add(new Button("�ڶ�����ť"));

        vertical.add(Box.createVerticalStrut(10));
        vertical.add(new Button("��������ť"));
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