import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Deck  {

   List<Card> deck = new ArrayList<>(52);


   public void generateCard()
   {
       for(Card.Suit s:Card.Suit.values())
       {
           for (Card.Rank r : Card.Rank.values())
           {
               deck.add(new Card(s,r));
           }
       }
   }

   public void suffleCard()
   {
       Collections.shuffle(deck);
   }









}
