package edu.ncsu.monopoly;

public class CardCell extends Cell {
    public CardCell(int type, String name) {
        setName(name);
        this.type = type;
    }
}
