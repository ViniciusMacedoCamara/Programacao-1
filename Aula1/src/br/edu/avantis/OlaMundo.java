package br.edu.avantis;

import java.util.Scanner;

public class OlaMundo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String nome;
		
		System.out.println("Informe seu nome: ");
		nome = sc.next();
		
		System.out.println("Olah, " + nome);
		
	}

}
