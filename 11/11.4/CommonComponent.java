import java.awt.*;
import javax.swing.*;

public class CommonComponent
{
    Frame f = new Frame("����");
    Button ok = new Button("��");

    CheckboxGroup cbg = new CheckboxGroup();

    Checkbox male = new Checkbox("��", cbg, true);
    Checkbox female = new Checkbox("Ů", cbg, true);
    Checkbox married = new Checkbox("�Ƿ��ѻ�?", cbg, true);

    Choice colorChooser = new Choice();
    List colorList = new List(6, true);

    TextArea ta  = new TextArea(5, 20);

    TextField tf = new TextField(50);

    public void init()
    {
        colorChooser.add("��");
        colorChooser.add("��");
        colorChooser.add("��");
        colorChooser.add("��");
        colorChooser.add("��");
        colorChooser.add("��");

        colorList.add("��");
        colorList.add("��");
        colorList.add("��");
        colorList.add("��");
        colorList.add("��");
        colorList.add("��");

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
