package Lista4;

import java.util.*;

public class Atividade6 {
	public static void main(String[] args) {
		/*
		 * 6. Faça um Programa que peça as quatro notas de 10 alunos, calcule e armazene num vetor a
			média de cada aluno, imprima o número de alunos com média maior ou igual a 7.0.
		 */
		Scanner input = new Scanner(System.in);
		
		int[][] alunos = new int[10][4];
		double[] media = new double[10];
		
		for(int i = 0; i < 2; i++) {
			int soma = 0;
			for(int j = 0; j < 4; j++) {
				System.out.println("Digite a nota "+ (j+1) + " do aluno " + (i+1) );
				alunos[i][j] = input.nextInt();
				soma += alunos[i][j];
				
			}
			media[i] = soma / 4;
		}
		
		for(int i = 0; i < 10; i++) {
			if(media[i] > 7) {
				System.out.println(media[i]);
			}
		}
		input.close();
	}
}
