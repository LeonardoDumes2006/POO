package Lista1;
import java.util.Scanner;

public class atividade8 {

	public static void main(String[] args) {
		// 8. Faça um Programa que pergunte quanto você ganha por hora e o número de horas
		// trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.
		
		Scanner en = new Scanner(System.in);
		
		System.out.print("Informe quanto você ganha por hora: ");
		float salhora = en.nextFloat();
		
		System.out.print("Informe número de horas trabalhadas por mês: ");
		float horastrabalhadas = en.nextFloat();
		
		float salario = salhora * horastrabalhadas;
		
		System.out.printf("Seu salário total é : R$ $.2f, " + salario);
		
		en.close();
	}

}
