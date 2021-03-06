import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.imageio.*;
import java.io.*;

public class Gobang
{
    // following 3 bmp image represent the Go board, white and black
    BufferedImage table;
    BufferedImage black;
    BufferedImage white;

    // The select icon
    BufferedImage selected;

    // Defaine the size for the board
    private static int BOARD_SIZE = 15;

    // Define the width and height (in pixels ) for the board
    private final int TABLE_WIDTH = 535;
    private final int TABLE_HEIGHT = 536;

    // Define the ration between pixels and board size
    private final int RATE = TABLE_WIDTH / BOARD_SIZE;

    // Define the offset between the board and the board image
    private final int X_OFFSET = 5;
    private final int Y_OFFSET = 6;

    // Define a two dimension array as the board 
    private byte[][] board = new byte[BOARD_SIZE][BOARD_SIZE];

    // Window for the game
    JFrame f = new JFrame("��������Ϸ");

    // Canvas for the game
    GoBoard goBoard = new GoBoard();

    // current selected aixes
    private int selectedX = -1;
    private int selectedY = -1;

    public void init() throws Exception
    {
        table = ImageIO.read(new File("image/board.jpg"));
        black = ImageIO.read(new File("image/black.gif"));
        white = ImageIO.read(new File("image/white.gif"));
        selected = ImageIO.read(new File("image/selected.gif"));

        // initalize all the elemets to 0, 0 represnet no chess piece
        for (int i = 0; i < BOARD_SIZE; i++)
        {
            for ( int j = 0; j < BOARD_SIZE; j++)
            {
                board[i][j] = 0;
            }
        }

        goBoard.setPreferredSize(new Dimension(
                    TABLE_WIDTH, TABLE_HEIGHT));

        goBoard.addMouseListener(new MouseAdapter()
        {   
            public void mouseClicked(MouseEvent e)
            {
                int xPos = (int) ((e.getX() - X_OFFSET) / RATE);
                int yPos = (int) ((e.getY() - Y_OFFSET) / RATE);
                board[xPos][yPos] = 1;
                /*
                 * Generate two random numbers as the aixes moved by computer.
                 * Attention:
                 * 1, If the place has chess piece ,you canot put piece there.
                 * 2, After piece move , program need to check who win the game
                 */

                goBoard.repaint();
            }

            public void mouseExited(MouseEvent e)
            {
                selectedX = -1;
                selectedY = -1;
                goBoard.repaint();
            }
        });

        goBoard.addMouseMotionListener(new MouseMotionAdapter()
        {
            public void mouseMoved(MouseEvent e)
            {
                selectedX = (e.getX() - X_OFFSET) / RATE;
                selectedY = (e.getY() - Y_OFFSET) / RATE;
                goBoard.repaint();
            }
        });
        
        f.add(goBoard);
        f.pack();
        f.setVisible(true);
    }

    public static void main(String[] args) throws Exception
    {
        new Gobang().init();
    }

    class GoBoard extends JPanel
    {
        // ovride the paint method
        public void paint(Graphics g)
        {
            g.drawImage(table, 0, 0, null);

            if ( selectedX >= 0 && selectedY >= 0)
                g.drawImage(selected, selectedX * RATE, selectedY * RATE, null);
            
            for ( int i = 0 ; i < BOARD_SIZE; i++)
            {
                for ( int j = 0; j < BOARD_SIZE ; j++)
                {
                    if (board[i][j] == 1 )
                    {
                        g.drawImage(black, i * RATE + X_OFFSET, 
                                j * RATE + Y_OFFSET, null);
                    }
                    if (board[i][j] == 2 )
                    {
                        g.drawImage(white, i * RATE + X_OFFSET, 
                                j * RATE + Y_OFFSET, null);
                    }
                }
            }
        }
    }
}
