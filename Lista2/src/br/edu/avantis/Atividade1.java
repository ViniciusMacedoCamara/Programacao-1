package br.edu.avantis;

import java.util.Random;
import java.util.Scanner;

/*Vamos desenvolver um Jogo Adivinhação, você deve apresentar uma mensagem para o 
 * jogador dizendo que ele deve escolher um número de 1 a 10 para ele adivinhar. 
 * O jogador tem 3 chances para adivinhar o número que foi escolhido aleatoriamente (pesquisa sobre a Classe Random) pelo computador. 
 * Quando o jogo terminar, você deve perguntar ao jogador se ele quer jogar novamente.*/
public class Atividade1 {

	public static void main(String[] args) {
		
		int escolha;
		int escolhaCPU;
		int cont = 0;
		int jogarNovamente = 0;
		Random gerador = new Random();//Para gerar um numero aleatorio
		Scanner sc = new Scanner(System.in);
		
		do {

			System.out.println("Escolha um numero entre 1 e 10: ");
			escolha = sc.nextInt();

			escolhaCPU = gerador.nextInt(10)+1;
			
			if (escolha == escolhaCPU) {
				System.out.println("Acertou, a cpu escolheu: " + escolhaCPU);
				cont = 3;
			} else {
				System.out.println("Errou, a cpu escolheu: " + escolhaCPU);
				cont++;
			}
			if (cont == 3) {
				System.out.println("Deseja jogar Novamente? (0)Nao | (1)Sim: ");
				jogarNovamente = sc.nextInt();
				if (jogarNovamente == 0) {
					cont++;
				} else {
					cont = 0;
				}
			}
		} while (cont <= 3);
		
		System.out.println("Jogo Encerrado");

	}

}
