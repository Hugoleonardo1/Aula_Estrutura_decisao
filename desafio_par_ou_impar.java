package Projetos_LPA.aula_Estrutura_decisao;

import java.util.Scanner;

public class desafio_par_ou_impar {

	public static void main(String[] args) {
	     
		Scanner ler = new Scanner(System.in);
		
		int numero;
		
		System.out.print("Informe um número inteiro: ");
		numero = ler.nextInt();
		
		if (numero % 2 == 0) {
			System.out.print("O número é par.");
		}
		else {
			System.out.print("O número é impar.");
		}
		ler.close();
		
	}

	}
		
		
		
