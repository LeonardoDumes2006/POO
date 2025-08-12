package Lista2;
import java.util.Scanner;

public class Atividade17 {
	public static void main(String[] args) {
		/*
		 * 17. Faça um programa que lê as duas notas parciais obtidas por um aluno numa disciplina ao
				longo de um semestre, e calcule a sua média. A atribuição de conceitos obedece à tabela
				abaixo:
				Média de Aproveitamento Conceito
				Entre 9.0 e 10.0 A
				Entre 7.5 e 9.0 B
				Entre 6.0 e 7.5 C
				Entre 4.0 e 6.0 D
				Entre 4.0 e zero E
		 */
				
				Scanner en = new Scanner(System.in);

				System.out.print("Informe uma nota: ");
				float nota1 = en.nextFloat();
				System.out.print("Informe uma nota: ");
				float nota2 = en.nextFloat();
				
				float media = ( nota1 + nota2 ) / 2 ;
				String conceito = "";
				String situacao = "";
				
				if(media >= 9 && media <=10  ) {
					conceito = "A";
				}else if( media < 9 && media >= 7.5) {
					conceito = "B";
				}else if( media >= 6 && media < 7.5) {
					conceito = "C";
				}else if( media >= 4 && media < 6 ) {
					conceito = "D";
				}else if( media < 4 ) {
					conceito = "E";
				}	
				
				if( media >= 6 ) {
					situacao = "Aprovado";
				}else 
					situacao = "Reprovado";
				
				System.out.println("Nota 1 : " + nota1);
				System.out.println("Nota 2 : " + nota2);
				System.out.println("Média : " + media);
				System.out.println("Conceito : " + conceito);
				System.out.println("Situação : " + situacao );
				
				en.close();
	}
}
