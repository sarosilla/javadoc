package edu.ncsu.monopoly;

public abstract class Cell implements IOwnable {

	protected int type;
	private boolean available = true;
	private String name;
	protected Player propietary;

	public void playAction() {
	}

	public int getType() {
	    return type;
	}

	public String getName() {
		return name;
	}

	public Player getPropietary() {
		return propietary;
	}

	public int getPrice() {
		return 0;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	void setName(String name) {
		this.name = name;
	}

	public void setPropietary(Player owner) {
		this.propietary = owner;
	}

	public String toString() {
	    return name;
	}
}
