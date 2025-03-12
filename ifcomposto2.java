package Projetos_LPA.aula_Estrutura_decisao;

import java.util.Scanner;

public class ifcomposto2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int numero;
		
		System.out.print("Informe o número: ");
		numero= ler.nextInt();
		
		if (numero > 0) {
			System.out.println("O número é postivo");
		}
		else if (numero == 0) {
			System.out.println("O numero é zero");
		}
		else {
			System.out.println("O número é negativo");
		}
		
		ler.close();
		}

	}


