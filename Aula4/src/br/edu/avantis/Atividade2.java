package br.edu.avantis;
import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
	
		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um numero: ");
		num = sc.nextInt();
		
		if (num >= 20 && num <= 90) {
			System.out.println("\nO numero esta entre 20 e 90 e eh: " + num);
		} else {
			System.out.println("\nO numero nao esta entre 20 e 90 e eh: " + num);
		}


	}

}
