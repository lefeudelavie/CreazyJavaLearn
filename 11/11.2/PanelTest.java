import java.awt.*;

public class PanelTest
{
    public static void main(String[] args)
    {
        Frame f = new Frame("测试窗口");
        Panel p = new Panel();
        p.add(new TextField(20));
        p.add(new Button("点击此处"));
        f.add(p);
        f.setBounds(300,300,300,300);
        f.setVisible(true);
    }
}
