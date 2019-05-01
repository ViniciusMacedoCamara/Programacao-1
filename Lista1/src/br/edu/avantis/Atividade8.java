package br.edu.avantis;

import java.util.Scanner;

/*Uma prefeitura abriu uma linha de crédito para os funcionários estatutários.
 * O valor máximo da prestação não poderá ultrapassar 30% do salário bruto.
 * Faça um programa que leia o salário bruto e o valor da prestação e informe se o empréstimo pode ou não ser concedido.*/
public class Atividade8 {

	public static void main(String[] args) {

		float salarioBruto;
		float prestacao;
		//No calculo do salario * 0.3 a IDE disse que a variavel n era do tipo double, por isso usei double. Mas nao entendi.
		double valorFinal;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o salario bruto: ");
		salarioBruto = sc.nextFloat();
		
		System.out.println("Informe o valor da prestacao: ");
		prestacao = sc.nextFloat();
		
		valorFinal = salarioBruto * 0.3;
		
		if (prestacao <= valorFinal) {
			System.out.println("O empréstimo pode ser concedido.");
		} else {
			System.out.println("O empréstimo não pode ser concedido.");
		}
		
	}

}
