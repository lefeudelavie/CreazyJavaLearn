import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingComponent
{
    JFrame f = new JFrame("Swing测试");

    Icon okIcon = new ImageIcon("ico/ok.png");
    JButton ok = new JButton("确认", okIcon);
    JRadioButton male = new JRadioButton("男", true);
    JRadioButton female = new JRadioButton("女", false);
    
    ButtonGroup bg = new ButtonGroup();

    JCheckBox married = new JCheckBox("是否已婚", false);
    
    String[] colors = new String[]{"红色", "绿色", "蓝色"};

    JComboBox<String> colorChooser = new JComboBox<>(colors);

    JList<String> colorList = new JList<>(colors);

    JTextArea ta = new JTextArea(8, 20);

    JTextField name = new JTextField(40);

    JMenuBar mb = new JMenuBar();
    JMenu file = new JMenu("文件");
    JMenu edit = new JMenu("编辑");

    Icon newIcon = new ImageIcon("ico/new.png");
    JMenuItem newItem = new JMenuItem("新建", newIcon);

    Icon saveIcon = new ImageIcon("ico/save.png");
    JMenuItem saveItem = new JMenuItem("保存", saveIcon);

    Icon exitIcon = new ImageIcon("ico/exit.png");
    JMenuItem exitItem = new JMenuItem("退出", exitIcon);
    JCheckBoxMenuItem autoWrap = new JCheckBoxMenuItem("自动换行");
    
    JMenuItem copyItem = new JMenuItem("复制"
            , new ImageIcon("ico/copy.png"));

    JMenuItem pasteItem = new JMenuItem("粘贴"
            , new ImageIcon("ico/paste.png"));

    JMenu format = new JMenu("格式");
    JMenuItem commentItem = new JMenuItem("注释");
    JMenuItem cancelItem = new JMenuItem("取消注释");

    JPopupMenu pop = new JPopupMenu();
    ButtonGroup flavorGroup = new ButtonGroup();

    JRadioButtonMenuItem metalItem = new JRadioButtonMenuItem("metal风格", true);
    JRadioButtonMenuItem nimbusItem = new JRadioButtonMenuItem("Nimbus风格");
    JRadioButtonMenuItem windowsItem = new JRadioButtonMenuItem("Windows风格");
    JRadioButtonMenuItem classicItem = new JRadioButtonMenuItem("Windows经典风格");
    JRadioButtonMenuItem motifItem = new JRadioButtonMenuItem("Motif风格");

    public void init()
    {
        JPanel bottom = new JPanel();
        bottom.add(name);
        bottom.add(ok);
        f.add(bottom, BorderLayout.SOUTH);

        JPanel checkPanel = new JPanel();
        checkPanel.add(colorChooser);
        bg.add(male);
        bg.add(female);
        checkPanel.add(male);
        checkPanel.add(female);
        checkPanel.add(married);

        Box topLeft = Box.createVerticalBox();
        
        JScrollPane taJsp = new JScrollPane(ta);
        topLeft.add(taJsp);
        topLeft.add(checkPanel);
        Box top = Box.createHorizontalBox();
        top.add(topLeft);
        top.add(colorList);

        f.add(top);
        
        newItem.setAccelerator(KeyStroke.getKeyStroke('N'
                    , InputEvent.CTRL_MASK));
        newItem.addActionListener(e -> ta.append("用户单击了“新建”菜单\n"));

        file.add(newItem);
        file.add(saveItem);
        file.add(exitItem);

        edit.add(autoWrap);
        edit.addSeparator();
        edit.add(copyItem);
        edit.add(pasteItem);
        commentItem.setToolTipText("将程序代码注释起来!");

        format.add(commentItem);
        format.add(cancelItem);

        edit.add(new JMenuItem("-"));
        edit.add(format);

        mb.add(file);
        mb.add(edit);

        f.setJMenuBar(mb);
        flavorGroup.add(metalItem);
        flavorGroup.add(nimbusItem);
        flavorGroup.add(windowsItem);
        flavorGroup.add(classicItem);
        flavorGroup.add(motifItem);
        pop.add(metalItem);
        pop.add(nimbusItem);
        pop.add(windowsItem);
        pop.add(classicItem);
        pop.add(motifItem);
        
        ActionListener flavorListener = e -> {
            try
            {
                switch(e.getActionCommand())
                {
                    case "Metal风格":
                        changeFlavor(1);
                        break;
                    case "Nimbus风格":
                        changeFlavor(2);
                        break;
                    case "Windows风格":
                        changeFlavor(3);
                        break;
                    case "Windows 经典风格":
                        changeFlavor(4);
                        break;
                    case "Motif风格":
                        changeFlavor(5);
                        break;

                }
            }
            catch (Exception ee)
            {
                ee.printStackTrace();
            }
        };

        metalItem.addActionListener(flavorListener);
        nimbusItem.addActionListener(flavorListener);
        windowsItem.addActionListener(flavorListener);
        classicItem.addActionListener(flavorListener);
        motifItem.addActionListener(flavorListener);
        
        ta.setComponentPopupMenu(pop);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.pack();
        f.setVisible(true);

    }

    public void changeFlavor(int flavor) throws Exception
    {
        switch (flavor)
        {
            case 1:
                UIManager.setLookAndFeel(
                "javax.swing.plaf.metal.MetalLookAndFeel");
                break;
            case 2:
                UIManager.setLookAndFeel(
                "javax.swing.plaf.nimbus.NimbusLookAndFeel");
                break;
            case 3:
                UIManager.setLookAndFeel(
                "com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
                break;
            case 4:
                UIManager.setLookAndFeel(
                "com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel");
                break;
            case 5:
                UIManager.setLookAndFeel(
                "com.sun.java.swing.plaf.motif.MotifLookAndFeel");
                break;
        }

        SwingUtilities.updateComponentTreeUI(f.getContentPane());
        SwingUtilities.updateComponentTreeUI(mb);
        SwingUtilities.updateComponentTreeUI(pop);
    }

    public static void main(String[] args)
    {
        //JFrame.setDefaultLookAndFeelDecorated(true);
        new SwingComponent().init();
    }
}
