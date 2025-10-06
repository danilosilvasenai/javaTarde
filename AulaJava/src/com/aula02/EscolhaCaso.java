package com.aula02;

import java.util.Scanner;

public class EscolhaCaso {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
	System.out.print("Digite o número do mês: ");
	int numMes = entrada.nextInt();
	String nomeMes;
	if(numMes == 1){
		nomeMes = "Janeiro";
		System.out.println();
	}
	
	switch(numMes) {
		case 1: nomeMes = "Janeiro"; break;
		case 2: nomeMes = "Fevereiro"; break;
		case 3: nomeMes = "Março"; break;
		case 4: nomeMes = "Abril"; break;
		case 5: nomeMes = "Maio"; break;
		case 6: nomeMes = "Junho"; break;
		case 7: nomeMes = "Julho"; break;
		case 8: nomeMes = "Agosto"; break;
		case 9: nomeMes = "Setembro"; break;
		case 10: nomeMes = "Outubro"; break;
		case 11: nomeMes = "Novembro"; break;
		case 12: nomeMes = "Dezembro"; break;
		default: nomeMes = "Digite um mês valido";break;
	}
	
	System.out.println(nomeMes);
	System.out.println("");
	
	
	
	
	
	
	}

}
