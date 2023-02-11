package week6FinalJava;

import java.util.ArrayList;
import java.util.Random;

public class Deck {
  // Create a basic deck of 52 cards
  public Deck() {} 
  Random rand = new Random();
        
  ArrayList<String> suits = new ArrayList<>(); //assign suits
  int values; // assign amount of values
  ArrayList<String> listOfCards = new ArrayList<>(); //combine into ArrayList of cards
  
  
  public ArrayList<String> makeDeck() { //create a whole deck
    suits =  addSuits(); // create suits
    values = addValues(); // create values
    listOfCards = assembleDeck(suits, values); // add them together
    

    return listOfCards;
  }
  
  public ArrayList<String> getListOfCards() { //prints current deck of cards
    System.out.println();
    return listOfCards;
  }
  
  public void shuffle() { //shuffle deck
    ArrayList<String> shuffledDeck = new ArrayList<>(); //temporary deck to hold shuffled cards
    int deckSize = listOfCards.size();
    
    for (int i = deckSize; i > 0; i--) { // start loop of deck size
      int randomCard = rand.nextInt(listOfCards.size()); // randomCard index to reference
      String pulledCard = listOfCards.get(randomCard); // convert randomCard index to String
      
      shuffledDeck.add(pulledCard); //add pulledCard to temporary deck
      listOfCards.remove(randomCard); //empty list as we create new temporary one
      
      //System.out.println("Pulled card is!!... " + pulledCard);
    } listOfCards = shuffledDeck;
    
    return;
  }
    
    
  public void pullCards(int numCards) { //pull a random card in amount from the deck
    boolean canDraw = (numCards <= listOfCards.size());
    
    if (canDraw) {
      for (int i=numCards; i > 0 ; i--) {
        int randomCard = rand.nextInt(listOfCards.size());  
        String pulledCard = listOfCards.get(randomCard);
        System.out.println("Pulled card is!!... " + pulledCard);
        listOfCards.remove(randomCard);
    }
    } else {System.out.println("Not enough cards!");}
    
    return;
    
  }

  public ArrayList<String> assembleDeck(ArrayList<String> suits, int values) {  // create method that returns array list of created cards  
    // ArrayList<String> deck = new ArrayList();
    ArrayList<String> deck = new ArrayList<>();
    int suitSize = values/suits.size(); // cards per suit
    int cardIndex = 2;
    
    for (String suit: this.suits) { // loop through suits array
      
      for (int i=0; i < suitSize; i++) { // loop through int values
        int cardValue = i + cardIndex; // assign value to a card
        StringBuilder card = new StringBuilder(); // declare card StringBuilder
        
        card = card.append(cardValue + " of " + suit); // assign value and suit to string.
        
        String newCard = card.toString(); // convert stringBuilder to String. 
        deck.add(newCard); // add card to deck
        
        card.delete(0, card.length()); //clear stringBuilder          
      }   
    }
    return deck; //full deck
  }
  
  public StringBuilder assignFaceCards(ArrayList<String> listOfCards) { // assign face card based on switch case of value
    //getCardValues if(cardValue >= 10) {
    // switch{
    // 10:
    // ..
    // 14:
    return null;
  }
  

  private int addValues() { // per suit, add value range of each 2-14, plus added card offset
    for (String suit: this.suits) {
      values += 13; // add value of cards, + cardIndex offset, per suit
    }
    return values;
  }
  
  
  
  private ArrayList<String> addSuits() {
    this.suits.add("Diamonds");
    this.suits.add("Clubs");
    this.suits.add("Hearts");
    this.suits.add("Spades");
    return this.suits;
  }
  


public void introduce() {
  System.out.println("Pffffft, pffffft... The dealer shuffles his cards.");
  //System.out.println("Got a set of " +  deckSize + " here if you'd like.");
  System.out.print("Got them all, ");
  for (String suit: this.suits) {
    System.out.print(suit + ", ");
  }
  System.out.print("all ready to do your bidding");
  //System.out.println("What say you, value goes low of " + values.get(0) + "high of " );
  //values.get((values.get((values.length()-1)))));
  
}

public void getDeckSize() {
  System.out.println(listOfCards.size());
  return;
}
  
public void printDeckInfo() {
  
  //System.out.println(values); 
  //System.out.println(suits);
  //System.out.println(listOfCards);
  for (String card: listOfCards) {
    System.out.println(card);
  }
}
}





