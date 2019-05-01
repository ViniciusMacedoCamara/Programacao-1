package br.edu.avantis;

import java.util.Scanner;

/*Elabore um programa que faça o cálculo e exiba a área de um triângulo equilátero (3 lados iguais), 
 * onde a área é igual à base (lado do triângulo) multiplicada pela altura, e ambos divididos por 2.
*/
public class Atividade18 {

	public static void main(String[] args) {
		
		double ladoTriangulo;
		double area;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual tamanho do triângulo equilátero? ");
		ladoTriangulo= sc.nextDouble();
		
		area = (ladoTriangulo * ladoTriangulo) / 2;
		
		System.out.println("Area = " + area);
		
		
	}

}
