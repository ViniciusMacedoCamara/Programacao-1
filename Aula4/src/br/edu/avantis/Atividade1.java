package br.edu.avantis;
import java.util.Scanner;
//ctrl shift o importa todas as bibliotecas do java
public class Atividade1 {

	public static void main(String[] args) {
	
		int matricula;
		int notaFinal;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o numero de matricula: ");
		matricula = sc.nextInt();
		System.out.println("Informe a nota do aluno: ");
		notaFinal = sc.nextInt();
		
		if (notaFinal >= 60) {
			System.out.println("\nAprovado com nota: " + notaFinal + " \nMatricula: " + matricula);
		} else {
			System.out.println("\nReprovado com nota: " + notaFinal + " \nMatricula: " + matricula);
		}

	}

}
