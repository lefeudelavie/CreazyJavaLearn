import java.awt.*;
import java.awt.event.*;

public class CardLayoutTest
{
    Frame f = new Frame();
    String[] names = {"��һ��", "�ڶ���", "������", 
        "������","������"};

    Panel pl = new Panel();
    public void init()
    {
        final CardLayout c = new CardLayout();
        pl.setLayout(c);
        for (int i = 0; i < names.length; i++)
        {
            pl.add(names[i], new Button(names[i]));
        }
        Panel p = new Panel();
        ActionListener listener = e ->
        {
            switch(e.getActionCommand())
            {
                case "��һ��":
                    c.previous(pl);
                    break;
                case "��һ��":
                    c.next(pl);
                    break;
                case "��һ��":
                    c.first(pl);
                    break;
                case "���һ��":
                    c.last(pl);
                    break;
                case "������":
                    c.show(pl, "������");
                    break;
            }
        };

        Button previous = new Button("��һ��");
        previous.addActionListener(listener);
        Button next = new Button("��һ��");
        next.addActionListener(listener);
        Button first = new Button("��һ��");
        first.addActionListener(listener);
        Button last = new Button("���һ��");
        last.addActionListener(listener);
        Button third = new Button("������");
        third.addActionListener(listener);
        p.add(previous);
        p.add(next);
        p.add(first);
        p.add(last);
        p.add(third);
        
        f.add(pl);
        f.add(p, BorderLayout.SOUTH);
        f.pack();
        f.setVisible(true);

    }

    public static void main(String[] args)
    {
        new CardLayoutTest().init();
    }
}
