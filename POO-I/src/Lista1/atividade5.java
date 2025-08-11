package Lista1;
import java.util.Scanner;

public class atividade5 {

	public static void main(String[] args) {
		// 5. Faça um Programa que converta metros para centímetros.

		Scanner en = new Scanner(System.in);
		
		System.out.print("Informe o valor em metros : ");
		float metros = en.nextFloat();
		
		float centimetros = metros * 100;
		
		System.out.println("Convertido para centímetros : " + centimetros);
		
		en.close();
	}

}
