package br.edu.avantis;

import java.util.Random;
import java.util.Scanner;

//Faça um algoritmo que leia 10 valores inteiros e mostre a sua soma.
public class Atividade2 {

	public static void main(String[] args) {
		
		int valor = 0;
		int soma = 0;
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite um valor: ");
			valor = sc.nextInt();
			
			soma += valor;
			
		}
		
		System.out.println("Soma: " + soma);

	}

}
