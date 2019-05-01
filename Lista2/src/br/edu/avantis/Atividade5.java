package br.edu.avantis;

import java.util.Random;
import java.util.Scanner;

/*Chico tem 1,50 metros e cresce 2 centímetros por ano, enquanto Zé tem 1,10 metro e cresce 3 centímetros por ano. 
 * Construa um programa que calcule e imprima quantos anos serão necessários para que Zé seja maior que Chico.*/
public class Atividade5 {

	public static void main(String[] args) {
		
		double chico = 1.50;
		double ze = 1.10;
		int cont = 0;
		Scanner sc = new Scanner(System.in);
		
		while (ze < chico) {
			chico = chico + 0.02;
			ze = ze + 0.03;
			cont++;
		}
		
		System.out.println("Levará " +cont+ " anos para que Zé seja maior que Chico.");

	}

}
