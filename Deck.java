import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> cards; // Declare an ArrayList of type Card called cards

    public Deck() { // Constructor for Deck class
        cards = new ArrayList<Card>(); // Initialize cards ArrayList
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"}; // Initialize an array of Strings with the four suits
        for (String suit : suits) { // For each suit in the array suits
            for (int rank = 2; rank <= 14; rank++) { // For each rank from 2 to 14
                cards.add(new Card(rank, suit)); // Create a new Card object with rank and suit, and add it to the cards ArrayList
            }
        }
    }

    public void shuffle() { // Method to shuffle the cards
        Collections.shuffle(cards); // Shuffle the cards ArrayList using the shuffle() method from the Collections library
    }

    public ArrayList<Card> deal(int numCards) { // Method to deal a specified number of cards
        ArrayList<Card> dealtCards = new ArrayList<Card>(); // Create a new ArrayList of type Card called dealtCards
        for (int i = 0; i < numCards; i++) { // Loop numCards times
            dealtCards.add(cards.remove(0)); // Remove the first card from the cards ArrayList and add it to the dealtCards ArrayList
        }
        return dealtCards; // Return the dealtCards ArrayList
    }

    public ArrayList<Card> getCards() { // Method to get the cards ArrayList
        return cards; // Return the cards ArrayList
    }
}
