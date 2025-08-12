package Lista2;
import java.util.Scanner;

public class Atividade23 {
	public static void main(String[] args) {
		/*
		 * 23. Faça um Programa para ler três idades de alunos e seguir as seguintes instruções:
			◦ Se a média de idade dos alunos é inferior de 25, apresentar a mensagem
			"Turma Jovem";
			◦ Se a média de idade dos alunos é entre 25 e 40, apresentar a mensagem
			"Turma Adulta";
			◦ Se a média de idade dos alunos é acima de 40 anos, apresentar a
			mensagem "Turma Idosa".
		 */
		
		Scanner en = new Scanner(System.in);

		System.out.print("Informe idade aluno 1: ");
		int idade1 = en.nextInt();
		System.out.print("Informe idade aluno 2: ");
		int idade2 = en.nextInt();
		System.out.print("Informe idade aluno 3: ");
		int idade3 = en.nextInt();
		
		float media = ( idade1 + idade2 + idade3 ) / 3;
		if ( media < 25 ) {
			System.out.println("Turma Jovem!");
		}else if(media >= 25 && media <= 40 ) {
			System.out.println("Turma Adulta!");
		}else 
			System.out.println("Turma Idosa!");
			
		en.close();
	}
}
