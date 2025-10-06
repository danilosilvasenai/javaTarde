package com.aula02;

import java.util.Scanner;

public class mediaValores {
	//Usando laço de repetição, pegue do usuario
	//10 notas e calcule a media das 10 notas
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double somaNotas=0;
		double media;
		double nota;
		int qtdNota = 10;
		
		
		
		for(int i=1; i <= qtdNota; i++) {
			System.out.print("Digite a "+i+"ª nota: ");
			nota = scan.nextDouble();
			
		}
		
		
		
	}

}
