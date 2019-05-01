package br.edu.avantis;

import java.util.Scanner;

/*Desenhe a pirâmide de asteriscos abaixo. 
 * O usuário deve determinar a quantidade de linhas, sendo que não pode ser digitado a quantidade de linhas menor que 1.*/
public class Atividade11 {

	public static void main(String[] args) {

		int linhas;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de linhas: ");
		linhas = sc.nextInt();
		
		//construir a quantidade de piramides
		for (int i = 0; i < linhas; i++) {
			
			for (int j = 0; j <= i; j++) {
				
				for (int k = 0; k <= j; k++) {
					System.out.print("*");
				}
				
				System.out.println("");
			}
			System.out.println("");
		}
		
	}

}
