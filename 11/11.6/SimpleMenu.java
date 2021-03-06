import java.awt.*;
import java.awt.event.*;

public class SimpleMenu
{
    private Frame f = new Frame("测试窗口");
    private TextArea ta = new TextArea(6, 40);
    
    private MenuBar mb = new MenuBar();

    private Menu file = new Menu("文件");
    private MenuItem newItem = new MenuItem("新建");
    private MenuItem saveItem = new MenuItem("保存");
    private MenuItem exitItem = new MenuItem("退出"
            ,new MenuShortcut(KeyEvent.VK_X));

    private Menu edit = new Menu("编辑");
    private CheckboxMenuItem autoWrap = new CheckboxMenuItem("自动换行");
    private MenuItem copy = new MenuItem("复制");
    private MenuItem paste = new MenuItem("粘贴");
    
    private Menu format = new Menu("格式");
    private MenuItem comment = new MenuItem("注释", 
            new MenuShortcut(KeyEvent.VK_SLASH, true));
    private MenuItem uncomment = new MenuItem("取消注释");

    public void init()
    {
        ActionListener menuListener = e ->
        {
            String cmd = e.getActionCommand();
            ta.append("单击“" + cmd +  "”菜单" + "\n");
            if (cmd.equals("退出"))
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
                        System.out.println("用户正在关闭窗口!");
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
