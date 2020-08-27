package model;

public class CalcConsumptionTax {
	public void execute(Value value) {
		double result = value.getValue() * 1.08;
		value.setValue(result);
	}

}
