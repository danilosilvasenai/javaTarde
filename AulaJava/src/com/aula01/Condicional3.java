package com.aula01;

public class Condicional3 {

	public static void main(String[] args) {

		int media = 6;
		int presenca = 80;
		String situacao;
/* Crie uma condicional onde verifica se o 
 * aluno foi aprovado ou reprovado.
 * Para aprovado a media precisa ser maior ou
 *  igual a 7 e presenca igual ou maior a 75*/
		
		if( media >= 7 && presenca >= 75) {
			situacao="Aprovado";
		}else {
			situacao="Reprovado";
		}
		
		System.out.println(situacao);
		
	}

}
