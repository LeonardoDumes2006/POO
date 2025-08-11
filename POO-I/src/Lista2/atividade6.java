package Lista2;
import java.util.Scanner;

public class atividade6 {
    public static void main(String[] args) {
        /*
         * 6. Faça um Programa que peça um número inteiro e se este número for par, transforme-o
         * em ímpar e vice-versa.
         */
        
        Scanner en = new Scanner(System.in);

        System.out.print("Informe um número inteiro: ");
        int num = en.nextInt();
        
        if(num % 2 == 0) {
            System.out.println("Inicialmente o número é par");
        } else {
            System.out.println("Inicialmente o número é ímpar");
        }

        num++;

        if(num % 2 == 0) {
            System.out.println("Agora o número é par");
        } else {
            System.out.println("Agora o número é ímpar");
        }

        en.close();
    }
}
