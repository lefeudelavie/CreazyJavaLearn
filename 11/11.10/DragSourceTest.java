import java.awt.*;
import java.awt.dnd.*;
import java.awt.datatransfer.*;

import javax.swing.*;

public class DragSourceTest
{
    JFrame jf = new JFrame("Swing ���Ϸ�֧��");
    JLabel srcLabel = new JLabel("SWing���Ϸ�֧�֡�\n"
            + "�����ı�������������뵽��������\n");
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