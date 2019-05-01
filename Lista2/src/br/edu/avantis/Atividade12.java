package br.edu.avantis;

import java.util.Scanner;

/*Faça um algoritmo que gere, automaticamente, a tabuada dos valores de 1 a 10. 
 * Por exemplo, 1 x 1 = 1, 1 x 2 = 2, ... 1 x 10 = 10, 2 x 1 = 1, ..., 10 x 10 = 100.*/
public class Atividade12 {

	public static void main(String[] args) {
		
		int valor = 10;
		int tabuada = 0;
		Scanner sc = new Scanner(System.in);
		
		for (int i = 1; i <= 10; i++) {

			for (int j = 0; j <= 10; j++) {
				tabuada = i * j;
				System.out.println(i + " x " + j + " = "+ tabuada);
			}
			System.out.println("\n");
		}
	}

}
