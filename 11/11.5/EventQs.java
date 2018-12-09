import java.awt.*;
import java.awt.event.*;

public class EventQs
{
    Frame f = new Frame("���Դ���");
    Button ok = new Button("�����ʾ");
    TextField tf = new TextField(30);

    public void init()
    {
        ok.addActionListener(new okListener());
        f.add(tf);
        f.add(ok, BorderLayout.SOUTH);
        f.pack();
        f.setVisible(true);
    }

    class okListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            System.out.println("User has pressed the ok button.");
            tf.setText("This is it");
        }
    }

    public static void main(String[] args)
    {
        new EventQs().init();
    }
}
