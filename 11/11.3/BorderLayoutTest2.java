import java.awt.*;
import static java.awt.BorderLayout.*;

public class BorderLayoutTest2
{
	public static void main(String[] args)
	{
		Frame f = new Frame();
		f.setLayout(new BorderLayout(30, 5));
		f.add(new Button("南"), SOUTH);
		f.add(new Button("北"), NORTH);
		f.add(new Button("中"), CENTER);
		Panel p = new Panel();
		p.add(new TextField(20));
		p.add(new Button("点击我"));
		p.add(new Button("点击我"));
		p.add(new Button("点击我"));
		f.add(new Button("东"), EAST);
		f.add(p, WEST);
		f.pack();
		f.setVisible(true);
	}
}