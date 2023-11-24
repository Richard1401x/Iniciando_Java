package Fundamentos;

import java.util.Scanner;

public class Atividade_06 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("RESPONDA APENAS COM 'S' OU 'N': ");
		
		//PRIMEIRA PERGUNTA
		Scanner entrada1 = new Scanner(System.in);
		System.out.println("Telefonou para a vitima? ");
		String resp1 = entrada1.nextLine().toLowerCase();
		
		//SEGUNDA PERGUNTA
		Scanner entrada2 = new Scanner(System.in);
		System.out.println("Esteve no local do crime? ");
		String resp2 = entrada2.nextLine().toLowerCase();	
		
		//TERCEIRA PERGUNTA
		Scanner entrada3 = new Scanner(System.in);
		System.out.println("Mora perto da vitima? ");
		String resp3 = entrada3.nextLine().toLowerCase();
		
		//QUARTA PERGUNTA
		Scanner entrada4 = new Scanner(System.in);
		System.out.println("Devia para a vitima? ");
		String resp4 = entrada4.nextLine().toLowerCase();
		
		//QUINTA PERGUNTA
		Scanner entrada5 = new Scanner(System.in);
		System.out.println("Ja trabalhou com a vitima? ");
		String resp5 = entrada5.nextLine().toLowerCase();
		
		System.out.println("COM A APURACAO DO CASO, TEMOS O(A) INTERROGADO(A) COMO;");
		if (resp2.equals("s")) {
			System.out.println("SUSPEITO(A) DO CRIME");
		}
		else if (resp3.equals("s")) {
			System.out.println("CUMPLICE DO CRIME");
			}
		else if (resp4.equals("s")) {
			System.out.println("CUMPLICE DO CRIME");
		}
		
		else if (resp5.equals("s")) {
			System.out.println("ASSASINO DO CRIME");
		}
		else { System.out.println("INOCENTE") ;}
		}
	}


