import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game extends Player {
    Scanner obj = new Scanner(System.in);
    public void view() throws InterruptedException {
        label:
        for(int i=0;i<1;i++) {

            System.out.println("---------------------------------------------------------------------------");
            System.out.println("************************ Welcome to war game ******************************");
            System.out.println("---------------------------------------------------------------------------");
            System.out.println("Basic rule of game :-");
            System.out.println("---------------------------------------------------------------------------");
            System.out.println("---------------------------------------------------------------------------");
            String player1Name;
            String player2Name;
            System.out.print("Enter player1 name:-");
            player1Name = obj.next();
            System.out.println("Player 1 name: "+player1Name);
            System.out.print("Enter player2 name:-");
            player2Name = obj.next();
            System.out.println("Player 2 name: "+player2Name);
            System.out.println("Which player want to start the game? 1 or 2");
            System.out.println("---------------------------------------------------------------------------");
            int number = obj.nextInt();
            if (number == 1) {
                play1(player1Name, player2Name);
            } else if (number == 2) {
                play2(player2Name, player1Name);
            } else {
                System.out.println("wrong input try agian");
                break label;
            }
        }

    }
    public void play1(String player1Name,String player2Name) throws InterruptedException {
        int score1=0,score2=0;
        Player p = new Player();
        p.generateCard();
        p.suffleCard();
        p.player1Card();
        p.player2Card();

        for(int i=0;i<26;i++)
        {
            System.out.println(player1Name+" has :");
            System.out.println("*********************");
            System.out.println("*                   *");
            System.out.println("*"+p.player1.get(i)+"  *");
            System.out.println("*                   *");
            System.out.println("*                   *");
            System.out.println("*                   *");
            System.out.println("*                   *");
            System.out.println("*                   *");
            System.out.println("*********************");
            System.out.println("----------------------------------------------------------------------");
            Thread.sleep(2000);
            System.out.println(player2Name+" has :");
            System.out.println("*********************");
            System.out.println("*                   *");
            System.out.println("*"+p.player2.get(i)+"  *");
            System.out.println("*                   *");
            System.out.println("*                   *");
            System.out.println("*                   *");
            System.out.println("*                   *");
            System.out.println("*                   *");
            System.out.println("*********************");
            System.out.println("----------------------------------------------------------------------");
            Thread.sleep(2000);
            if(p.player1.get(i).getRank().getRank()>p.player2.get(i).getRank().getRank())
            {
                score1++;
                System.out.println(player1Name+" got one point");
            }
            else if(p.player1.get(i).getRank().getRank()<p.player2.get(i).getRank().getRank())
            {
                score2++;
                System.out.println(player2Name+" got one point");
            }
            else
            {
                System.out.println(player1Name +" and "+player2Name+" have same card");
            }
        }
        Thread.sleep(2000);
        if(score1>score2)
        {
            System.out.println("gagnante(Winner)! "+player1Name +" won the game");
        }
        else if (score2>score1)
        {
            System.out.println("gagnante(Winner)! "+player2Name +" won the game");
        }
        else
        {
            System.out.println("Match tied");
        }
    }


    public void play2(String player2Name,String player1Name) throws InterruptedException {
        int score1=0,score2=0;
        Player p = new Player();
        p.generateCard();
        p.suffleCard();
        p.player1Card();
        p.player2Card();
        for(int i=0;i<player2.size();i++)
        {

            System.out.println(player2Name+" has :");
            System.out.println("*********************");
            System.out.println("*                   *");
            System.out.println("*"+player2.get(i)+"  *");
            System.out.println("*                   *");
            System.out.println("*                   *");
            System.out.println("*                   *");
            System.out.println("*                   *");
            System.out.println("*                   *");
            System.out.println("*********************");
            System.out.println("----------------------------------------------------------------------");
            Thread.sleep(2000);
            System.out.println(player1Name+" has :");
            System.out.println("*********************");
            System.out.println("*                   *");
            System.out.println("*"+player1.get(i)+"  *");
            System.out.println("*                   *");
            System.out.println("*                   *");
            System.out.println("*                   *");
            System.out.println("*                   *");
            System.out.println("*                   *");
            System.out.println("*********************");
            System.out.println("----------------------------------------------------------------------");
            Thread.sleep(2000);
            if(player1.get(i).getRank().getRank()>player2.get(i).getRank().getRank())
            {
                score1++;
                System.out.println(player1Name+" got one point");
            }
            else if (player1.get(i).getRank().getRank()<player2.get(i).getRank().getRank())
            {
                score2++;
                System.out.println(player2Name+" got one point");
            }
            else
            {
                System.out.println(player1Name +" and "+player2Name+" have same card");
            }
        }
        Thread.sleep(2000);
        if(score1>score2)
        {
            System.out.println("gagnante(Winner)! "+player1Name +" won the game");
        }
        else if (score2>score1)
        {
            System.out.println("gagnante(Winner)! "+player2Name +" won the game");
        }
        else
        {
            System.out.println("Match tied");
        }
    }

}
