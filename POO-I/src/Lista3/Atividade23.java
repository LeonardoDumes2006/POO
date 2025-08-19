package Lista3;

import java.util.Scanner;

public class Atividade23 {
	public static void main(String[] args) {
		/*
		 * 23. Faça um programa que calcule o número médio de alunos por turma. Para isto, peça a
			quantidade de turmas e a quantidade de alunos para cada turma. As turmas não podem ter
			mais de 40 alunos.
		 */
		
		Scanner en = new Scanner(System.in);
		System.out.println("Quantidade de turmas");
		int turmas = en.nextInt();
		int media = 0;
		int soma = 0;
		int aux = 0;
		do {
			System.out.println("Quantidade de alunos da turma " );
			int alunos = en.nextInt();
			if(alunos > 40) {
				System.out.println("Turma não pode ser maior que 40 alunos");
				
			}else {
				soma += alunos;
				aux++;
			}
			
		}while(aux < turmas);
		
		media = soma / turmas;
		System.out.println("A média de alunos por turma é " + media);
		en.close();
	}
}
