package student.model;
//บอกคุณสมบัติของการ์ด
public class Card {
    private String suit;    // การ์ดประเภทไหน
    private String rank;    //การ์ดเลข 1-13

    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Card{" + "suit=" + suit + ", rank=" + rank + '}';
    }
}
