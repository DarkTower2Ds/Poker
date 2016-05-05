package com.cs.poker;

import java.util.HashMap;

public class Player
{
	private String name;
	private HashMap<Chip, Integer> chips; //Integer represents number of that chip
	private Card[] playerHand;
	/**
	 * Creates a new player with a name and chips
	 * @param name The name of the player
	 * @param chips A HashMap of the player's starting chips
	 */
	public Player(String name, HashMap<Chip, Integer> chips)
	{
		this.name = name;
		this.chips = chips;
		playerHand = new Card[2];
	}
	
	//TODO Add more methods
}
