package br.edu.avantis;

import java.util.Scanner;

/*Escreva um programa que calcule a expressão lógica, sendo que o usuário deverá informar os valores para as variáveis.
((X >= Y) AND (Z <=X)) OR ((X == W) AND (Y == Z)) OR (NOT(X != W))*/
public class Atividade20 {

	public static void main(String[] args) {

		int valorW;
		int valorX;
		int valorY;
		int valorZ;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite valor para W: ");
		valorW= sc.nextInt();

		System.out.println("Digite valor para X: ");
		valorX= sc.nextInt();

		System.out.println("Digite valor para Y: ");
		valorY= sc.nextInt();
		
		System.out.println("Digite valor para Z: ");
		valorZ= sc.nextInt();
		
		if (((valorX >= valorY) && (valorZ <= valorX)) || ((valorX == valorW) && (valorY == valorZ)) || (!(valorX != valorW))) {
			System.out.println("Verdadeiro");
		} else {
			System.out.println("Falso");
		}

	}

}
