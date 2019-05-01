package br.edu.avantis;

import java.util.Scanner;

//CLT
public class Atividade17 {

	public static void main(String[] args) {
		
		char vendaFerias;
		char ferias;
		char anosFerias;
		int mesesEmpresa;
		double salarioBase;
		double valorFinal;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual seu salario base? ");
		salarioBase= sc.nextDouble();
		
		System.out.println("Quantos meses de empresa voce tem? ");
		mesesEmpresa= sc.nextInt();
		
		System.out.println("A empresa tem ferias coletivas? Sim(S) | Nao(N) ");
		ferias= sc.next().toUpperCase().charAt(0);
		
		System.out.println("Quer vender 10 dias de suas ferias? Sim(S) | Nao(N) ");
		vendaFerias= sc.next().toUpperCase().charAt(0);
		
		System.out.println("===========");

		
		if (mesesEmpresa >=12) {
			System.out.println("Retirou Ferias no prazo de 12 meses? Sim(S) | Nao(N) ");
			anosFerias= sc.next().toUpperCase().charAt(0);
			if (anosFerias == 'S' && vendaFerias == 'N') {
				//Conta integral das ferias + 1/3 de abono
				valorFinal = salarioBase + (salarioBase * 0.33);
				System.out.println("Voce recebe integral das ferias + 1/3 de abono: "+valorFinal);
			} else if (anosFerias == 'S' && vendaFerias == 'S') {
				//Conta integral das ferias + 1/3 de abono + 10 dias de salario
				valorFinal = salarioBase + (salarioBase * 0.33) + ((salarioBase/30) * 10);
				System.out.println("Voce recebe integral das ferias + 1/3 de abono + 10 dias de salario: "+valorFinal);
			} else {
				//dobro 
				valorFinal = salarioBase * 2;
				System.out.println("Voce recebe o dobro: "+valorFinal);
			}
		} else if (ferias == 'S') {
			//Proporcional
			valorFinal = salarioBase / mesesEmpresa;
			System.out.println("Voce recebe proporcional: "+valorFinal);
		} else {
			//nao tem direito as ferias
			System.out.println("Voce nao tem direito a ferias");
		}
		
		//System.out.println("Salario R$ " +valorFinal);

	}

}
