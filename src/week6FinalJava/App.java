package week6FinalJava;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class App {
  

  public static void main(String[] args) { 
    App myApp = new App();
    
    Deck deck = new Deck(); //create deck instance
    deck.makeDeck(); //create standard  deck
    ArrayList<Player> players; 
    players = playersPlaying(2);
    // set amount of players
    
    Player player1 = players.get(0);
    Player player2 = players.get(1);
    player1.getPlayer();
    player2.getPlayer();
    
    player1.descPlayer();
    player2.descPlayer();

    
    deck.getListOfCards(); //printed arraylist of cards, intentionally long
    deck.shuffle();
    deck.getListOfCards(); 
    
    
    myApp.dealHands(deck, players);
    myApp.playWAR(deck, players);
    
    
  }
  
  
  private void playWAR(Deck dec, ArrayList<Player> players) { //play war
    Player player1 = players.get(0);
    Player player2 = players.get(1); 
    for (int i=0; i<26; i++) {
      Card p1Card = player1.flipTop();
      int p1Value;
      p1Value = p1Card.getValue();
      
      Card p2Card = player2.flipTop();
      int p2Value;
      p2Value = p2Card.getValue();
      
      try {
        TimeUnit.MILLISECONDS.sleep(1000); //add delay for content
      }
      catch(InterruptedException ex) {
        ex.printStackTrace();
    }
      if (p1Value > p2Value) {
        System.out.print("+++ Player 1 +++ ");        
        System.out.println("--- Player 2 ---");
        player1.incrementScore();
      } else if (p1Value < p2Value) {
        System.out.print("--- Player 1 --- ");
        System.out.println("+++ Player 2 +++ ");        
        player2.incrementScore();
      } else {
        System.out.println("~~~ Player 1 ~~DRAW~~ Player 2 ~~~");
      }      
    }
    Integer p1Score = player1.getScore();
    Integer p2Score = player2.getScore();
    if (p1Score > p2Score) {
      System.out.println("+++ Player 1 Winner, with a score of " + p1Score  + "! +++");
      System.out.println("--- Player 2 Loser, with a score of " + p2Score  + "! ---");
    } else if (p1Score < p2Score) {
      System.out.println("+++ Player 2 Winner, with a score of " + p2Score  + "! +++");
      System.out.println("--- Player 1 Loser, with a score of " + p1Score  + "! ---");
    } else {
      System.out.println("~~~ Game is a DRAW at " + p1Score + " ~~~");

    }
    return;
  }   
  

  private void dealHands(Deck deck, ArrayList<Player> players) { //deal hands for 2 players
    int deckSize = deck.getDeckSize(); 
    Player player1 = players.get(0); // import player 1 reference
    Player player2 = players.get(1); // import player 2 reference
    
    for (int i=0; i<deckSize; i++) { // while i < deckSize
      if (i % 2 == 0) {
        player1.draw(deck); //player 1 draw
        
      } else if (i % 2 == 1 ) {
        player2.draw(deck); //player 2 draw
      }    
    } return;
  }

  
  public static ArrayList<Player> playersPlaying(int playersPlaying) { //assign player names and classes
    ArrayList<Player> players = new ArrayList<>();
    
    for (int i=1; i<= playersPlaying; i++) {
      StringBuilder player = new StringBuilder("Player "); // generic player title
      Player newPlayer = new Player(); // new player object
      player.append(i); // append player number
      
      newPlayer.setPlayer(player); // create player class per num "Player 1"
      players.add(newPlayer); // add to list for game
    }
    
    return players; //return arraylist of players
  }
//  public void introduce() {
//    System.out.println("Pffffft, pffffft... The dealer shuffles his cards.");
//    //System.out.println("Got a set of " +  deckSize + " here if you'd like.");
//    System.out.print("Got them all, ");
//    for (String suit: this.suits) {
//      System.out.print(suit + ", ");
//    }
//    System.out.print("all ready to do your bidding");
//    //System.out.println("What say you, value goes low of " + values.get(0) + "high of " );
//    //values.get((values.get((values.length()-1)))));
//    
//  }

}
