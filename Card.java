public class Card {
    // fields to store the rank and suit of the card
    private int rank;
    private String suit;

    // constructor that takes a rank and suit as parameters and sets the fields
    public Card(int rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    // getRank() returns the rank
    public int getRank() {
        return rank;
    }

    // getSuit() returns the suit
    public String getSuit() {
        return suit;
    }

    // set the rank
    public void setRank(int rank) {
        this.rank = rank;
    }

    // set the suit
    public void setSuit(String suit) {
        this.suit = suit;
    }

    // method to convert the card to a string representation
    public String toString() {
        // declare a local variable to hold the English name of the rank
        String rankName;

        // use a switch statement to set the rankName based on the rank field
        switch (rank) {
            case 2:
                rankName = "Two";
                break;
            case 3:
                rankName = "Three";
                break;
            case 4:
                rankName = "Four";
                break;
            case 5:
                rankName = "Five";
                break;
            case 6:
                rankName = "Six";
                break;
            case 7:
                rankName = "Seven";
                break;
            case 8:
                rankName = "Eight";
                break;
            case 9:
                rankName = "Nine";
                break;
            case 10:
                rankName = "Ten";
                break;
            case 11:
                rankName = "Jack";
                break;
            case 12:
                rankName = "Queen";
                break;
            case 13:
                rankName = "King";
                break;
            case 14:
                rankName = "Ace";
                break;
            default:
                rankName = "Invalid Rank";
                break;
        }

        // return a string that includes the English name of the rank and the suit
        return rankName + " of " + suit;
    }
}
