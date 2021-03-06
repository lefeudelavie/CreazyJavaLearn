import java.awt.*;

public class FileDialogTest
{
    Frame f = new Frame("测试窗口");
    FileDialog fd1 = new FileDialog(f, "选择需要打开的文件", FileDialog.LOAD);
    FileDialog fd2 = new FileDialog(f, "选择需要打开的文件", FileDialog.SAVE);
    Button b1 = new Button("打开文件");
    Button b2 = new Button("保存文件");

    public void init()
    {
        b1.addActionListener(e ->
                {
                    fd1.setVisible(true);
                    System.out.println(fd1.getDirectory() + 
                            fd1.getFile());
                });
        b2.addActionListener(e ->
                {
                    fd2.setVisible(true);
                    System.out.println(fd1.getDirectory() + 
                            fd1.getFile());
                });
        f.add(b1);
        f.add(b2, BorderLayout.SOUTH);
        f.pack();
        f.setVisible(true);
    }

    public static void main(String[] args)
    {
        new FileDialogTest().init();
    }
}
