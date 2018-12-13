import java.awt.*;
import java.awt.event.*;

public class SimpleMenu
{
    private Frame f = new Frame("���Դ���");
    private TextArea ta = new TextArea(6, 40);
    
    private MenuBar mb = new MenuBar();

    private Menu file = new Menu("�ļ�");
    private MenuItem newItem = new MenuItem("�½�");
    private MenuItem saveItem = new MenuItem("����");
    private MenuItem exitItem = new MenuItem("�˳�"
            ,new MenuShortcut(KeyEvent.VK_X));

    private Menu edit = new Menu("�༭");
    private CheckboxMenuItem autoWrap = new CheckboxMenuItem("�Զ�����");
    private MenuItem copy = new MenuItem("����");
    private MenuItem paste = new MenuItem("ճ��");
    
    private Menu format = new Menu("��ʽ");
    private MenuItem comment = new MenuItem("ע��", 
            new MenuShortcut(KeyEvent.VK_SLASH, true));
    private MenuItem uncomment = new MenuItem("ȡ��ע��");

    public void init()
    {
        ActionListener menuListener = e ->
        {
            String cmd = e.getActionCommand();
            ta.append("������" + cmd +  "���˵�" + "\n");
            if (cmd.equals("�˳�"))
            {
                System.exit(0);
            }
        };
        newItem.addActionListener(menuListener);
        saveItem.addActionListener(menuListener);
        exitItem.addActionListener(menuListener);
        comment.addActionListener(menuListener);

        file.add(newItem);
        file.add(saveItem);
        file.add(exitItem);
        
        format.add(comment);
        format.add(uncomment);

        edit.add(autoWrap);
        edit.addSeparator();
        edit.add(copy);
        edit.add(paste);
        edit.add(new MenuItem("-"));
        edit.add(format);
        
        mb.add(file);
        mb.add(edit);

        f.setMenuBar(mb);
        f.add(ta);
        f.pack();
        
        f.addWindowListener(new WindowAdapter()
                {
                    public void windowClosing(WindowEvent e)
                    {
                        System.out.println("�û����ڹرմ���!");
                        System.exit(0);
                    }
                });

        f.setVisible(true);

    }

    public static void main(String[] args)
    {
        new SimpleMenu().init();
    }


}