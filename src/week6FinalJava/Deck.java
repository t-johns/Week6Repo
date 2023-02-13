package week6FinalJava;

import java.util.ArrayList;
import java.util.Random;

public class Deck {
  // Create a basic deck of 52 cards via makeDeck( )

  Random rand = new Random();
        
  ArrayList<String> suits = new ArrayList<>(); //assign suits
  int values; // assign amount of values per suit
  ArrayList<Card> listOfCards = new ArrayList<>(); //combine into ArrayList of cards
  
  
  public ArrayList<Card> makeDeck() { //create a whole deck
    suits =  addSuits(); // create suits
    values = addValues(); // create values
    listOfCards = assembleDeck(suits, values); // add them together  

    return listOfCards;
  }
  
  public void dealHands(int players) { //assign amount of players and deal hand
    ArrayList<Player> playerList = new ArrayList<>();
    
    for (int i=1; i <= players; i++) {
      Player player = new Player(); //create player instance
      //player.setPlayer(i); //set player name/number
      
      playerList.add(player);
          
    }
    
//    for (int i=0; i<players; i++) {
//      Deck hand = new Deck();
//      
//      for (int i=0; i<52; i++) {
//
//      hand.drawCard();
//      
//    }
//    }
    
    
    return;
  }
  
  
  public void shuffle() { //shuffle deck
    ArrayList<Card> shuffledDeck = new ArrayList<>(); //temporary deck to hold shuffled cards
    int deckSize = listOfCards.size();
    
    for (int i = deckSize; i > 0; i--) { // start loop of deck size
      int randomCard = rand.nextInt(listOfCards.size()); // randomCard index to reference
      Card pulledCard = listOfCards.get(randomCard); // convert randomCard index to String
      
      shuffledDeck.add(pulledCard); //add pulledCard to temporary deck
      listOfCards.remove(randomCard); //empty list as we create new temporary one
      
      //System.out.println("Pulled card is!!... " + pulledCard);
    } listOfCards = shuffledDeck;
    
    return;
  }
    
    
  public void pullCards(int numCards) { //pull a random card in amount from the deck
    boolean canDraw = (numCards <= listOfCards.size()); //make sure drawn cards < deck size
    
    if (canDraw) {
      for (int i=numCards; i > 0 ; i--) {
        int randomCard = rand.nextInt(listOfCards.size()); // random int in deck
        Card pulledCard = listOfCards.get(randomCard);
        System.out.println("Pulled card is!!... " + pulledCard);
        listOfCards.remove(randomCard);
    }
    } else {System.out.println("Not enough cards!");}
    
    return;
  }
  
  public Card drawCard(Deck deck) { //draw 1 card from top of library    
    int topCardIndex = getDeckSize() - 1; // assign topCard as deckSize - 1

      Card drawnCard = listOfCards.get(topCardIndex);
      listOfCards.remove(drawnCard); //remove from deck
    return drawnCard;
    //System.out.println(drawnCard.printCard()); //test print
    
    
    
  }
  
  public void drawNum(int num) { // draw int num cards from top of deck
    boolean canDraw = (num <= listOfCards.size()); //make sure drawn cards < deck size
    
    if (canDraw) {
    for (int i=0; i<num; i++) {
      int topCard = getDeckSize() - 1; // assign topCard as deckSize - 1
        
      Card drawnCard = listOfCards.get(topCard);
      //System.out.println(drawnCard.printCard()); //print test
      listOfCards.remove(drawnCard);
    }
  } else {
    System.out.println("Not enough cards.");
  }
    
  }

  public ArrayList<Card> assembleDeck(ArrayList<String> suits, int values) {  // create method that returns array list of created cards
    ArrayList<Card> deck = new ArrayList<>();
    int suitSize = values/suits.size(); // cards per suit
    int cardIndex = 2; // offset index values
    
    for (String suit: this.suits) { // loop through suits array, and use suit for assignment reference
      for (int i=0; i < suitSize; i++) { // loop through int values per suit
        
        int cardValue = i + cardIndex; // assign card int value + index              
        
        Card card = new Card(suit, cardValue); //new card each loop    
        //card.getValue();
        
        deck.add(card); // add card to deck using setCard( ) method
      }   
    }
    return deck; //full deck
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
  
  public void getListOfCards() { //prints current deck of card object
    ArrayList<String> cardList = new ArrayList<String>();
    
    for (int i=0; i<listOfCards.size(); i++) {
      Card newCard = new Card();
      newCard = listOfCards.get(i);
      
      cardList.add(newCard.printCard()); //buffer into new list
      
    } // enhanced for loop
      System.out.println(cardList);; // print card and title

    return; //returns list of cards
  }
  
  public int getDeckSize() { //return deck size
    int deckSize = listOfCards.size();
    return deckSize;
  }
  
  public void addToDeck(Card card) {
    listOfCards.add(card);
    return;
  }
  
  
public void printDeckInfo(Deck deck) { 
  for (Card card: listOfCards) {
    System.out.println(card.printCard());
    card.getValue(); //reads card value
    
    //System.out.println(card.toString());
  
  //System.out.println(values); 
  //System.out.println(suits);
  //System.out.println(listOfCards);
    //System.out.println(card.getValue());
  }
  return;
}
}





