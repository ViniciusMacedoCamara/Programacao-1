package br.edu.avantis;

import java.util.Scanner;

/*Desenhe a pirâmide de asteriscos abaixo. 
 * O usuário deve determinar a quantidade de linhas, sendo que não pode ser digitado a quantidade de linhas menor que 1.*/
public class Atividade10 {

	public static void main(String[] args) {
		
		int valor = 0;
		int i;
		int j;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		valor = sc.nextInt();
		
		for (i = 1; i <= valor; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
