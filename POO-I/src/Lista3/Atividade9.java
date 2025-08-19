package Lista3;
import java.util.Scanner;
public class Atividade9 {
	public static void main(String[] args) {
		/*
		 * 9. Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro
			entre 1 a 10. O usuário deve informar de qual numero ele deseja ver a tabuada. A saída deve
			ser conforme o exemplo abaixo:
			• Tabuada de 5:
			5 x 1 = 5
			5 x 2 = 10
			...
			5 x 10 = 50
		 */
		
		Scanner en = new Scanner(System.in);
		System.out.println("DIgite um número inteiro");
		int num = en.nextInt();
		int tab = 0;
		for(int i = 1; i <= 10; i++) {
			tab = num * i;
			System.out.println(num + " X " + i + " = " + tab );
		}
		en.close();
	}
}
