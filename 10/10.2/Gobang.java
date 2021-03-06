import java.io.*;


public class Gobang
{
	private static int BOARD_SIZE = 15;
	private String[][] board;
	public void initBoard()
	{
		board = new String[BOARD_SIZE][BOARD_SIZE];
		for (int i = 0; i < BOARD_SIZE; i++)
		{
			for (int j = 0; j < BOARD_SIZE; j++)
			{
				board[i][j] = "╂";
				// ╂ ＋
			}
		}
	}

	public void printBoard()
	{
		for ( int i = 0; i < BOARD_SIZE; i++ )	
		{
			for (int j = 0; j < BOARD_SIZE; j++)
			{
				System.out.print(board[i][j]); 
			}
			System.out.println();
		}
	}

	public static void main(String[] args) throws Exception
	{
		Gobang gb = new Gobang();
		gb.initBoard();
		gb.printBoard();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inputStr = null;
		while ((inputStr = br.readLine()) != null)
		{
		    try
		    {
			String[] posStrArr = inputStr.split(",");
			int xPos = Integer.parseInt(posStrArr[0]);
			int yPos = Integer.parseInt(posStrArr[1]);

			if (!gb.board[yPos-1][xPos-1].equals("╂"))
			{
			     System.out.println("您输入的坐标点已经有棋子了，请重新输入。");
			     continue;
			}

			gb.board[yPos - 1][xPos - 1] = " ●";
		    }
		    catch (Exception e)
		    {
			 System.out.println("您输入的坐标值不合法，请重新输入，" + "下棋坐标应以x,y的格式。");
			 continue;
		    }
			gb.printBoard();
			System.out.println("请输入您下棋的坐标，应以x,y的格式：");

		}
	}
}
