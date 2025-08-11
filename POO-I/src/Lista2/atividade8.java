package Lista2;
import java.util.Scanner;

public class atividade8 {
	public static void main(String[] args) {
		/*
		 * 8. Faça um programa para a leitura de duas notas parciais de um aluno. O programa deve
			calcular a média alcançada pelo aluno e apresentar:
			o A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
			o A mensagem "Reprovado", se a média for menor do que sete;
		 */
		
		Scanner en = new Scanner(System.in);

		System.out.print("Informe uma nota: ");
		float nota1 = en.nextFloat();
		System.out.print("Informe uma nota: ");
		float nota2 = en.nextFloat();
		
		float media = ( nota1 + nota2 ) / 2 ;
		
		if(media >= 7 ) {
			System.out.println("Aprovado");
		}else 
			System.out.println("Reprovado");
			
	}
}
