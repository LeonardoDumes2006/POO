package Lista2;
import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {
        /*
         * 10. Faça um Programa que leia três números e mostre o maior e o menor deles.
         */
        
        Scanner en = new Scanner(System.in);
        
        System.out.print("Informe um número: ");
        int num1 = en.nextInt();
        
        System.out.print("Informe outro número: ");
        int num2 = en.nextInt();
        
        System.out.print("Informe mais um número: ");
        int num3 = en.nextInt();

        int maior = Math.max(num1, Math.max(num2, num3));
        
        int menor = Math.min(num1, Math.min(num2, num3));
        
        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
        
        en.close();
    }
}