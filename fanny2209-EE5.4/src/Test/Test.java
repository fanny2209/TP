package Test;
import CardsUtils.BlackjackHand;
import CardsUtils.Card;
import DeckUtils.Deck;

public class Test {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BlackjackHand blackhand = new BlackjackHand();
		Deck deck = new Deck(false);
		blackhand=DealRandomCards(blackhand, deck);
	}



	/**
	 *  Take random cards of the deck and give x cards to the blackjack hand
	 * @param b take a black jack hand in parameter to adress cards
	 * @param d: deck of the game 
	 * @return a blackjackhand with initalize cards 
	 * 
	 */
	public static BlackjackHand DealRandomCards(BlackjackHand b,Deck d){
		int randomHand = (int) ((Math.random() * (5)) + 2);
		d.shuffle(); 
		for(int i=0; i<randomHand; i++){ 
			Card c= d.dealCard();
			b.addCard(c);
		}
		System.out.println("Gamer has this cards : ");
		for(int i=0; i<randomHand; i++){
			System.out.println(b.getCard(i));
		}
		return b;
	}
}
