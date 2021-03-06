import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class BindKeyTest
{
    JFrame jf = new JFrame("���Լ��̰�");
    JTextArea jta = new JTextArea(5, 30);
    JButton jb = new JButton("����");
    JTextField jtf = new JTextField(15);

    public void init()
    {
        jf.add(jta);
        JPanel jp = new JPanel();
        jp.add(jtf);
        jp.add(jb);
        jf.add(jp, BorderLayout.SOUTH);

        Action sendMsg = new AbstractAction()
        {
            public void actionPerformed(ActionEvent e)
            {
                jta.append(jtf.getText() + "\n");
                jtf.setText("");
            }
        };

        jb.addActionListener(sendMsg);
        jtf.getInputMap().put(KeyStroke.getKeyStroke('\n'
                    ,java.awt.event.InputEvent.CTRL_MASK), "send");
        jtf.getActionMap().put("send", sendMsg);
        jf.pack();
        jf.setVisible(true);
    }

    public static void main(String[] args)
    {
        new BindKeyTest().init();
    }
}
