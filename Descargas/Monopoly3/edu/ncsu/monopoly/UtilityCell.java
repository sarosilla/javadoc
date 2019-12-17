package edu.ncsu.monopoly;

public class UtilityCell extends Cell {

	public static final String COLOR_GROUP = "UTILITY";
	private static int PRICE;

	public static void setPrice(int price) {
		UtilityCell.PRICE = price;
	}

	public int getRent(int diceRoll) {
		if(propietary.numberOfUtil() == 1) {
			return diceRoll * 4;
		} else if (propietary.numberOfUtil() >= 2) {
			return diceRoll * 10;
		}
		return 0;
	}

	public int getPrice() {
		return 0;
	}
}
