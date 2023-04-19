import java.util.ArrayList;
import java.util.List;

public class Player extends Deck{

    List<Card> player1 = new ArrayList<>();
    List<Card>player2 = new ArrayList<>();

    public void player1Card()
    {
        player1 = deck.subList(0,26);
    }
    public void player2Card()
    {
        player2 = deck.subList(26,52);
    }


}
