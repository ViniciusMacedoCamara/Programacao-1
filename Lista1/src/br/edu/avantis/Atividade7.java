package br.edu.avantis;

import java.util.Scanner;

/*Faça um programa que leia uma porcentagem e o preço de um produto. 
 * Se a porcentagem for menor que 25% acrescente o valor da porcentagem ao produto e exiba o valor final. 
 * Caso contrário, diminua a porcentagem do valor do produto e também exiba o valor final.*/
public class Atividade7 {

	public static void main(String[] args) {
	
		float precoProduto;
		float porcentagemProduto;
		float valorFinal;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o preco do produto: ");
		precoProduto = sc.nextFloat();
		
		System.out.println("Informe a porcentagem do produto: ");
		porcentagemProduto = sc.nextFloat();
		
		porcentagemProduto = porcentagemProduto / 100;

		if (porcentagemProduto < 0.25) {
			valorFinal = precoProduto + (precoProduto * porcentagemProduto);
			System.out.println("O valor final do produto sera: " + valorFinal);
		} else {
			valorFinal = precoProduto - (precoProduto * porcentagemProduto);
			System.out.println("O valor final do produto sera: " + valorFinal);
		}

	}

}
