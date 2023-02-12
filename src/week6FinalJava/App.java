package week6FinalJava;

import java.util.List;

public class App {

  public static void main(String[] args) { 
    
    Deck deck = new Deck();
    
    //Card card = new Card(); //create deck variable from card class
    //deck1.setDeck(); //create 52 card deck from Card.makeDeck( )
    deck.makeDeck();
    //System.out.println(deck.getDeckSize());
    //deck.shuffle();
    //deck.dealHands(4);
    //System.out.println(deck.getDeckSize());
    //deck.getValue();
    deck.printDeckInfo();
    
    
    //myDeck.makeDeck(); //makeDeck via 3 main methods in makeDeck()
    //System.out.println(card.makeDeck());
    //create 2 players

    //System.out.println(card.setCard(suit, value));
    //myDeck.shuffle();
    
    
    //Random random = new Random();
    //Collections.shuffle(myDeck);
    
    
      
    //System.out.println(deck.getListOfCards());
    //myDeck.pullCards(5); // pull amount of int of cards at random
    //myDeck.printDeckInfo();
    //myDeck.getDeckSize();

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
