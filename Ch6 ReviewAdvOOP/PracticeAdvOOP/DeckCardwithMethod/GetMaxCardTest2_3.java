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
public class GetMaxCardTest2_3 {
    private Deck d;
    
    @Test
    public void getMaxCardInDeckAfterTwoDeal(){
        d=new Deck();
        d.deal();
        d.deal();
        Card lastCard=new Card(Card.JACK,Card.CLUBS );
        assertEquals(d.getMaxCard(), lastCard);
    }
    
    @Test
    public void getMaxCardInDeckAfterTwoDeals(){
        d=new Deck();
        d.deal();
        d.deal();
        Card lastCard=new Card(Card.JACK,Card.CLUBS );
        assertEquals(d.getMaxCard(), lastCard);
    }
    
    @Test
    public void getMaxCardInEmptyDeckReturnNull(){
        d=new Deck();
        for (int i = 0; i < 52; i++) {
            d.deal();
        }
        assertNull(d.getMaxCard());
    }
    
    @Test
    public void getMaxCardWhenRemainOneCardInDeck(){
        d=new Deck();
        
        for (int i = 0; i < 51; i++) {
            
           d.deal();
        }
        Card firstCard=new Card(Card.ACE, Card.SPADES);
        assertEquals(d.getMaxCard(),firstCard);
    }
    
   
}
