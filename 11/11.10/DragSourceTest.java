import java.awt.*;
import java.awt.dnd.*;
import java.awt.datatransfer.*;

import javax.swing.*;

public class DragSourceTest
{
    JFrame jf = new JFrame("Swing 的拖放支持");
    JLabel srcLabel = new JLabel("SWing的拖放支持。\n"
            + "将该文本域里的内容拖入到其他程序。\n");
    public void init()
    {
        DragSource dragSource = DragSource.getDefaultDragSource();

        dragSource.createDefaultDragGestureRecognizer(srcLabel
                , DnDConstants.ACTION_COPY_OR_MOVE
                , event -> {
                String txt = srcLabel.getText();
                Transferable transferable = new StringSelection(txt);

                event.startDrag(Cursor.getPredefinedCursor(Cursor.
                            HAND_CURSOR), transferable);
                });
        jf.add(new JScrollPane(srcLabel));
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.pack();
        jf.setVisible(true);
    }

    public static void main(String[] args)
    {
        new DragSourceTest().init();
    }
}
