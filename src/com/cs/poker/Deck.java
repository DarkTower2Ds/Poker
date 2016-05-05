package com.cs.poker;

public class Deck 
{
	private Card[] cards = new Card[52];
	//	TODO: Turn cards into a Queue.
	public Deck()
	{
		for (int v=0;v<4;v++)
			for (int c=1;c<=13;c++)
				cards[c+(13*v)-1] = new Card(c,v);
	}
	/**
	 * Prints out the deck
	 */
	public void printDeck()
	{
		for (Card c: cards)
			System.out.println(c);
	}
}
