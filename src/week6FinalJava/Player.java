package week6FinalJava;

import java.util.ArrayList;

public class Player {
  
  int score = 0;  
  StringBuilder playerName;
  Deck hand = new Deck();
  
  public void printScore() {
    System.out.println(score);
    return;
  }

  public Player() {} //empty constructor
    
  public void setPlayer(StringBuilder player) { // sets player name via StringBuilder
    int score = 0;  
    playerName = player;
    Deck hand = new Deck();
    return;
  }
  
  public Integer getHandSize() {
    return hand.getDeckSize();
  }
  
  public Card flipTop() { //flip top card of hand
    Card flippedCard;

      flippedCard = hand.drawCard(hand);
    return flippedCard;
    


    }
  
  public void draw(Deck deck) { //draw card from deck to hand
    Card drawnCard = deck.drawCard(deck); //drawn card
    addToHand(drawnCard); //add to hand  
    return;
  }
  
  public void addToHand(Card drawnCard) { //add to hand
    hand.addToDeck(drawnCard); // add to hand via Deck method
 
    return;
  }
  
  public void readHand() {
    hand.printDeckInfo(hand);
  return;
  }
  
  
  public int incrementScore() {
    score += 1;
    return score;
  }
  
  public void getPlayer() {
      System.out.println(playerName);
    
    return;
  }
  
  public Integer getScore() {
    return score;
  }
//  public StringBuilder playerName() {
//    
//  }

  public void descPlayer() {
    System.out.println(playerName + " has " + score + " points and has "
        + hand.getDeckSize() + " cards.");
  }
  
  //System.out.println("Hello Player 1");
}
