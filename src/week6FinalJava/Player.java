package week6FinalJava;

public class Player {
  int score = 0;
  int handSize = 0;
  
  Deck hand = new Deck();
  
//  public Player() {
//    String playerName;
//    
//  }

  public void setPlayer(int i) {

    StringBuilder playerName = new StringBuilder("Player " + i); 
    System.out.println(playerName);
    return;
  }
  
  public void toHand() { //setter for adding card to hand after players have been initialized
    
  }
//  public StringBuilder playerName() {
//    
//  }
  
  //System.out.println("Hello Player 1");
}
