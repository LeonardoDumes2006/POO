package Lista2;
import java.util.Scanner;

public class Atividade24 {
	public static void main(String[] args) {
		/*
		 * 24. Faça um Programa para leitura de três notas parciais de um aluno. O programa deve
			calcular a média alcançada por aluno e presentar:
			
			◦ A mensagem "Aprovado", se a média for maior ou igual a 7, com a respectiva
			média alcançada;
			◦ A mensagem "Reprovado", se a média for menor do que 7, com a respectiva
			média alcançada;
			◦ A mensagem "Aprovado com Distinção", se a média for igual a 10.
		 */
		
		Scanner en = new Scanner(System.in);

		System.out.print("Informe nota 1 : ");
		float nota1 = en.nextFloat();
		System.out.print("Informe nota 2 : ");
		float nota2 = en.nextFloat();
		System.out.print("Informe nota 3 : ");
		float nota3 = en.nextFloat();
		
		float media = ( nota1 + nota2 + nota3) / 3;
		if(media == 10) {
			System.out.println("Aprovado com Distinção");
		}else if(media < 7 ) {
			System.out.println("Reprovado");
		}else if ( media >= 7) {
			System.out.println("Aprovado");
		}
	}
}
