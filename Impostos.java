
package entities;



public class Impostos extends Despesas {
	
	private String type;
	private int year;
	private double totalValue2;
	private double ipva;
	private double licenca;
	
	public Impostos(String type, int year, double totalValue2, double ipva, double licenca) {
		this.type = type;
		this.year = year;
		this.totalValue2 = totalValue2;
		this.ipva = ipva;
		this.licenca = licenca;
    }
}
