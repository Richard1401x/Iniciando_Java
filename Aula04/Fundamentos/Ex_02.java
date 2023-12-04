package Fundamentos;
import java.util.StringTokenizer;
import java.util.Scanner;


/*Faça um programa que, a partir de um texto digitado pelo usuário, conte o número de
palavras (palavra é definida por qualquer sequência de caracteres delimitada por espaços
em branco) e exiba o resultado.*/

public class Ex_02 {

	public static void main(String[] args) {
		Scanner texto = new Scanner(System.in);
		System.out.printf("Digite o texto desejado: ");
		String texto1 = texto.nextLine();
		StringTokenizer cont = new StringTokenizer(texto1);
		System.out.println(cont.countTokens());
		 
		
	}

}
