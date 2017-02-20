package Test;
import java.util.Scanner;

import CardsUtils.BlackjackHand;
import CardsUtils.Card;
import DeckUtils.Deck;

public class Test {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String response="y";
		while(!response.equals("n")){
			BlackjackHand blackhand = new BlackjackHand();
			Deck deck = new Deck(false);
			blackhand=DealRandomCards(blackhand, deck);
			System.out.println("BlackJack value of this hand :"+blackhand.getBlackjackValue());
			System.out.println("Do you want we repeat again ? (y/n)");
			response=sc.nextLine();
			while(!response.equals("n")&&!response.equals("y")){
				System.out.println("Try again (y/n)");
				response=sc.nextLine();
			}
			
			System.out.println("End");
		}
	}



	/**
	 *  Take random cards of the deck and give x cards to the blackjack hand
	 * @param b take a black jack hand in parameter to adress cards
	 * @param d: deck of the game 
	 * @return b blackjackhand with initalize cards 
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
