import java.awt.*;

public class FileDialogTest
{
    Frame f = new Frame("���Դ���");
    FileDialog fd1 = new FileDialog(f, "ѡ����Ҫ�򿪵��ļ�", FileDialog.LOAD);
    FileDialog fd2 = new FileDialog(f, "ѡ����Ҫ�򿪵��ļ�", FileDialog.SAVE);
    Button b1 = new Button("���ļ�");
    Button b2 = new Button("�����ļ�");

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