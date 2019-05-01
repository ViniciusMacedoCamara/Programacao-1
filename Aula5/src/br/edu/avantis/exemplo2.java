package br.edu.avantis;

import java.util.Scanner;

public class exemplo2 {

	public static void main(String[] args) {
		
		int digito = 1;
		int cont = 0;
		int contPar = 0;
		int contImpar = 0;
		Scanner sc = new Scanner(System.in);
		
		while (digito != 0) {
			System.out.println("Informe um digito: ");
			digito = sc.nextInt();
			cont ++;
			
			if (digito % 2 == 0) {
				contPar++;
			} else {
				contImpar++;
			}
			
			System.out.println("Se preferir sair digite 0...");
			digito = sc.nextInt();
		}
		
		System.out.println("quantidade de numeros digitados: " + cont);
		System.out.println("quantidade de numeros digitados Par: " + contPar);
		System.out.println("quantidade de numeros digitados Impar: " + contImpar);
		
	}

}
