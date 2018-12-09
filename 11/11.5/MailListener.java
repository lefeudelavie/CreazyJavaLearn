import java.awt.*;
import java.awt.event.*;


public class MailListener implements ActionListener
{
    private TextField MailAddress;
    public MailListener(){};

    public MailListener(TextField MailAddress) 
    {
        this.MailAddress = MailAddress; 
    }

    public void setMailAddress(TextField MailAddress)
    {
        this.MailAddress = MailAddress;
    }
    public void actionPerformed(ActionEvent e)
    {
        System.out.println("正在向“" + MailAddress.getText() + "”发送邮件。");
    }
}
