package com.cs.poker;

public class Chip
{
	private int value;
	/**
	 * Creates a new chip with a value
	 * @param value The value, in $, of the chip
	 */
	public Chip(int value)
	{
		this.value = value;
	}
	/**
	 * Getter for the value of the chip
	 * @return Returns the value, in $, of the chip
	 */
	public int getValue()
	{
		return value;
	}
	/**
	 * Allows simple printing of the chip
	 */
	public String toString()
	{
		return "$" + value;
	}
}
