package br.edu.avantis;

import java.util.Scanner;

/*Faça um algoritmo que leia dois valores inteiros, A e B, e 
 * sem usar a operação de multiplicação, calcule a multiplicação de A por B. Exiba o resultado.*/
public class Atividade8 {

	public static void main(String[] args) {
	
		int valor1 = 0;
		int valor2 = 0;
		int resultado = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor 1: ");
		valor1 = sc.nextInt();
		
		System.out.println("Digite o valor 2: ");
		valor2 = sc.nextInt();
		
		for (int i = 0; i < valor2; i++) {
			resultado += valor1;
		}
		
		System.out.println(+valor1+ " x " +valor2+ " = " +resultado);

	}

}
