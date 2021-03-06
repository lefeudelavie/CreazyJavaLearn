import java.awt.*;
import java.awt.event.*;
import java.awt.datatransfer.*;

public class ImageSelection implements Transferable
{
    private Image image;

    public ImageSelection(Image image)
    {
        this.image = image;
    }

    public DataFlavor[] getTransferDataFlavors()
    {
        return new DataFlavor[]{DataFlavor.imageFlavor};
    }

    public Object getTransferData(DataFlavor flavor)
        throws UnsupportedFlavorException
    {
        if (flavor.equals(DataFlavor.imageFlavor))
        {
            return image;
        }
        else
        {
            throw new UnsupportedFlavorException(flavor);
        }
    }
    
    public boolean isDataFlavorSupported(DataFlavor flavor)
    {
        return flavor.equals(DataFlavor.imageFlavor);
    }
}
