import java.awt.*;
import java.awt.event.*;

public class PopupMenuTest
{
    private TextArea ta = new TextArea(4, 30);
    private Frame f = new Frame("����");
    PopupMenu pop = new PopupMenu();
    
    CheckboxMenuItem autoWrap = new CheckboxMenuItem("�Զ�����");
    MenuItem copyItem = new MenuItem("����");
    MenuItem pasteItem = new MenuItem("ճ��");
    
    Menu format = new Menu("��ʽ");
    MenuItem commentItem = new MenuItem("ע��");
    MenuItem cancelItem = new MenuItem("ȡ��ע��"
            ,new MenuShortcut(KeyEvent.VK_SLASH, true));
    
    public void init()
    {
        ActionListener menuListener = e ->
        {
                String cmd = e.getActionCommand();
                ta.append("������" + cmd + "���˵�" + "\n");
                if (cmd.equals("�˳�"))
                {
                    System.exit(0);
                }
        };

        commentItem.addActionListener(menuListener);
        pop.add(autoWrap);
        pop.addSeparator();
        pop.add(copyItem);
        pop.add(pasteItem);
        pop.add(new MenuItem("-"));

        format.add(commentItem);
        format.add(cancelItem);
        pop.add(format);


        final Panel p = new Panel();
        p.setPreferredSize(new Dimension(300, 160));
        p.add(pop);
        p.addMouseListener(new MouseAdapter()
                {
                    public void mouseReleased(MouseEvent e)
                    {
                        if (e.isPopupTrigger())
                        {
                            pop.show(p, e.getX(), e.getY());
                        }
                    }

                });
        f.add(p);
        f.add(ta, BorderLayout.NORTH);
        f.addWindowListener(new WindowAdapter()
                {
                    public void windowClosing(WindowEvent e)
                    {
                        System.out.println("���ڹرմ���");
                        System.exit(0);
                    }
                });
        f.pack();
        f.setVisible(true);
        
    }

    public static void main(String[] args)
    {
        new PopupMenuTest().init();
    }
}
