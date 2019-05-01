package br.edu.avantis;

import java.util.Scanner;

/*Faça um programa que leia um valor inteiro e informe se o mesmo é positivo ou negativo.
 * Obs.: Considere o valor zero como positivo.*/
public class Atividade4 {

	public static void main(String[] args) {
		
		int num1;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o primeiro numero: ");
		num1 = sc.nextInt();

		
		if (num1 >= 0) {
			System.out.println("\n" + num1 + " é um valor positivo");
		} else {
			System.out.println("\n" + num1 + " é um valor negativo");
		}

	}

}
