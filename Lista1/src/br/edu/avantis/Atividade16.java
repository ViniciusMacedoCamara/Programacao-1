package br.edu.avantis;

import java.util.Scanner;

//IPTU da casa
public class Atividade16 {

	public static void main(String[] args) {
	
		double valorImovel;
		double valorAliquota;
		double formaPgmt;
		double escolha;
		int iptu;
		double total = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o valor do imovel: ");
		valorImovel = sc.nextDouble();
		
		System.out.println("Informe a aliquota: ");
		valorAliquota = sc.nextDouble();
		valorAliquota = valorAliquota / 100;
		
		System.out.println("Qual forma de pagamento, avista(1), boleto(2), parcelado em 12x(3): ");
		formaPgmt = sc.nextDouble();
		
		System.out.println("Efetuou o pagamento do iptu no ano passado? (1)Sim | (2)Nao: ");
		escolha = sc.nextDouble();
		
		iptu = (int) (valorImovel * valorAliquota);
		
		if (formaPgmt == 1 && escolha == 1) {
			//desconto 20% da forma
			//desconto 15% do ano passado
			total = iptu - (iptu * 0.35);
			System.out.println("Total IPTU R$ " + total);
		} else if (formaPgmt == 1 && escolha == 2) {
			//desconto 10% da forma
			total = iptu - (iptu * 0.10);
			System.out.println("Total IPTU  R$ " + total);
		} else if (formaPgmt == 2 && escolha == 1) {
			//desconto 10% da forma
			//desconto 15% do ano passado
			total = iptu - (iptu * 0.25);
			System.out.println("Total IPTU  R$ " + total);
		} else if (formaPgmt == 2 && escolha == 2) {
			//desconto 10% da forma
			total = iptu - (iptu * 0.10);
			System.out.println("Total IPTU  R$ " + total);
		} else if (formaPgmt == 3 && escolha == 1) {
			//desconto 15% do ano passado
			total = iptu - (iptu * 0.15);
			System.out.println("Total IPTU 12x de R$ " + total);
		} else if (formaPgmt == 3 && escolha == 2) {
			//Sem desconto nenhum
			total = iptu/12;
			System.out.println("Total IPTU 12x de R$ " + total);
		}
		
		System.out.println("===========");

	}

}
