package Lista2;
import java.util.Scanner;

public class Atividade26 {
    public static void main(String[] args) {
    	/*
    	 * 26. Faça um Programa que peça um número inteiro e determine se ele é par ou impar. Dica:
			utilize o operador módulo (resto da divisão).
    	 */
        Scanner en = new Scanner(System.in);
        
        System.out.println("Digite um número inteiro:");
        int numero = en.nextInt();
        
        if(numero % 2 == 0) {
            System.out.println(numero + " é um número par.");
        } else {
            System.out.println(numero + " é um número ímpar.");
        }
        
        en.close();
    }
}