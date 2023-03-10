public class Main {
    public static void main(String[] args) { //Basic format
        Deck deck = new Deck();//create object

        for (Card card : deck.getCards()) { //foreach loop
            System.out.println(card);//printing out all the cards in the deck, one by one
        }
    }
}
