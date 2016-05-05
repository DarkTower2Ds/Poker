package com.cs;

public class Reference 
{
	public static final int SUIT_SPADES = 0;
	public static final int SUIT_HEARTS = 1;
	public static final int SUIT_CLUBS = 2;
	public static final int SUIT_DIAMONDS = 3;
	/**
	 * Converts the integer values of suits to a string value.
	 * @param suit The suit to convert.
	 * @return Returns the String value of the number, either Spades, Hearts, Clubs, or Diamonds.
	 */
	public static String suitToString(int suit)
	{
//		if (suit < 0 || suit < 3)
//			//TODO: Insert the code for a SuitOutOfBoundsException here.
		return (suit == SUIT_SPADES)?"Spades":(suit == SUIT_HEARTS)?"Hearts":(suit == SUIT_CLUBS)?"Clubs":(suit == SUIT_DIAMONDS)?"Diamonds":"ErrSuit";
	}
	public static final int VALUE_ACE = 1;
	public static final int VALUE_JACK = 11;
	public static final int VALUE_QUEEN = 12;
	public static final int VALUE_KING = 13;
}