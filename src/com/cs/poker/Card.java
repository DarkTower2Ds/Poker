package com.cs.poker;

import com.cs.Reference;

public class Card //implements Comparable?
{
	private int value, suit;
	/**
	 * Creates a new card with a value and suit
	 * @param value The value for the card
	 * @param suit The suit for the card
	 */
	public Card(int value, int suit)
	{
		if (value > 13 || value < 1)
		{
			System.err.println("Invalid Value for Card Declaration");
			//TODO: Code for throwing a ValueOutOfBoundsException goes heres
		}
		this.value = value;
		if (suit > 3 || suit < 0)
		{
			System.err.println("Invalid Suit for Card Declaration");
			//TODO: Code for throwing a SuitOutOfBoundsException goes heres
		}
		this.suit = suit;
	}
	/**
	 * Getter for the card's numeric value
	 * @return Returns the card's numeric value
	 */
	public int getValue()
	{
		return value;
	}
	/**
	 * Getter for the card's numeric suit
	 * @return Returns the card's numeric suit
	 */
	public int getSuit()
	{
		return suit;
	}
//	/**
//	 * 
//	 * @param c
//	 * @return
//	 */
//	public int compareTo(Card c)
//	{
//		
//	}
	/**
	 * Allows simple printing of cards
	 */
	public String toString()
	{
		return value+" of "+Reference.suitToString(suit);
	}
}