/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;
import sit.model.Card;
import sit.model.Deck;

/**
 *
 * @author User
 */
public class ConstructorTest2_1 {
    private Deck d;
   
    @Test
    public void create52CardInDeck(){
        d=new Deck();
        int actual=(d.size());
        assertEquals(52,actual);
        
    }
    
    @Test
    public void firstCardInDeckShouldBeSpadesAce(){
        d=new Deck();
        Card[] allCards=d.getCards();
        Card actual=allCards[0];
        assertEquals(new Card(Card.ACE, Card.SPADES), actual);
    }
   
    @Test
    public void LastCardInDeckShouldBeClubsKing(){
        d=new Deck();
        Card[] allCards=d.getCards();
        Card actual=allCards[allCards.length-1];
        assertEquals(new Card(Card.KING, Card.CLUBS), actual);
    }
    
    
   
}
