package student.model;
public class Deck {
    private Card[] cards;

    public Deck(Card[] Cards) {
        this.cards = Cards;
    }

    public Deck() {
        this.cards = new Card[52];
        int j=0;
        for(int i=1;i<=13;i++){
            String cardName="";
            switch(i){
                case 11:    cardName= "Jack";   break;
                case 12:    cardName= "Queen";  break;
                case 13:    cardName= "King";   break;
                default:    cardName= ""+i; 
            }
            cards[j++] = new Card(cardName, "Club");
            cards[j++] = new Card(cardName, "Diamonds");
            cards[j++] = new Card(cardName, "Heart");
            cards[j++] = new Card(cardName, "Spade");
        }
        
        
    }

    public Card[] getCards() {
        return cards;
    }

    public void setCards(Card[] Cards) {
        this.cards = Cards;
    }

    @Override
    public String toString() {
        String showCard = "";
        for(Card card: cards){
            showCard += card +"\n";
        }
        return showCard;
    }
}
