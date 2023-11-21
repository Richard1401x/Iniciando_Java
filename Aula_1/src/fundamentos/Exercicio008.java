package fundamentos;
import java.util.Scanner;

public class Exercicio008 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		
		double resp = entrada.nextDouble();
		
		if (resp < 0) {
			System.out.println("O numero" + resp + " e negativo.");
		} else {
			System.out.println("O numero " + resp + " e positivo.");
		}
	}
}
