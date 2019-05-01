package br.edu.avantis;

import java.util.Scanner;

public class exemplo1 {

	public static void main(String[] args) {
	
		double salario;
		int verifica = 1;
		Scanner sc = new Scanner(System.in);
		
		while (verifica == 1) {
			System.out.println("Informe o salario: ");
			salario = sc.nextDouble();
			if (salario <= 500) {
				salario = salario + (salario * 0.10);
			} else {
				salario = salario + (salario * 0.08);
			}
			System.out.println("Salario com aumento: " + salario);
			
			System.out.println("Deseja continuar? (1) para continuar...");
			verifica = sc.nextInt();
		}
		

	}

}
