package entities;


import java.util.Date;



public class Abastecimento extends Despesas {

	private float anterior;
	private float atual;
	private Date data;
	private String tipoDeCombustivel;
	private float quilometragem;
	private float valorDoLitro;
	private double tipoDoAbastecimento;
	private float valorAbastecido;

	

	public Abastecimento(String tipoDeCombustivel, float quilometragem, float valorDoLitro,
			double tipoDoAbastecimento) {
		
		this.tipoDeCombustivel = tipoDeCombustivel;
		this.quilometragem = quilometragem;
		this.valorDoLitro = valorDoLitro;
		this.tipoDoAbastecimento = tipoDoAbastecimento;
	}

	public double Abastecimento(float valorDoLitro, float litrosAbastecidos  ) {

		this.valorAbastecido = valorDoLitro * litrosAbastecidos; 
		return valorDoLitro * litrosAbastecidos;

	}

	

	

}
