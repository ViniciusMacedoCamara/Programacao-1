package br.edu.avantis;

import java.util.Random;
import java.util.Scanner;

//Jogo Pedra Papel e Tesoura
public class Atividade12 {

	public static void main(String[] args) {
	
		int escolha;
		int escolhaCPU;
		Random gerador = new Random();//Para gerar um numero aleatorio
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escolha Pedra(1) | Papel(2) | Tesoura(3): ");
		escolha = sc.nextInt();
		
		//Gerando escolha da maquina + 1 para somar o 0,1,2
		//Pedra = 1
		//Papel = 2
		//Tesoura = 3
		escolhaCPU = gerador.nextInt(3)+1;
		
		if ( (escolha == 1 && escolhaCPU == 3) || (escolha == 2 && escolhaCPU == 1) || (escolha == 3 && escolhaCPU == 2) ) {
			System.out.println("Parabens, voce ganhou. A maquina escolheu " + escolhaCPU);
		} else if ( (escolha == 1 && escolhaCPU == 1) || (escolha == 2 && escolhaCPU == 2) || (escolha == 3 && escolhaCPU == 3) ) {
			System.out.println("Empate a maquina escolheu " + escolhaCPU);
		} else {
			System.out.println("Que pena, voce perdeu. A maquina escolheu " + escolhaCPU);
		}
		
	}

}
