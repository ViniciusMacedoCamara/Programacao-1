package br.edu.avantis;

import java.util.Scanner;

/*Escreva um programa que leia as 3 notas de um aluno e calcule a média final deste aluno.
 * Considerar que a média é ponderada e que o peso das notas são: 2, 3 e 5 respectivamente.*/
public class Atividade19 {

	public static void main(String[] args) {
		
		double nota1;
		double nota2;
		double nota3;
		double mediaFinal;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a nota 1: ");
		nota1= sc.nextDouble();
		nota1 = nota1 * 0.2;
		
		System.out.println("Digite a nota 2: ");
		nota2= sc.nextDouble();
		nota2 = nota2 * 0.3;
		
		System.out.println("Digite a nota 3: ");
		nota3= sc.nextDouble();
		nota3 = nota3 * 0.5;
		
		mediaFinal = nota1 + nota2 + nota3;
		
		System.out.println("Media Final: " + mediaFinal);

	}

}
