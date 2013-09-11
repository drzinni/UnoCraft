package com.danielzinni.unocraft;

public class Deck 
{
	Card[] cards;
	int cardsleft;
	
	public Deck(Card[] cards, int cardsleft)
	{
		this.cards = cards;
		this.cardsleft = cardsleft;
	}
	
	public Card[] getCards()
	{
		return cards;
	}
	
	public int getCardsleft()
	{
		return cardsleft;
	}

	public void setCards(Card[] cards) {
		this.cards = cards;
	}

	public void setCardsleft(int cardsleft) {
		this.cardsleft = cardsleft;
	}
}


