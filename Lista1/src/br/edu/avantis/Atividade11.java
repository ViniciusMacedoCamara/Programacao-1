package br.edu.avantis;

import java.util.Scanner;

/*Faça um programa que calcule o salário de um funcionário. 
 * Deve ser solicitado ao usuário o nome do funcionário, seu salário bruto e o número de dependentes. 
 * Ao final deve ser exibido o nome do funcionário e seu salário líquido. Considere a seguinte regra para o cálculo:
Salário Líquido = Salário Bruto – INSS + (50,00 * Número de Dependentes) + Auxílio Passagem (80,00) + Auxílio Refeição (100,00)*/
public class Atividade11 {

	public static void main(String[] args) {
	
		String nome;
		int numeroDeDependente;
		int calculo;
		float salarioBruto;
		float salarioLiquido;
		
		final int auxilioPassagem = 80;
		final int auxilioRefeicao = 100;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe seu nome: ");
		nome = sc.next();
		
		System.out.println("Informe o salario bruto: ");
		salarioBruto = sc.nextFloat();
		
		System.out.println("Informe o numero de dependente(s): ");
		numeroDeDependente = sc.nextInt();
		
		calculo = (50 * numeroDeDependente) + auxilioPassagem + auxilioRefeicao;
		
		if (salarioBruto <= 880) {
			salarioLiquido = (float) (salarioBruto - (salarioBruto * 0.08) + calculo);
		} else if (salarioBruto > 881 && salarioBruto <= 2640) {
			salarioLiquido = (float) (salarioBruto - (salarioBruto * 0.09) + calculo);
		} else {
			salarioLiquido = (float) (salarioBruto - (salarioBruto * 0.1) + calculo);
		}
		
		System.out.println("O(A) funcionário(a) " +nome+ " tem o Salário Líquido de R$ " + salarioLiquido);		
		
	}

}
