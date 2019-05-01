package br.edu.avantis;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		
		int salario;
		char classe;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a Classe (A, B, C): ");
		classe = sc.next().toUpperCase().charAt(0);
		
		System.out.println("Informe o salario: ");
		salario = sc.nextInt();
		
		switch (classe) {
		case 'A':
			salario = (int) ((salario*0.10) + salario);
			System.out.println("Salario " + salario);
			break;
		case 'B':
			salario = (int) ((salario*0.15) + salario);
			System.out.println("Salario " + salario);
			break;
		case 'C':
			salario = (int) ((salario*0.20) + salario);
			System.out.println("Salario " + salario);
			break;

		default:
			break;
		}
		
		
	}

}
