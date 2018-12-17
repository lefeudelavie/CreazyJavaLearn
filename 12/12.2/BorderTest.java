import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

public class BorderTest
{
    private JFrame jf = new JFrame("���Ա߿�");
    
    public void init()
    {
        jf.setLayout(new GridLayout(2, 4));
        Border bb = BorderFactory.createBevelBorder(
                BevelBorder.RAISED, Color.RED, Color.GREEN
                , Color.BLUE, Color.GRAY);
        jf.add(getPanelWithBorder(bb, "BevelBorder"));

        Border lb = BorderFactory.createLineBorder(Color.ORANGE, 10);
        jf.add(getPanelWithBorder(lb, "LineBorder"));

        Border eb = BorderFactory.createEmptyBorder(20, 5, 10, 30);
        jf.add(getPanelWithBorder(eb, "EmptyBorder"));

        Border etb = BorderFactory.createEtchedBorder(EtchedBorder.RAISED,
                Color.RED, Color.GREEN);
        jf.add(getPanelWithBorder(etb, "EtchedBorder"));

        TitledBorder tb = new TitledBorder(lb, "���Ա���", 
                TitledBorder.LEFT, TitledBorder.BOTTOM,
                new Font("StSong", Font.BOLD, 18), Color.BLUE);
        
        jf.add(getPanelWithBorder(tb, "TitledBorder"));

        MatteBorder mb = new MatteBorder(20, 5 ,10 ,30, Color.GREEN);
        CompoundBorder cb = new CompoundBorder(new LineBorder(
                    Color.RED, 8), tb);
        jf.add(getPanelWithBorder(cb, "CompoundBorder"));


        jf.pack();
        jf.setVisible(true);
    }

    public static void main(String[] args)
    {
        new BorderTest().init();
    }

    public JPanel getPanelWithBorder(Border b, String BorderName)
    {
        JPanel p = new JPanel();
        p.add(new JLabel(BorderName));
        p.setBorder(b);
        return p;
    }
}
