package br.edu.avantis;

import java.util.Scanner;

/*Faça um algoritmo que solicite um valor para o usuário, e gere a tabuada deste valor. 
 * Por exemplo, se o usuário informar o valor 2 deverá ser gerada a tabuada do número 2, variando de 0 a 10.*/
public class Atividadade3 {

	public static void main(String[] args) {

		int valor = 0;
		int tabuada = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o numero da tabuada: ");
		valor = sc.nextInt();
		
		for (int i = 0; i <= 10; i++) {

			tabuada = valor * i;
			System.out.println(valor + " x " + i + " = "+ tabuada);
			
		}

	}

}
