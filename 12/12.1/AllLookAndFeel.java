import javax.swing.*;

public class AllLookAndFeel
{
    public static void main(String[] args)
    {
        System.out.println("��ǰϵͳ���п��õ�LAF:");
        for (UIManager.LookAndFeelInfo info:
                UIManager.getInstalledLookAndFeels())
        {
            System.out.println(info.getName()
                    + "--->" + info);
        }
    }
}
