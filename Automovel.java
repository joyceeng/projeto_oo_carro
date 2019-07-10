    
package application;


import java.util.ArrayList;



import entities.Abastecimento;
import entities.Financiamento;
import entities.Impostos;
import entities.Manutencao;
import entities.Multas;
import entities.Seguro;

import entities.Despesas;



public class Automovel {

	

	private ArrayList<Despesas> despesa = new ArrayList();
	private ArrayList<Abastecimento> abastecimento = new ArrayList();
	private ArrayList<Manutencao> manutencao = new ArrayList();
	private ArrayList<Impostos> impostos = new ArrayList();
	private ArrayList<Multas> multas = new ArrayList();
	private ArrayList<Financiamento> financiamento = new ArrayList();
	private ArrayList<Seguro> seguro = new ArrayList();
	
	private String marca;
	private String modelo;
	private int anoDeFabricacao;
	protected int anoDeModelo;
	public float motorizacao;
	protected String combustivel1,combustivel2= "";
	public String cor;
	protected String numPlaca;
	protected int numRenavam;
	//protected Despesas desp;

	

	/*public void addDespesas(Despesas d){

		despesa.add(d); 

	}

	public String getDespesas(){
		String s ="";
		for(int i=0; i< despesa.size();i++)
			s+= "\n"+despesa.get(i).toString();
		return s;

	}*/


	public void addAbastecimento(Abastecimento a){
		abastecimento.add(a); 
	}	

	public String getAbastecimento(){

		String s ="";
		for(int i=0; i< abastecimento.size();i++)
			s+= "\n"+abastecimento.get(i).toString();
		return s;
	}
	
	public void addManutencao(Manutencao m){
		manutencao.add(m); 
	}	

	public String getManutencao(){

		String s ="";
		for(int i=0; i< manutencao.size();i++)
			s+= "\n"+manutencao.get(i).toString();
		return s;
	}
	
	public void addImpostos(Impostos i){
		impostos.add(i);
	}
	public String getImpostos(){
		String s ="";
		for(int i=0; i< impostos.size();i++)
			s+= "\n"+impostos.get(i).toString();
		return s;
	}
	
	public void addMultas(Multas mm){
		multas.add(mm);
	}
	public String getMultas(){
		String s ="";
		for(int i=0; i< multas.size();i++)
			s+= "\n"+multas.get(i).toString();
		return s;
	}
	
	public void addFinanciamento(Financiamento f){
		financiamento.add(f);
	}
	public String getFinanciamento(){
		String s ="";
		for(int i=0; i< financiamento.size();i++)
			s+= "\n"+financiamento.get(i).toString();
		return s;
	}
	
	public void addSeguro(Seguro ss){
		seguro.add(ss);
	}
	public String getSeguro(){
		String s ="";
		for(int i=0; i< seguro.size();i++)
			s+= "\n"+seguro.get(i).toString();
		return s;
	}
	

	public Automovel(String marca, String modelo, int anoDeFabricacao, int anoDeModelo, float motorizacao,
			String combustivel1, String cor, String numPlaca, int numRenavam) {

		this.marca = marca;
		this.modelo = modelo;
		this.anoDeFabricacao = anoDeFabricacao;
		this.anoDeModelo = anoDeModelo;
		this.motorizacao = motorizacao;
		this.combustivel1 = combustivel1.toUpperCase();
		this.cor = cor;
		this.numPlaca = numPlaca;
		this.numRenavam = numRenavam;

	}



	public String getCombustivel2() {
		return combustivel2;
	}


	public void setCombustivel2(String combustivel2) {
		this.combustivel2 = combustivel2.toUpperCase();
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public int getAnoDeFabricacao() {
		return anoDeFabricacao;
	}


	public void setAnoDeFabricacao(int anoDeFabricacao) {
		this.anoDeFabricacao = anoDeFabricacao;
	}


	public int getAnoDeModelo() {
		return anoDeModelo;
	}


	public void setAnoDeModelo(int anoDeModelo) {
		this.anoDeModelo = anoDeModelo;
	}


	public float getMotorizacao() {
		return motorizacao;
	}


	public void setMotorizacao(float motorizacao) {
		this.motorizacao = motorizacao;
	}


	public String getCombustivel1() {
		return combustivel1;
	}


	public void setCombustivel1(String combustivel1) {
		this.combustivel1 = combustivel1;
	}


	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}


	public String getNumPlaca() {
		return numPlaca;
	}

	public void setNumPlaca(String numPlaca) {
		this.numPlaca = numPlaca;
	}

	public int getNumRenavam() {
		return numRenavam;
	}

	public void setNumRenavam(int numRenavam) {
		this.numRenavam = numRenavam;
	}

	@Override

	public String toString() {

		return "\nmarca= " + marca + ", \nmodelo= " + modelo

				+ ", \nanoDeFabricacao= " + anoDeFabricacao + ", \nanoDeModelo= "

				+ anoDeModelo + ", \nmotorizacao= " + motorizacao

				+ ", \ncombustivel1= " + combustivel1 + ", \ncombustivel2= "

				+ combustivel2 + ", \ncor= " + cor + ", \nnumPlaca= " + numPlaca

				+ ", \nnumRenavam= " + numRenavam + "]";

	}

	

	



}
