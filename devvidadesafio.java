package Projetos_LPA.aula_Estrutura_decisao;

import java.util.Scanner;

public class devvidadesafio {

	public static void main(String[] args) {
		double nota1, nota2, nota3, nota4, media;

		Scanner ler = new Scanner(System.in);

		System.out.print("Informe a nota 1: ");
		nota1 = ler.nextDouble();

		System.out.print("Informe a nota 2: ");
		nota2 = ler.nextDouble();

		System.out.print("Informe a nota 3: ");
		nota3 = ler.nextDouble();

		System.out.print("Informe a nota 4: ");
		nota4 = ler.nextDouble();

		media = (nota1 + nota2 + nota3 + nota4) / 4;

		if (media >= 6) {
			System.out.print("Você foi aprovado: " + media);
		}

		else if (media <4) {
			System.out.print("Você reprovou: " + media);
		}

		else {
			System.out.print("Você no exame: " + media);
		}

		ler.close();

	}

}
