package br.edu.avantis;

import java.util.Scanner;

/*Faça um programa que solicita ao usuário três números reais e exibe na tela apenas o menor deles.
 * Obs.: considere que sempre o usuário irá digitar 3 valores diferentes um do outro.
 * */
public class Atividade3 {

	public static void main(String[] args) {
		
		float num1;
		float num2;
		float num3;
		float menor = 0; //A IDE disse que eu precisava inicializar a variavel, por isso coloquei 0
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o primeiro numero: ");
		num1 = sc.nextFloat();
		
		System.out.println("Informe o segundo numero: ");
		num2 = sc.nextFloat();
		
		System.out.println("Informe o terceiro numero: ");
		num3 = sc.nextFloat();
		
		if (num1 < num2 && num1 < num3) {
			menor = num1;
		} if (num2 < num1 && num2 < num3) {
			menor = num2;
		} if (num3 < num1 && num3 < num2) {
			menor = num3;
		}
		
		System.out.println("\nO menor valor e: " + menor);
		
	}

}
