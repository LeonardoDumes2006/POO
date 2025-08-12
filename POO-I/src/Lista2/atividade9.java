package Lista2;
import java.util.Scanner;

public class Atividade9 {
	public static void main(String[] args) {
		/*
		 * 9. Tendo como dado de entrada a altura, peso e sexo, construa um algoritmo que calcule
			o peso ideal, utilizando as seguintes fórmulas:
			Para homens: (72.7*h) - 58
			Para mulheres: (62.1*h) - 44.7
			(h = altura)
			Ao final o algoritmo deve mostrar:
			- Altura, peso e sexo;
			- Peso Ideal;
			- Mensagem se está acima, abaixo ou no peso ideal;
		 */
		
		Scanner en = new Scanner(System.in);
		
		System.out.print("Qual sua altura: ");
		float altura = en.nextFloat();
		
		en.nextLine(); 
		System.out.print("Qual seu gênero: ");
		String genero = en.nextLine();
		
		System.out.print("Qual seu peso: ");
		float peso = en.nextFloat();
		
		double pesoideal;
		
		if (genero.equalsIgnoreCase("masculino")) {
			pesoideal = (72.7 * altura) - 58;
		} else {
			pesoideal = (62.1 * altura) - 44.7;
		}

		System.out.printf("Altura: %.2f m%n", altura);
		System.out.printf("Peso: %.2f kg%n", peso);
		System.out.println("Sexo: " + genero);
		
		System.out.printf("Peso ideal: %.2f kg%n", pesoideal);
		
		
		if (peso > pesoideal) {
			System.out.println("Você está acima do peso ideal.");
		} else if (peso < pesoideal) {
			System.out.println("Você está abaixo do peso ideal.");
		} else {
			System.out.println("Você está no peso ideal.");
		}
		
		en.close();
	}
}
