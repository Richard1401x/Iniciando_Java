package Fundamentos;
/*Para cada conjunto de valores abaixo, escreva o código Java, usando laço(s), que preencha
 * um array com os valores*/
 import java.util.Scanner;
public class Ex_01 {

	public static void main(String[] args) {
		Scanner entrada1 = new Scanner(System.in);
		int[] lista;
		lista = new int[10];
		for (int x=0; x <= (lista.length - 1); x++) {
			System.out.printf("\nDigite os numero da PRIMEIRA lista:  ", x+1);
			lista[x] = entrada1.nextInt();
		}
		for(int i=0; i<= (lista.length -1); i++) {
			System.out.printf(lista[i]+" ");
		}
	
		Scanner entrada2 = new Scanner(System.in);
		int[] listaDois;
		listaDois = new int[10];
		for (int x=0; x <= (listaDois.length - 1); x++) {
			System.out.printf("\nDigite os numero da SEGUNDA lista:  ", x+1);
			listaDois[x] = entrada2.nextInt();
		}
		for(int i=0; i<= (listaDois.length -1); i++) {
			System.out.printf(listaDois[i]+" ");
	}
		Scanner entrada3 = new Scanner(System.in);
		int[] lista3;
		lista3 = new int[10];
		for (int x=0; x <= (lista3.length - 1); x++) {
			System.out.printf("\nDigite os numero da TERCEIRA lista:  ", x+1);
			lista3[x] = entrada3.nextInt();
		}
		for(int i=0; i<= (lista3.length -1); i++) {
			System.out.printf(lista3[i]+" ");
	}
		Scanner entrada4 = new Scanner(System.in);
		int[] lista4;
		lista4 = new int[10];
		for (int x=0; x <= (lista4.length - 1); x++) {
			System.out.printf("\nDigite os numero da QUARTA lista:  ", x+1);
			lista4[x] = entrada4.nextInt();
		}
		for(int i=0; i<= (lista4.length -1); i++) {
			System.out.printf(lista4[i]+" ");
	}
}
}

