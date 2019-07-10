package entities;

public class Financiamento extends Despesas{
	
	public Financiamento(int year, double totalValue, String type) {
		super(year, totalValue, type);

	}

	@Override
	public String toString() {
		return "Financiamento [getYear()=" + getYear() + ", getTotalValue()="
				+ getTotalValue() + ", getType()=" + getType()
				+ ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
}
