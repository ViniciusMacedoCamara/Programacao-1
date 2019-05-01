package br.edu.avantis;

import java.util.Scanner;

/*Descreva um programa que dado o valor de um produto e o lucro sobre o mesmo, 
 *calcule o valor de venda e apresente na tela os dados detalhados.*/
public class Atividade14 {

	public static void main(String[] args) {
		
		float valorProduto;
		float lucro;
		float valorFinal;
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o valor do produto: ");
		valorProduto = sc.nextFloat();
		
		System.out.println("Informe a porcentagem do lucro: ");
		lucro = sc.nextFloat();
		
		lucro = lucro/100;
		valorFinal = valorProduto + (valorProduto*lucro);
		
		System.out.println("Valor do produto R$ " +valorProduto);
		System.out.println("Porcentagem do lucro: " +lucro*100 + "% Valor do lucro R$ " +valorProduto*lucro);
		System.out.println("Valor de venda R$ " +valorFinal);


	}

}
