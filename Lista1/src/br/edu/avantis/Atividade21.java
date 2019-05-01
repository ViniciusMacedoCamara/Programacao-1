package br.edu.avantis;

import java.util.Scanner;

/*O tempo para o dia seguinte na cidade de Balneário Camboriú é bem regular e fácil de prever. 
 * O meteorologista da cidade criou uma tabela para prever se haverá chuva no dia seguinte a 
 * partir de quatro variáveis cujo valor depende das condições meteorológicas do dia anterior.
Sendo estas: V – se está ventando; F – se faz frio; U – se está úmido; e, N – se está nublado. 
As quatro variáveis são medidas pelo meteorologista e ele atribui um valor 0 (falso) ou 1 (verdadeiro) para cada uma delas. 
O resultado da previsão de chuva para amanhã é visto que em Balneário Camboriú: 
função lógica de V (vento hoje), F (frio hoje), U (dia úmido hoje) e N (nublado hoje).
Sabendo disso, faça um programa que a partir dos valores informados para as variáveis, 
determine se irá chover amanhã em Balneário Camboriú.
 * */
public class Atividade21 {

	public static void main(String[] args) {
		
		int ventando;
		int frio;
		int umido;
		int nublado;
		Scanner sc = new Scanner(System.in);

		System.out.println("Esta ventando? (0)Nao | (1)Sim: ");
		ventando= sc.nextInt();
		
		System.out.println("Esta frio? (0)Nao | (1)Sim: ");
		frio= sc.nextInt();

		System.out.println("Esta umido? (0)Nao | (1)Sim: ");
		umido= sc.nextInt();
		
		System.out.println("Esta nublado? (0)Nao | (1)Sim: ");
		nublado= sc.nextInt();
		
		if (ventando == 1 && frio == 1 && umido == 1 && nublado == 1) {
			System.out.println("Amanha vai chover!");
		} else {
			System.out.println("Amanha nao ira chover");
		}

	}

}
