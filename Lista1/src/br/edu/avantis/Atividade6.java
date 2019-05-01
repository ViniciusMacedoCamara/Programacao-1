package br.edu.avantis;

import java.util.Scanner;

/*Um caixa eletrônico de um banco contém somente cédulas de R$ 50,00, R$ 10,00 e R$ 5,00. Um usuário deseja fazer um saque. 
 * Verifique se o valor solicitado pelo usuário pode ser fornecido pela máquina. 
 * Em caso positivo, calcule e exiba o número mínimo de cada cédula para atender ao usuário. 
 * Caso contrário, exiba a mensagem “Valor indisponível”.*/
public class Atividade6 {

	public static void main(String[] args) {
		
		int valor;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bem-vindo ao Banco Bigode");
		System.out.println("Digite o valor desejado para o saque.");
		valor = sc.nextInt();
		
		int nota50 = 50;
		int nota10 = 10;
		int nota5 = 5;
		
		if (valor % 50 == 0 || valor % 10 == 0 || valor % 5 == 0) {
			if (valor >= nota50) {
				nota50 = valor / 50;
				valor = valor % 50;
				System.out.println("R$ 50,00 = " +nota50+ " cédula(s)");
			} if (valor >= nota10) {
				nota10 = valor / 10;
				valor = valor % 10;
				System.out.println("R$ 10,00 = " +nota10+ " cédula(s).");
			} if (valor >= nota5) {
				nota5 = valor / 5;
				valor = valor % 5;
				System.out.println("R$ 5,00 = " +nota5+ " cédula(s).");
			} 
		} else {
			System.out.println("Valor indisponível.");
		}
		
	}
}

