package Lista2;
import java.util.Scanner;

public class Atividade7 {
    public static void main(String[] args) {
        /*
         * 7. Faça um Programa que leia três números e mostre-os em ordem decrescente.
         */
        Scanner en = new Scanner(System.in);

        System.out.print("Informe um número inteiro: ");
        int num1 = en.nextInt();
        System.out.print("Informe outro número inteiro: ");
        int num2 = en.nextInt();
        System.out.print("Informe mais um número inteiro: ");
        int num3 = en.nextInt();

        if (num1 >= num2 && num2 >= num3) {
            System.out.println(num1);
            System.out.println(num2);
            System.out.println(num3);
        } else if (num1 >= num3 && num3 >= num2) {
            System.out.println(num1);
            System.out.println(num3);
            System.out.println(num2);
        } else if (num2 >= num1 && num1 >= num3) {
            System.out.println(num2);
            System.out.println(num1);
            System.out.println(num3);
        } else if (num2 >= num3 && num3 >= num1) {
            System.out.println(num2);
            System.out.println(num3);
            System.out.println(num1);
        } else if (num3 >= num1 && num1 >= num2) {
            System.out.println(num3);
            System.out.println(num1);
            System.out.println(num2);
        } else {
            System.out.println(num3);
            System.out.println(num2);
            System.out.println(num1);
        }

        en.close();
    }
}
	