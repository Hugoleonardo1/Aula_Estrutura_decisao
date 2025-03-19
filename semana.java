package Projetos_LPA.aula_Estrutura_decisao;

import java.util.Scanner;

public class semana {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
	
	int diasemana;
	
	
	System.out.println("Informe o número do dia da semana: ");
	diasemana = ler.nextInt();
	
	if (diasemana == 1) {
		System.out.println("Domingo.");
	}
	else if (diasemana == 2) {
		System.out.println("Segunda-feira.");                         
	}
	else if (diasemana == 3) {
		System.out.println("Terça-feira.");
	}
	else if (diasemana == 4) {
		System.out.println("quarta-feira.");
	}
	else if (diasemana == 5) {
		System.out.println("quinta-feira.");
	}
	else if (diasemana == 6) {
		System.out.println("sexta-feira.");
	}
	else {
		System.out.println("sábado.");
	}
	
	ler.close();
	
	}
}

}
