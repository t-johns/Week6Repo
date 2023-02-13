package week6FinalJava;

import javax.management.ValueExp;

public class Card {

  
  String cardSuit;
  Integer cardValue;
  String title;

  StringBuilder cardName = new StringBuilder();
  
  
  public Card(String suit, Integer value) { //construct card
    cardValue = value;
    cardSuit = suit;
        
    if (value < 11) { // if less than 11
      cardName.append(value + " of " + suit); // assign numeric value
    } setFaceCard(suit, value); // else set face
    
  }    
  

  public Card setFaceCard(String suit, Integer value) { // assign face card based on switch case of value
    String title;
    Card card = new Card();
    
    switch (cardValue) {
      case 11:
        title = "Jack";
        cardName.append(title + " of " + cardSuit);
        break;
        
      case 12:
        title = "Queen";
        cardName.append(title + " of " + cardSuit);
        break;
        
      case 13:
        title = "King";
        cardName.append(title + " of " + cardSuit);
        break;
        
      case 14:
        title = "Ace";
        cardName.append(title + " of  " + cardSuit);
        break;
    }
    return card;
  }
  
  
  public Integer getValue() { // print card value, face card titles referred  to as int values
    System.out.println(cardValue);
    return cardValue;
  }
  
  
  public String printCard() { // returns cardName in full as string
    return cardName.toString();
  }
  
  
  public Card() { //set blank card constructor  
  }

  
   
//  public Class setCardValue(Integer value) {
//    cardValue = value;
//    return card.toString();
//  }
  
  

}


