package model;

import java.io.Serializable;

public class Value implements Serializable{
	private double value;

	public Value(){

	}
	public double getValue() {
		return this.value;
	}
	public void setValue(double value) {
		this.value = value;
	}

}
