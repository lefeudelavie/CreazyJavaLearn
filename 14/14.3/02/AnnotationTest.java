import javax.swing.*;
import java.awt.event.*;


public class AnnotationTest
{
    private JFrame mainWin = new JFrame("ʹ��ע����¼�������"); 

    @ActionListenerFor(listener=OkListener.class)
    private JButton ok = new JButton("ȷ��");
    @ActionListenerFor(listener=CancelListener.class)
    private JButton cancel = new JButton("ȡ��");
    
    public void init()
    {
        JPanel jp = new JPanel();
        jp.add(ok);
        jp.add(cancel);
        mainWin.add(jp);
        ActionListenerInstaller.processAnnotations(this);
        mainWin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWin.pack();
        mainWin.setVisible(true);
    }

    public static void main(String[] args)
    {
        new AnnotationTest().init();
    }

}

class OkListener implements ActionListener
{
    public void actionPerformed(ActionEvent evt)
    {
        JOptionPane.showMessageDialog(null, "������ȷ�ϰ�ť");
    }
}

class CancelListener implements ActionListener
{
    public void actionPerformed(ActionEvent evt)
    {
        JOptionPane.showMessageDialog(null, "������ȡ����ť");
    }
}
