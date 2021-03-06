import java.util.*;
import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;
import java.awt.datatransfer.*;


public class CopyImage
{
    private Clipboard clipboard = Toolkit
	.getDefaultToolkit().getSystemClipboard();
    java.util.List<Image> imageList = new ArrayList<>();

    private final int AREA_WIDTH = 500;
    private final int AREA_HEIGHT = 400;

    private int preX = -1;
    private int preY = -1;

    PopupMenu pop = new PopupMenu();
    MenuItem redItem = new MenuItem("��ɫ");
    MenuItem greenItem = new MenuItem("��ɫ");
    MenuItem blueItem = new MenuItem("��ɫ");

    BufferedImage image = new BufferedImage(AREA_WIDTH
	    ,AREA_HEIGHT, BufferedImage.TYPE_INT_RGB);

    Graphics g = image.getGraphics();

    private Frame f = new Frame("��ͼ��");
    private DrawCanvas drawArea = new DrawCanvas();
    
    private Color foreColor = new Color(255, 0, 0);

    public void init()
    {
	ActionListener menuListener = e ->
	{
	    if (e.getActionCommand().equals("��ɫ"))
	    {
		foreColor = new Color(0, 255, 0);
	    }
	    if (e.getActionCommand().equals("��ɫ"))
	    {
		foreColor = new Color(255, 0, 0);
	    }
	    if (e.getActionCommand().equals("��ɫ"))
	    {
		foreColor = new Color(0, 0, 255);
	    }
	};

	redItem.addActionListener(menuListener);
	greenItem.addActionListener(menuListener);
	blueItem.addActionListener(menuListener);

	pop.add(redItem);
	pop.add(greenItem);
	pop.add(blueItem);

	drawArea.add(pop);

	g.fillRect(0, 0, AREA_WIDTH, AREA_HEIGHT);
	drawArea.setPreferredSize(new Dimension(AREA_WIDTH, AREA_HEIGHT));

	drawArea.addMouseMotionListener(new MouseMotionAdapter()
	{
	    public void mouseDragged(MouseEvent e)
	    {
		if (preX > 0 && preY >0)
		{
		    g.setColor(foreColor);
		    g.drawLine(preX, preY, e.getX(), e.getY());
		}

		preX = e.getX();
		preY = e.getY();
		drawArea.repaint();
	    }
	});

	drawArea.addMouseListener(new MouseAdapter()
        {
	    public void mouseReleased(MouseEvent e)
	    {
		if (e.isPopupTrigger())
		{
		    pop.show(drawArea, e.getX(), e.getY());
		}
		preX = -1;
		preY = -1;
	    }
	});

	f.add(drawArea);
	Panel p = new Panel();
	Button copy = new Button("����");
	Button paste = new Button("ճ��");
	copy.addActionListener(event ->
	{
	    ImageSelection contents = new ImageSelection(image);
	    clipboard.setContents(contents, null);
	});
	paste.addActionListener(event ->
	{
	    if (clipboard.isDataFlavorAvailable(DataFlavor.imageFlavor))
	    {
		try
		{
		    imageList.add((Image)clipboard
			    .getData(DataFlavor.imageFlavor));
		    drawArea.repaint();
		}
		catch (Exception e)
		{
		    e.printStackTrace();
		}
	    }
	});
	p.add(copy);
	p.add(paste);
	f.add(p, BorderLayout.SOUTH);
	f.pack();
	f.setVisible(true);
    }
    public static void main(String[] args)
    {
	new CopyImage().init();
    }

    class DrawCanvas extends Canvas
    {
	public void paint(Graphics g)
	{
	    g.drawImage(image, 0, 0, null);
	    for (Image i: imageList)
	    {
		g.drawImage(i, 0, 0, null);
	    }
	}
    }
    
}
