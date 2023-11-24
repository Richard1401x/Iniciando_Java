package Fundamentos;

import java.util.Scanner;

public class Atividade_04 {
	
	public static void main(String[] args) {
	//SOLICITA 1º NOTA
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a primeira nota: ");
		
		double resp1 = entrada.nextDouble();
		
	//SOLICITA 2º NOTA
		Scanner entrada2 = new Scanner(System.in);
		System.out.println("Digite a segunda nota: ");
		
		double resp2 = entrada2.nextDouble();
	//CALCULA MEDIA
		double media1 = (resp1 + resp2)/2;
	// EXIBE A MÉDIA NA TELA
		System.out.println(" A media do Aluno(a) e " + media1);
	}
}
