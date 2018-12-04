import java.util.*;

public class ShowHandPractice
{
    private final int PLAY_NUM = 5;
    private String[] card_types = {"\4", "\5", "\3", "\6"};
    private String[] card_values = {"2", "3", "4", "5"
				    , "6", "7", "8", "9"
				    , "10", "J", "Q", "K", "A"};
    public List<String> cards = new List<String>();
    public String[] players = new String[PLAY_NUM];
    public List<String>[] playersCards = new List[PLAY_NUM];
    
    public void initCards()
    {
	 for ( int i = 0 ; i < cards_types.length(); i++ )
	 {
	      for ( int j = 0; j < cards_values.length(); i++)
	      {
		   cards.add(card_types[i] + card_values[j]);
	      }
	 }

	 Collections.shuffle(cards);
    }

    public void initPlayers(String... names)
    {
	 if (names.length() > 5 )
	 {
	      System.out.println("");
	      return;
	 }
	 else (names.length() < 2 )
	 {
	      System.out.println("");
	      return;
	 }


	 for ( int i = 0; i < names.length() ; i++)
	 {
	      players[i] = names[i]; 
	 }
    }

    public void showAllCards()
    {
	 for ( String card: cards)
	 {
	      System.out.println(card + " ");
	 }
    }
     
    public void initPlayersCards()
    {
	for ( int i = 0; i < players.length(); i++ )
	{
	     players[i] = new LinkedLinst();
	}
    }

    public void deliverCards(String first)
    {
	 
    }

    public void showPlayersCards()
    {
	for  
    }

    public static void main(String[] args)
    {
	ShowHandPractice sh = new ShowHandPractice();
	sh.initCards();
	sh.initPlayers("电脑玩家", "王小花");
	sh.initPlayersCards();

	sh.deliverCards("王小花");
	sh.showPlayersCards();
	sh.deliverCards("电脑玩家");
	sh.showPlayersCards();
	
    }
}

