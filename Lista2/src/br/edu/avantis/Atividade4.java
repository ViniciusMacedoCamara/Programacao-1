package br.edu.avantis;

import java.util.Random;
import java.util.Scanner;

/*Crie um jogo para o usuário descobrir um número sorteado de 1 a 100. 
 * A cada tentativa dele, forneça uma dica falando se o número é maior ou menor. 
 * Quando ele descobrir exiba uma mensagem de parabéns e mostre em quantas tentativas ele conseguiu.*/
public class Atividade4 {

	public static void main(String[] args) {

		int escolha;
		int escolhaCPU;
		int cont = 0;
		int acertou = 0;
		Random gerador = new Random();//Para gerar um numero aleatorio
		Scanner sc = new Scanner(System.in);
		
		escolhaCPU = gerador.nextInt(100)+1;
		
		do {

			System.out.println("Escolha um numero entre 1 e 100: ");
			escolha = sc.nextInt();
			
			if (escolha == escolhaCPU) {
				System.out.println("Acertou, a cpu escolheu: " + escolhaCPU);
				acertou = 1;
			} else if (escolha < escolhaCPU) {
				System.out.println("O número digitado por você é MAIOR que o Sorteado. Tente novamente!!!");
			} else if (escolha > escolhaCPU) {
				System.out.println("O número digitado por você é MENOR que o Sorteado. Tente novamente!!!");
			}

			cont++;
			
		} while (acertou == 0);
		
		System.out.println("Parabéns!!! Você acertou em " +cont+ " tentativas.");
		
	}

}
