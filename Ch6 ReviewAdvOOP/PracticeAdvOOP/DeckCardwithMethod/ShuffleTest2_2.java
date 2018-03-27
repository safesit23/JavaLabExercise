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
public class ShuffleTest2_2 {
    private Deck d;
   
   
    
    @Test
    public void shuffleThenPositionOfCardsShouldBeChanged(){
        Deck o=new Deck();
        Card[] originalCards= o.getCards();
        d=new Deck();
        d.shuffle();
        Card[] shuffleCards=d.getCards();
        int numOfDiffPosCards=0;
        for (int i = 0; i < d.size(); i++) {
            if(!originalCards[i].equals(shuffleCards[i]))
                  numOfDiffPosCards++;
           // System.out.print("original "+originalCards[i]+"--");
           // System.out.println("shuffle "+shuffleCards[i]+"\t");
          
        }
      //  System.out.println(numOfDiffPosCards);
        assertNotEquals(numOfDiffPosCards, 0);
    }
    
    
}
