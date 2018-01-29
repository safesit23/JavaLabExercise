package student.model;
public class Deck {
    private Card[] cards;           //ดึงการ์ดมาใช้งาน

    public Deck(Card[] Cards) {     //ในกรณีสร้างการ์ดเองใน TestDeckCard
        this.cards = Cards;
    }

    public Deck() {                 //ในกรณี new Deck ใน TestDeckCard
        this.cards = new Card[52];  //สร้างจำนวนการ์ด 52 ใบแบบ Array
        int j=0;                    //
        for(int i=1;i<=13;i++){     //วน LOOP เพื่อกำหนดชื่อการ์ด 1-13
            String cardName="";     
            switch(i){
                case 11:    cardName= "Jack";   break;  //ถ้าเป็นเลข 11 เป็น Jack
                case 12:    cardName= "Queen";  break;  //ถ้าเป็นเลข 12 เป็น Queen
                case 13:    cardName= "King";   break;  //ถ้าเป็นเลข 13 เป็น King
                default:    cardName= ""+i;             //เลข 1-10 เป็นตัวเลขปกติ
            }
            cards[j++] = new Card(cardName, "Club");        //ใบที่ 1. เลขเดิม ให้เป็นประเภท Club
            cards[j++] = new Card(cardName, "Diamonds");    //ใบที่ 2. เลขเดิม ให้เป็นประเภท Diamonds
            cards[j++] = new Card(cardName, "Heart");       //ใบที่ 3. เลขเดิม ให้เป็นประเภท Heart
            cards[j++] = new Card(cardName, "Spade");       //ใบที่ 4. เลขเดิม ให้เป็นประเภท Spade
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
        for(Card card: cards){          //โชว์ข้อมูลของการ์ดทั้ง 52 ใบโดยใช้ LOOP
            showCard += card +"\n";     
        }
        return showCard;
    }
}
