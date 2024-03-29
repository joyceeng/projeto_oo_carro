package application;


import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.Despesas;
import entities.Financiamento;
import entities.Manutencao;
import entities.Multas;
import entities.Seguro;
import entities.Abastecimento;
import entities.Impostos;

public class Program {

	public static void main(String[] args) {

		ArrayList<Automovel> car = new ArrayList<>();
		int a=0,b=0,c=0;
		int saida = 1;
		for(;saida!=0;){
			int leitura = Integer.parseInt(JOptionPane.showInputDialog("1   Cadastro do veículo\n2  Despesas\n3  Relatórios\n0  Sair"));
		switch (leitura){
			case 0:
			JOptionPane.showMessageDialog(null,"Saindo...");
			saida = 0;
			break;

			case 1: 
				try{
				String marca = JOptionPane.showInputDialog("Digite a marca:");
				String modelo = JOptionPane.showInputDialog("Digite o modelo:");
				int anoDeModelo = Integer.parseInt(JOptionPane.showInputDialog("Digite ano de modelo (inteiro):"));
				int anoDeFabricacao = Integer.parseInt(JOptionPane.showInputDialog("Digite ano de fabricação (inteiro):"));
				float motorizacao = Float.parseFloat(JOptionPane.showInputDialog("Digite a motorização (float):"));
				String cor = JOptionPane.showInputDialog("Digite a cor:");
				String numPlaca = JOptionPane.showInputDialog("Digite o número da placa:");
				int numRenavam = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da Renavam (inteiro):"));				
				int resp = JOptionPane.showConfirmDialog(null, "O veículo é flex? ");
			

				if(resp==1){

					String combustivel1 = JOptionPane.showInputDialog("Digite o tipo de combustível:");
					Automovel carro = new Automovel(marca, modelo, anoDeFabricacao, anoDeModelo, motorizacao,
							combustivel1, cor, numPlaca, numRenavam);
					car.add(carro);
					//JOptionPane.showMessageDialog(null,car.get(car.size()-1).toString());

				}else if(resp==0){
					String combustivel1 = JOptionPane.showInputDialog("Digite o tipo de combustível 1:");
					String combustivel2 = JOptionPane.showInputDialog("Digite o tipo de combustível 2:");

					Automovel carro = new Automovel(marca, modelo, anoDeFabricacao, anoDeModelo, motorizacao,
							combustivel1, cor, numPlaca, numRenavam);
					carro.setCombustivel2(combustivel2);
					car.add(carro);
					//JOptionPane.showMessageDialog(null,car.get(car.size()-1).toString());
				}			

				}catch(java.lang.NumberFormatException e){
					JOptionPane.showMessageDialog(null,"Digite o formato pedido");
				}

				break;

				

			case 2:

				int desp = Integer.parseInt(JOptionPane.showInputDialog("1  Despesa de automóvel\n2  Despesa de abastecimento\n3  Despesas de manutenção\n"));
				switch (desp){		

				case 1:
					int op = Integer.parseInt(JOptionPane.showInputDialog("1  Imposto\n2  Seguro\n3  Financiamento\n4  Multas\n"));					
					switch(op){
						case 1:
							String type = JOptionPane.showInputDialog("Digite o nome da despesa:");
							int year = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano da despesa (inteiro):"));
							double totalValue2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor total:"));
							double ipva = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do IPVA:"));
							double licenca = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do licenciamento:"));
							Automovel imp = car.get(car.size()-1);
							imp.addImpostos(new Impostos(type, year, totalValue2, ipva, licenca));
							car.add(car.size()-1,imp);
							System.out.println(car.get(car.size()-1).getImpostos());
							break;
						case 2:
							String type1 = JOptionPane.showInputDialog("Digite o nome da despesa:");
							int year1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano da despesa (inteiro):"));
							double totalValue3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor total:"));
							double dpvat = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do DPVAT:"));
							double franquia = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da franquia:"));
							Automovel seg = car.get(car.size()-1);
							seg.addSeguro(new Seguro(type1, year1, totalValue3, dpvat, franquia));
							car.add(car.size()-1,seg);
					//		System.out.println(car.get(car.size()-1).getSeguro());
							break;
						case 3:
							String type2 = JOptionPane.showInputDialog("Digite o nome da despesa:");
							int year2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano da despesa (inteiro):"));
							double totalValue4 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor total:"));
							Automovel fin = car.get(car.size()-1);
							fin.addFinanciamento(new Financiamento(year2,totalValue4,type2));
							car.add(car.size()-1,fin);
					//		System.out.println(car.get(car.size()-1).getFinanciamento());
							break;
						case 4:
							String type3 = JOptionPane.showInputDialog("Digite o nome da despesa:");
							int year3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano da despesa (inteiro):"));
							double totalValue5= Double.parseDouble(JOptionPane.showInputDialog("Digite o valor total:"));
							Automovel mul = car.get(car.size()-1);
							mul.addMultas(new Multas(year3,totalValue5,type3));
							car.add(car.size()-1,mul);
							break;
						default:
							JOptionPane.showMessageDialog(null,"Digite uma opção válida");
							break;
					}
					/*Automovel auto = car.get(car.size()-1);
					auto.addDespesas(new Despesas(year,totalValue2,type));
					car.add(car.size()-1,auto);*/
					//System.out.println(car.get(car.size()-1).getDespesas());

					break;

				case 2:
					String data = JOptionPane.showInputDialog("Digite a data do abastecimento:");
					String combustivel1 = JOptionPane.showInputDialog("Digite o nome do combustível:");
					/*int combustivel2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o nome do segundo combustível:"));
						if (combustivel2 != 0) {
							
						}*/
					float quilometragem1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a quilometragem:"));
					float valorLitro = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do litro:"));
					float valorTotal = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor total abastecido:"));
					int tanque = JOptionPane.showConfirmDialog(null, "Tanque cheio? ");

					Automovel abast = car.get(car.size()-1);
					abast.addAbastecimento(new Abastecimento(combustivel1,quilometragem1,valorLitro,tanque));
					car.add(car.size()-1,abast);
					System.out.println(car.get(car.size()-1).getAbastecimento());
					
					break;

				case 3:
					String category3 = JOptionPane.showInputDialog("Digite o nome da despesa de manutenção:");
					float quilometragem2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a quilometragem:"));
					double totalValue3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor total:"));
					
					Automovel manutencao = car.get(car.size()-1);
					manutencao.addManutencao(new Manutencao(totalValue3, category3, quilometragem2));
					car.add(car.size()-1,manutencao);
					System.out.println(car.get(car.size()-1).getManutencao());
					break;
					
				default:
					JOptionPane.showMessageDialog(null,"Digite uma opção válida");
					break;
				}		

				break;

			case 3:
				int select = Integer.parseInt(JOptionPane.showInputDialog("1  Relatório Simples\n2  Relatório de desempenho\n"));
			

				switch(select){
					case 1:
						try{
							int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do vetor para relatório"));
							
							if(a == 0 && b == 0 && c == 0){
								JOptionPane.showMessageDialog(null,"Cadastre alguma despesa primeiro");
								break;
							}else
								if(c!=0){
								JOptionPane.showMessageDialog(null,car.get(valor).getManutencao());
								}
								if(b!=0){
								JOptionPane.showMessageDialog(null,car.get(valor).getAbastecimento());
								}
								if(a!=0){
								JOptionPane.showMessageDialog(null,car.get(valor).getDespesas());
								}
							
							}catch(java.lang.IndexOutOfBoundsException e){
								JOptionPane.showMessageDialog(null,"Não existe vetor com esse número");
							}
							break;

						case 2:
							break;
						default:
							JOptionPane.showMessageDialog(null,"Digite uma opção válida");
							break;					
					}

				break;

				
					default:
						JOptionPane.showMessageDialog(null,"Digite uma opção válida");
						break;
			}

		}



}

}
