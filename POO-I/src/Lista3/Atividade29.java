package Lista3;
import java.util.Scanner;
public class Atividade29 {
	public static void main(String[] args) {
		/*
		 * 29. Desenvolva um programa que faça a tabuada de um número qualquer inteiro que será
			digitado pelo usuário, mas a tabuada não deve necessariamente iniciar em 1 e terminar em
			10, o valor inicial e final devem ser informados também pelo usuário, conforme exemplo
			abaixo:
			• Montar a tabuada de: 5
			Começar por: 4
			Terminar em: 7
			Vou montar a tabuada de 5 começando em 4 e terminando em 7:
			5 x 4 = 20
			5 x 5 = 25
			5 x 6 = 30
			5 x 7 = 35
			
			Obs: Você deve verificar se o usuário não digitou o final menor que o inicial.
		 */
		Scanner en = new Scanner(System.in);
		System.out.print("Montar a tabuada de: ");
		int tab = en.nextInt();
		
		System.out.print("Começar por: ");
		int first = en.nextInt();
		
		System.out.print("Terminar por: ");
		int last = en.nextInt();
		
		if(first > last) {
			int aux = first;
			first = last;
			last = aux;
		}
		
		System.out.println("Vou montar a tabuada do " + tab + " començando em " + first + 
				" e terminando em " + last);
		
		for(int i = first; i <= last; i++) {
			int result = tab * i;
			System.out.println(tab + " X " + i + " = " + result);
		}
		en.close();
	}
}
