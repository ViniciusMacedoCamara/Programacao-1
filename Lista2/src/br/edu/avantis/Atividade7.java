package br.edu.avantis;

import java.util.Scanner;

public class Atividade7 {

	public static void main(String[] args) {
		
		int numCorretor = 1;
		double vendaCorretor;
		double comissaoCorretor = 0;
		double totalVenda = 0;
		double totalComissao = 0;
		int sair;
		int i = 0;
		Scanner sc = new Scanner(System.in);
		
		do {
			
			System.out.println("O corretor " +numCorretor+ " vendeu quanto no mes? " );
			vendaCorretor = sc.nextDouble();
			
			if (vendaCorretor > 3000) {
				comissaoCorretor = (vendaCorretor * 0.35);
			} else if (vendaCorretor > 1500 && vendaCorretor < 3000) {
				comissaoCorretor = vendaCorretor - (vendaCorretor * 0.20);
			} else if (vendaCorretor < 1500) {
				comissaoCorretor = vendaCorretor - (vendaCorretor * 0.13);
			}
			
			System.out.println("O corretor " +numCorretor+ " recebera " +comissaoCorretor+ " de comissao");
			
			totalVenda += vendaCorretor;
			totalComissao += comissaoCorretor;
			
			System.out.println("Se quiser sair digite 1");
			sair = sc.nextInt();
			numCorretor++;
		} while (sair != 1);
		
		System.out.println("Total de Vendas da Companhia: " +totalVenda);
		System.out.println("Foram pagos R$ "+totalComissao+" em comissões para os " +(numCorretor - 1)+ " corretores");
		
	}

}
