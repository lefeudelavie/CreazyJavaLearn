import java.awt.*;

public class ScrollPanelTest
{
    public static void main(String[] args)
    {
        Frame f = new Frame("ScrollPane����");
        ScrollPane sp = new ScrollPane(
                ScrollPane.SCROLLBARS_ALWAYS);
        sp.add(new TextField(20));
        sp.add(new Button("����˴�"));
        f.add(sp);
        f.setBounds(300,300,300,300);
        f.setVisible(true);

    }
}
