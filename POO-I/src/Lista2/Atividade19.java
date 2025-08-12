package Lista2;
import java.util.Scanner;
import java.lang.Math;

public class Atividade19 {
	
	/*
		 * 19. Faça um programa que calcule as raízes de uma equação do segundo grau, na forma ax2
	+ bx + c. O programa deverá pe seguintes situações:
	Se o usuário informar o valor de A igual a zero, a equação não é do segundo grau e o
	programa não deve fazer pedir os demais valores, sendo encerrado;
	Se o delta calculado for negativo, a equação não possui raizes reais. Informe ao usuário e
	encerre o programa;
	Se o delta calculado for igual a zero a equação possui apenas uma raiz real; informe-a ao
	usuário;
	Se o delta for positivo, a equação possui duas raiz reais; informe-as ao usuário;
		 */
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);

        System.out.println("Digite o valor de A:");
        double a = en.nextDouble();

        if (a == 0) {
            System.out.println("A equação não é do segundo grau (A = 0). Programa encerrado.");
            en.close();
            return;
        }

        System.out.println("Digite o valor de B:");
        double b = en.nextDouble();

        System.out.println("Digite o valor de C:");
        double c = en.nextDouble();

        double delta = (b * b) - (4 * a * c);

        if (delta < 0) {
            System.out.println("A equação não possui raízes reais (Delta negativo)");
        } else if (delta == 0) {
            double raiz = -b / (2 * a);
            System.out.printf("A equação possui uma raiz real: %.2f%n", raiz);
        } else {
            double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.printf("A equação possui duas raízes reais: %.2f e %.2f%n", raiz1, raiz2);
        }

        en.close();
    }
}