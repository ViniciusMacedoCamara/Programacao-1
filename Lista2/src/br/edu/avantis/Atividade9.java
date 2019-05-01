package br.edu.avantis;

import java.util.Scanner;

/*Faça um algoritmo que solicite ao usuário um valor inteiro N (que deve ser maior que 0). 
 * N representa a quantidade de linhas de saída. Deve ser exibido na tela o texto exibido abaixo.*/
public class Atividade9 {

	public static void main(String[] args) {
		
		int valor = 0;
		int a = 1;
		int b = 2;
		int c = 3;
		int i;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		valor = sc.nextInt();
		
		for (i = 0; i <= valor; i++) {
			System.out.print(" " + a + " " + b + " "+ c + "PUM");
		
			a = a + 4;
			b = b + 4;
			c = c + 4;

			System.out.println();
		}

	}

}
