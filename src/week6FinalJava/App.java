package week6FinalJava;

public class App {

  public static void main(String[] args) { 
    

    Deck myDeck = new Deck(); //create deck
    //myDeck.makeDeck(); //makeDeck via 3 main methods in makeDeck()
    myDeck.makeDeck();
    //Random random = new Random();
    //Collections.shuffle(myDeck);
    
    
      
    //myDeck.getListOfCards();
    //myDeck.pullCards(5); // pull amount of int of cards at random
    myDeck.printDeckInfo();
    myDeck.shuffle();
    myDeck.printDeckInfo();
    //myDeck.getDeckSize();
  }

}
