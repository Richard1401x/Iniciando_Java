package Fundamentos;

import java.util.Scanner;

public class Ex_02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int notaAluno = 5;
		
		double[] notas = new double[notaAluno];
		
		for (int x = 0; x < notaAluno; x++) {
			System.out.print("Digite as notas do aluno:" );
			notas[x] = scanner.nextDouble();
		}
		double somanotas = 0;
		for (double nota : notas) {
			somanotas += nota;
		}
		double mediaAluno = somanotas / notaAluno;
		
		System.out.println("A média da turma é: "+ mediaAluno);
		scanner.close();
	}

}
