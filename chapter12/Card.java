package chapter12;

/**
 * A standard playing card.
 */
public class Card {

    public static final String[] RANKS = {
        null, "Ace", "2", "3", "4", "5", "6", "7",
        "8", "9", "10", "Jack", "Queen", "King"};

    public static final String[] SUITS = {
        "Clubs", "Diamonds", "Hearts", "Spades"};

    private final int rank;

    private final int suit;

    /**
     * Constructs a card of the given rank and suit.
     */
    public Card(int rank, int suit) {
        this.rank = rank;
        this.suit = suit;
    }
 
    public Card[] makeDeck() {
        Card[] cards = new Card[52];
        int index = 0;
        for (int suit = 0; suit <= 3; suit++) {
        for (int rank = 1; rank <= 13; rank++) {
            cards[index] = new Card(rank, suit);
            index++;
            }
        }
        return cards;
    }

    public int[] suitHist(Card[] cards) {       
        int [] counts = new int[4];
        for (int i = 0; i < cards.length; i++) {
            int index = cards[i].getSuit();
            counts[index]++;
        }
        return counts;

    }

    public boolean hasFlush(Card[] cards) {
        int[] suitCounts = suitHist(cards); 
        for (int count : suitCounts) {
            if (count >= 5) {
                return true;
                }
            }
        
        return false;
        }

    private int findFlushSuit(Card[] cards) {
        int[] suitCounts = suitHist(cards); 
        int maxIndex = 0;
        for (int i = 0; i < suitCounts.length; i++) {
            if (suitCounts[i] > suitCounts[maxIndex]) {
                maxIndex = i;
            }
        }
            return maxIndex;
    }

    public boolean hasRoyal(Card[] cards) {
        int suit = findFlushSuit(cards);
        int[] suitCounts = suitHist(cards);
        
        if (suitCounts[suit] < 5) {
            return false; 
            }
        
        boolean ten, jack, queen, king, ace;
        ten = jack = queen = king = ace = false;

        for (Object elem : col) {
            
        }
        

    }
        
       
    
   /**
     * Returns a negative integer if this card comes before
     * the given card, zero if the two cards are equal, or
     * a positive integer if this card comes after the card.
     * currently using a temp value to appease exercise 12.2 ace rank is now higher than a King at 14
     **/ 
    public int compareTo(Card that) {

        int thisRank = this.rank;
        
        if (thisRank == 1) {
            thisRank = 14;
        }

        if (this.suit < that.suit) {
            return -1;
        }
        if (this.suit > that.suit) {
            return 1;
        }
        if (thisRank < that.rank) {
            return -1;
        }
        if (thisRank > that.rank) {
            return 1;
        }
        return 0;
    }

    /**
     * Returns true if the given card has the same
     * rank AND same suit; otherwise returns false.
     */
    public boolean equals(Card that) {
        return this.rank == that.rank
            && this.suit == that.suit;
    }

    /**
     * Gets the card's rank.
     */
    public int getRank() {
        return this.rank;
    }

    /**
     * Gets the card's suit.
     */
    public int getSuit() {
        return this.suit;
    }

    /**
     * Returns the card's index in a sorted deck of 52 cards.
     */
    public int position() {
        return this.suit * 13 + this.rank - 1;
    }

    /**
     * Returns a string representation of the card.
     */
    public String toString() {
        return RANKS[this.rank] + " of " + SUITS[this.suit];
    }

}