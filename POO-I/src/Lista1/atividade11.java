package Lista1;
import java.util.Scanner;

public class Atividade11 {

	public static void main(String[] args) {
		//11.Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que
		//calcule seu peso ideal, usando a seguinte fórmula: (72.7*altura) – 58.
		
		Scanner en = new Scanner(System.in);
		
		System.out.println("Qual sua altura: ");
		float altura = en.nextFloat();
		
		double pesoideal = ( 72.7 * altura ) - 58;

        System.out.printf("Seu peso ideal é: %.2f KG%n", pesoideal);
        
        en.close();
	}

}
