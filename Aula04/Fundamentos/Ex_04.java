package Fundamentos;

import java.util.Scanner;

public class Ex_04 {

	public static void main(String[] args) {
		Scanner texto = new Scanner(System.in);
		System.out.println("Digite um texto com letras minusculas: ");
		String texto1 = texto.nextLine();
		String resultado2 = texto1.toUpperCase(); /*HELLO*//*Para converter todos os caracteres de uma string para maiúsculo usa-se o método toUpperCase ( )*/
		System.out.println(resultado2);
		texto.close();
	}

}
