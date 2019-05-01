package br.edu.avantis;

import java.util.Scanner;

/*Faça um programa que solicite ao usuário dois valores reais e exiba o maior dentre eles.
 * Caso eles sejam iguais exiba uma mensagem correspondente.*/
public class Atividade2 {

	public static void main(String[] args) {

		float num1;
		float num2;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o primeiro numero: ");
		num1 = sc.nextFloat();
		
		System.out.println("Informe o segundo numero: ");
		num2 = sc.nextFloat();
		
		if (num1 > num2) {
			System.out.println("\n" + num1 + " é o maior valor");
		} if (num1 < num2) {
			System.out.println("\n" + num2 + " é o maior valor");
		} if (num1 == num2) {
			System.out.println("\nOs valores sao iguais");
		}
		

	}

}
