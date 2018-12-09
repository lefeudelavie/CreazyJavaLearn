import java.awt.*;
import javax.swing.*;

public class CommonComponent
{
    Frame f = new Frame("²âÊÔ");
    Button ok = new Button("ºÃ");

    CheckboxGroup cbg = new CheckboxGroup();

    Checkbox male = new Checkbox("ÄÐ", cbg, true);
    Checkbox female = new Checkbox("Å®", cbg, true);
    Checkbox married = new Checkbox("ÊÇ·ñÒÑ»é?", cbg, true);

    Choice colorChooser = new Choice();
    List colorList = new List(6, true);

    TextArea ta  = new TextArea(5, 20);

    TextField tf = new TextField(50);

    public void init()
    {
        colorChooser.add("ºì");
        colorChooser.add("»Æ");
        colorChooser.add("À¶");
        colorChooser.add("ÂÌ");
        colorChooser.add("ºÚ");
        colorChooser.add("°×");

        colorList.add("ºì");
        colorList.add("»Æ");
        colorList.add("À¶");
        colorList.add("ÂÌ");
        colorList.add("ºÚ");
        colorList.add("°×");

        Panel bottom = new Panel();
        bottom.add(tf);
        bottom.add(ok);

        f.add(bottom,BorderLayout.SOUTH);

        Panel checkPanel = new Panel();
        checkPanel.add(colorChooser);
        checkPanel.add(male);
        checkPanel.add(female);
        checkPanel.add(married);

        Box topLeft = Box.createVerticalBox();
        topLeft.add(ta);
        topLeft.add(checkPanel);

        Box top = Box.createHorizontalBox();
        top.add(topLeft);
        top.add(colorList);

        f.add(top);
        f.pack();

        f.setVisible(true);
        

    }

    public static void main(String[] args)
    {
        new CommonComponent().init();
    }
}
