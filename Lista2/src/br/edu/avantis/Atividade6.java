package br.edu.avantis;

import java.util.Random;
import java.util.Scanner;

/*Elabore um algoritmo que leia um conjunto indeterminado de valores e informe, ao final, o maior e o menor valor lidos. 
 * O algoritmo deverá ser encerrado se o usuário digitar um valor negativo ou o valor 0.*/
public class Atividade6 {

	public static void main(String[] args) {
		//Rever a logica do menor valor...
		int valor;
		int maior = 0;
		int menor = 10000;
		Scanner sc = new Scanner(System.in);
		
		do {

			System.out.println("Digite um numero: ");
			valor = sc.nextInt();
			
			if (valor > maior) {
				maior = valor;
			}
			
			if (valor != 0 && valor < menor) {
				menor = valor;
			}
			
			
		} while (valor > 0);
		
		System.out.println("Maior " +maior+ " e menor " +menor);

	}

}
