package br.edu.avantis;

import java.util.Scanner;

//Faca um programa que leia um numero inteiro e imprima seu antecessor e seu sucessor.

public class AntecessorESucessor {

	public static void main(String[] args) {

		int num1;
		int antecessor;
		int sucessor;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um valor: ");
		num1 = sc.nextInt();
		
		antecessor = num1 - 1;
		sucessor = num1 + 1;
		
		System.out.println("\nAntecessor: " + antecessor + " | numero: " + num1 + " | sucessor: " + sucessor);

	}

}
