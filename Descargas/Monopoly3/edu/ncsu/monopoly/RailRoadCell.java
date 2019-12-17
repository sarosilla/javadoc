package edu.ncsu.monopoly;

public class RailRoadCell extends Cell {
	static private int baseRent;
	static public String COLOR_GROUP = "RAILROAD";
	static private int price;

	public static void setBaseRent(int baseRent) {
		RailRoadCell.baseRent = baseRent;
	}

	public static void setPrice(int price) {
		RailRoadCell.price = price;
	}

	public int getRent() {
		return RailRoadCell.baseRent * (int)Math.pow(2, propietary.numberOfRR() - 1);
	}
	
	public int getPrice() {
		return 0;
	}
}
