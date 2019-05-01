package br.edu.avantis;

import java.util.Scanner;

/*Faça um programa que solicite ao usuário dois valores inteiros e informe, ao final, se eles são múltiplos ou não.*/
//No enunciado da questao tem um erro de digitacao na tabela de demonstracao.
public class Atividade5 {

	public static void main(String[] args) {

		int num1;
		int num2;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o primeiro numero: ");
		num1 = sc.nextInt();

		System.out.println("Informe o segundo numero: ");
		num2 = sc.nextInt();
		
		if (num1 % num2 == 0) {
			System.out.println("\n" + num1 + " e " + num2 + " sao multiplos");
		} else {
			System.out.println("\n" + num1 + " e " + num2 + " nao sao multiplos");
		}

	}

}
