package br.edu.avantis;

import java.util.Scanner;

public class SomaNumeros {

	public static void main(String[] args) {
		
		int num1;
		int num2;
		int soma;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o valor para num1: ");
		num1 = sc.nextInt();
		System.out.println("Informe o valor para num2 ");
		num2 = sc.nextInt();
		soma = num1 + num2;
		System.out.println("\nSoma: "+soma);
		
	}

}
