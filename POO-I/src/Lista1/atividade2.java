package Lista1;
import java.util.Scanner;

public class atividade2 {

	public static void main(String[] args) {
		//2. Faça um Programa que peça um número e então mostre a mensagem O número
		// informado foi [número].

		Scanner en = new Scanner(System.in);
		
		System.out.print("Informe um inteiro: ");
		int num = en.nextInt();
		System.out.println("Número informado foi:  " + num);
		
		en.close();
		
	}

}
