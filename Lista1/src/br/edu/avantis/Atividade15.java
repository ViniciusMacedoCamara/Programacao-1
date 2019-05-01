package br.edu.avantis;

import java.util.Scanner;

/*Descreva programa para calcular o salário de um funcionário. 
 * Considerar que o mesmo trabalha 30 dias por mês e 8 horas por dia. 
 * No entanto, o funcionário pode realizar horas extras, neste caso solicite o número de total de horas extras realizadas no mês. 
 * Considerar que as horas extras valem 50% a mais do que as horas trabalhadas normalmente. Informe os dados detalhados na tela.*/
public class Atividade15 {

	public static void main(String[] args) {
		//Rever a logica desse programa
		float valorHora;
		float horaExtra;
		float valorFinal;
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o valor ganho por hora trabalhada: ");
		valorHora = sc.nextFloat();
		
		System.out.println("Informe as horas extras: ");
		horaExtra = sc.nextFloat();
		
		horaExtra = (float) (horaExtra * (valorHora*0.5));
		valorFinal = ((30 * 8) * valorHora) + horaExtra;
		
		System.out.println("horaExtra R$ " +horaExtra);
		System.out.println("valorHora R$ " +valorHora);
		
		System.out.println("===========");
		
		System.out.println("Salario R$ " +valorFinal);

	}

}
