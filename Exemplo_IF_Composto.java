package Projetos_LPA.aula_Estrutura_decisao;

import java.util.Scanner;

public class Exemplo_IF_Composto {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero;
		
		System.out.print("Informe o numero: ");
		numero= ler.nextInt();
		
		if (numero > 0) {        
			System.out.print("O numero é positivo");
		}
		else {
			System.out.print("O numero é negativo");
			
			ler.close();
		}
	}

}
