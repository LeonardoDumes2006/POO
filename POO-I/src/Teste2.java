import java.util.Scanner;

public class Teste2 {
	public static void main(String[] args) {
		Scanner en = new Scanner(System.in);
		
		int num = 0;
		do {
			
			System.out.print("Informe um número par: ");
			num = en.nextInt();
			if(num % 2 != 0) {
				System.out.println("Número invalido");	
			}
			
		} while(num % 2 != 0);
		
	}
}
