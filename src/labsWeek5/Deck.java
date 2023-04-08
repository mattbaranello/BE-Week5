package labsWeek5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	List<CardsClass> cards = new ArrayList<CardsClass>();
	
	Deck() {
		String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
		String[] numbers = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
	
		for (String suit : suits) {
			int count = 2;
			for (String number : numbers) {
				CardsClass card = new CardsClass(number, suit, count);
				this.cards.add(card);
				count++;
			}
		}
	}

	public List<CardsClass> getCards() {
		return cards;
	}

	public void setCards(List<CardsClass> cards) {
		this.cards = cards;
	}
	public void describe() {
		for (CardsClass card : this.cards) {
			card.describe();
		}
	}
	
	public void shuffle() {
		Collections.shuffle(this.cards);
	}
	public CardsClass draw() {
		CardsClass card = this.cards.remove(0);
		return card;
		
	}
}
