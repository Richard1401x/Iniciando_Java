package Fundamentos;
import java.util.Scanner;

/*Faça um programa que
verifique (usando if e else) se
uma letra digitada é “F” ou “M”.
Conforme a letra escrever: F –
Feminino, M- Masculino.*/
public class Atividade_05 {

	public static void main(String[] args) {
		try (//SOLICITA INFORMAÇÃO
		Scanner entrada = new Scanner(System.in)) {
			System.out.print("Escolha a opcao 'F' ou 'M': ");
			
			/*O METODO toLowerCase()RETORNA O VALOR DA STRING ORIGINAL CONVERTIDA PARA bits. 
			toLowerCase()NÃO ALTERA O VALOR DA STRING ORIGINAL.*/
			
			String resp = entrada.nextLine().toLowerCase();
			
			if(resp.equals("f")) {
				System.out.println("GENERO FEMININO");}
			else if (resp.equals("m")) {
				System.out.println("GENERO MASCULINO");}
			else {
				System.out.println("OPCAO INVALIDA");
			}
		}
		
	}

}
