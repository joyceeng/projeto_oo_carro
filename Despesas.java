package entities;


import java.util.Date;


public class Despesas {

	private int year;
	private double totalValue;
	private String type;
	protected int op;
	public Despesas(){}

	public Despesas(int op,int year, double totalValue, String type) {
		this.op = op;
		this.year = year;
		this.totalValue = totalValue;
		this.type = type;

	}
	
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(double totalValue) {
		this.totalValue = totalValue;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		
		if(op==1){
			
		return "\nDespesas:\n\n>>Imposto " + "\nNome da despesa = " + type + "\nTotal pago = " + totalValue
				+ "\nAno em que ocorreu = " + year + "";
		}
		else if(op==2){
			return "\nDespesas:\n\n>>Seguro " + "\nNome da despesa = " + type + "\nTotal pago = " + totalValue
					+ "\nAno em que ocorreu = " + year + "";
		}
		else if(op==3){
			return "\nDespesas:\n\n>>Financiamento " + "\nNome da despesa = " + type + "\nTotal pago = " + totalValue
					+ "\nAno em que ocorreu = " + year + "";
		}
		return "\nDespesas:\n\n>>Multas " + "\nNome da despesa = " + type + "\nTotal pago = " + totalValue
				+ "\nAno em que ocorreu = " + year + "";
		
	}

}
