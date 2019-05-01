package br.edu.avantis;

import java.util.Scanner;

/*Solicite ao usuário a altura e o sexo de uma pessoa, e construa um programa para calcular seu peso ideal.
 * utilizando as seguintes fórmulas:
• para homens: 72,7 * altura – 58
• para mulheres: 62,1 * altura – 44,7*/
public class Atividade9 {

	public static void main(String[] args) {
		
		float altura;
		char sexo;
		double calculoHomem;
		double calculoMulher;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a altura: ");
		altura = sc.nextFloat();
		
		System.out.println("Informe o sexo: (M ou F)");
		sexo = sc.next().toUpperCase().charAt(0);
		
		calculoHomem = 72.7 * altura - 58;
		calculoMulher = 62.1 * altura - 44.7;

		if (sexo == 'F') {
			System.out.println("Seu peso ideal é: " +calculoMulher);
		} if (sexo == 'M') {
			System.out.println("Seu peso ideal é: " +calculoHomem);
		} if (sexo != 'M' && sexo != 'F') {
			System.out.println("Insira M para Masculino e F para Feminino");
		}
		
	}

}
