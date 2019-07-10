
package entities;

public class Seguro extends Despesas {

private String type;
private int year;
private double totalValue3;
private double dpvat;
private double franquia;

	public Seguro(String type, int year, double totalValue3, double dpvat, double franquia) {
		this.type = type;
		this.year = year;
		this.totalValue3 = totalValue3;
		this.dpvat = dpvat;
		this.franquia = franquia;
	}

	//private String empresa;
	//private float valorDoSeguro;
	//public String getEmpresa() {
	//	return empresa;
	//}

	/*public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public float getValorDoSeguro() {
		return valorDoSeguro;
	}

	public void setValorDoSeguro(float valorDoSeguro) {
		this.valorDoSeguro = valorDoSeguro;
	}
	//super.type = "Seguro";
*/

}

