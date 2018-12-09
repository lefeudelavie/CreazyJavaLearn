import java.awt.*;

public class SendMailer
{
    private Frame f = new Frame("²âÊÔ´°¿Ú");
    private TextField tf = new TextField(20);
    private Button b = new Button("·¢ËÍÓÊ¼ş");

    public void init()
    {
        b.addActionListener(new MailListener(tf));
        f.add(tf);
        f.add(b, BorderLayout.SOUTH);
        f.pack();
        f.setVisible(true);
    }

    public static void main(String[] args)
    {
        new SendMailer().init();
    }
}
