import java.util.Scanner;

class guesser
{
    int guessnum;
    public int guessNumber()  
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Guesser Kindly guess the Number");
      guessnum=sc.nextInt();
      return guessnum;
    }
}

class Player
{
    int pguessnum;
    public int guessNumber()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Player Kindly guess the number");
        pguessnum=sc.nextInt();
        return pguessnum;
    }
}

class Umpire
{
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    void collectnumFromGuesser()
    {
        guesser g=new guesser();
        numFromGuesser=g.guessNumber();
    }

    void collectnumFromPlyers()
    {
        Player p1=new Player();
        Player p2=new Player();
        Player p3=new Player();

        numFromPlayer1=p1.guessNumber();
        numFromPlayer2=p2.guessNumber();
        numFromPlayer3=p3.guessNumber();
    }
  
    void compare()
    {
        if(numFromGuesser==numFromPlayer1)
        {
             if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3)
             {
                System.out.println("game tied all three player won the game");
             }else if(numFromGuesser==numFromPlayer2)
             {
                System.out.println("player 1 & player 3 won the game");
             }else if(numFromGuesser==numFromPlayer3)
             {
                System.out.println("player 1 & player 3 won the game");
             }
             else{
            System.out.println("Player 1 won the game");
        }
        }
        // player 2
        else if(numFromGuesser==numFromPlayer2)
        {      
             if(numFromGuesser==numFromPlayer3)
            {
                System.out.println("player 2 & player 3 won the game");
            }
            else 
            {
           System.out.println("player 2 won the game");
            }
        }
        //player 3
        else if(numFromGuesser==numFromPlayer3)
        {
            System.out.println("player 3 won the game");
        }
        //out off players 
        else {
            System.out.println("Game Lost! plz try again");
        }
    }
}
public class Launchgame {
    public static void main(String[] args) {
        Umpire u=new Umpire();
        u.collectnumFromGuesser();
        u.collectnumFromPlyers();
        u.compare();
    }
}
