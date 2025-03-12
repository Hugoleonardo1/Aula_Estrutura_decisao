package Projetos_LPA.aula_Estrutura_decisao;

import java.util.Scanner;

public class idade_do_usuário {

	public static void main(String[] args) {
	
int idade;
		
        Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe sua idade: ");
        idade = ler.nextInt();
       
        
        if (idade <= 12) {
        System.out.print("Você é uma criança: " + idade);
        }
        
        else if (idade >=12 && idade <=17) {
        	System.out.print("Você é um adolescente: " + idade);
        }
        else if (idade >=18 && idade <=59) {
        	System.out.print("Você é um adulto: " + idade);
	    }
        else {
        	System.out.print("Você é um idoso: " + idade);
        }

	}

}