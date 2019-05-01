package br.edu.avantis;

import java.util.Scanner;

/*Sabe-se que um triângulo é formado por três lados que possuem uma determinada medida, 
 * mas essas não podem ser escolhidas aleatoriamente como os lados de um quadrado ou de um retângulo, 
 * é preciso seguir uma regra. Só irá existir um triângulo se, 
 * e somente se, os seus lados obedeceram à seguinte regra: 
 * um de seus lados deve ser maior que o valor absoluto (módulo) da diferença dos outros dois lados e 
 * menor que a soma dos outros dois lados. 
 * Veja o resumo da regra abaixo:*/
public class Atividade10 {

	public static void main(String[] args) {
	
		int a;
		int b;
		int c;
		int moduloDeA;
		int moduloDeB;
		int moduloDeC;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o lado A: ");
		a = sc.nextInt();
		
		System.out.println("Informe o lado B: ");
		b = sc.nextInt();
		
		System.out.println("Informe o lado C: ");
		c = sc.nextInt();

		//Calculo do modulo
		moduloDeA =  Math.abs(b-c);
		moduloDeB =  Math.abs(a-c);
		moduloDeC =  Math.abs(a-b);
		
		if ((moduloDeA < a && a < b+c) || (moduloDeB < b && b < a+c) || (moduloDeC < c && c < a+b)) {
			System.out.println("Este triângulo existe.");
		} else {
			System.out.println("Este triângulo não existe.");
		}

		
	}

}
