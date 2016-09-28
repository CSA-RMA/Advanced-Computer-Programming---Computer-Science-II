/*
 * @author ryanames
 * @business chaparralstaracademy
 * @name Main v1
 * @date Nov 29, 2015
 */
package pkg13.pkg4;
public class Main {
    public static void main(String[] args) {
        Card[] cards=new Card[52];
        int index=0;
        for (int suit=0; suit<=3; suit++) {
            for (int rank=1; rank<=13; rank++) {
                cards[index]=new Card(suit,rank);
                index++;
            }
        }
        suitHist(cards);
        System.out.printf("\nHand has flush: %s \n",hasFlush(cards));
    }
    public static void suitHist(Card[] cards){
        int clubs=0;
        int diamonds=0;
        int hearts=0;
        int spades=0;
        for (Card i:cards) {
            if (i.returnSuit()=="Clubs") {clubs++;}
            else if (i.returnSuit()=="Diamonds") {diamonds++;}
            else if (i.returnSuit()=="Hearts") {hearts++;}
            else if (i.returnSuit()=="Spades") {spades++;}
        }
        System.out.printf("Clubs in hand: %s \nDiamonds in hand: %s \nHearts in hand: %s \nSpades in hand: %s \n",clubs,diamonds,hearts,spades);
    }
    public static boolean hasFlush(Card[] cards) {
        int clubs=0;
        int diamonds=0;
        int hearts=0;
        int spades=0;
        for (Card i:cards) {
            if (i.returnSuit()=="Clubs") {clubs++;}
            else if (i.returnSuit()=="Diamonds") {diamonds++;}
            else if (i.returnSuit()=="Hearts") {hearts++;}
            else if (i.returnSuit()=="Spades") {spades++;}
        }
        if (clubs>=5 || diamonds>=5 || hearts>=5 || spades>=5) {
            return true;
        }
        return false;
    }
}
class Card {
    int suit, rank;

    static String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
    static String[] ranks = { "narf", "Ace", "2", "3", "4", "5", "6","7", "8", "9", "10", "Jack", "Queen", "King" };

    /*
     * No-argument constructor.
     */
    public Card() { 
	this.suit = 0;  this.rank = 0;
    }

    /*
     * Constructor with arguments.
     */
    public Card(int suit, int rank) { 
	this.suit = suit;  this.rank = rank;
    }

    /*
     * Prints a card in human-readable form.
     */
    public void print() {
	System.out.println(ranks[rank] + " of " + suits[suit]);
    }

    public String returnRank() {
	return (ranks[rank]);
    }
    public String returnSuit() {
	return (suits[suit]);
    }
    /*
     * Returns a card in human-readable form.
     */
    public String toString() {
	return ranks[rank] + " of " + suits[suit];
    }

    /*
     * Return true if the cards are equivalent.
     */
    public boolean equals(Card that) {
	return (this.suit == that.suit && this.rank == that.rank);
    }
    public int compareTo(Card that) {
	if (this.suit>that.suit) return 1;
	if (this.suit<that.suit) return -1;
	int rank1=(this.rank + 11) % 13; // uses arithmetic to change ranks and make ace higher than king
	int rank2=(that.rank + 11) % 13;
	if (rank1>rank2) return 1;
	if (rank1<rank2) return -1;
	return 0;
    }
}