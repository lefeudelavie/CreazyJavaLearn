import java.awt.*;
import static java.awt.BorderLayout.*;

public class BorderLayoutTest2
{
	public static void main(String[] args)
	{
		Frame f = new Frame();
		f.setLayout(new BorderLayout(30, 5));
		f.add(new Button("��"), SOUTH);
		f.add(new Button("��"), NORTH);
		f.add(new Button("��"), CENTER);
		Panel p = new Panel();
		p.add(new TextField(20));
		p.add(new Button("�����"));
		p.add(new Button("�����"));
		p.add(new Button("�����"));
		f.add(new Button("��"), EAST);
		f.add(p, WEST);
		f.pack();
		f.setVisible(true);
	}
}