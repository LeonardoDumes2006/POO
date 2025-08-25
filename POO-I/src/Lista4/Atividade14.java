package Lista4;
import java.util.*;

public class Atividade14 {
	public static void main(String[] args) {
	/*
	 * 14. Foram anotadas as idades e alturas de 30 alunos. Faça um Programa que 
	 * determine quantos alunos com mais de 13 anos possuem 
	 * altura inferior à média de altura desses alunos.
	 */
		Scanner input = new Scanner(System.in);
		
		int[] idades = new int[30];
		int[] alturas = new int[30];
		int cont = 0;
		int soma = 0; 
		
		for ( int i = 0; i < 30; i++) {
			System.out.println("Digite idade aluno " + i);
			idades[i] = input.nextInt();
			soma += idades[i];
		}
		double media = soma / 30;
		
		for(int i = 0; i < 30; i++) {
			if(idades[i] > 13) {
				if(alturas[i] < media) {
					cont++;
				}
			}
		}
		System.out.println("O número de alunos com mais de 13 anos e "
				+ "altura inferior a média é : " + cont);
		input.close();
	}
}
