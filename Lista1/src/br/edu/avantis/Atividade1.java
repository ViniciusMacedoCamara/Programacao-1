package br.edu.avantis;

import java.util.Scanner;

/*Faça um programa que solicite ao usuário uma letra e verifique se ela é uma vogal ou não, exibindo uma mensagem correspondente.*/
public class Atividade1 {

	public static void main(String[] args) {
		char caracter;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um caracter: ");
		caracter = sc.next().toUpperCase().charAt(0);
	
		if (caracter == 'A' || caracter == 'E' || caracter == 'I' || caracter == 'O' || caracter == 'U') {
			System.out.println("É uma vogal");
		} else {
			System.out.println("Nao é uma vogal");
		}

	}

}
