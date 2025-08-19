package Lista2;
import java.util.Scanner;

public class Atividade27 {
    public static void main(String[] args) {
    	/*
    	 * 26. Faça um Programa que peça um número inteiro e determine se ele é par ou impar. Dica:
		utilize o operador módulo (resto da divisão).
    	 */
        Scanner en = new Scanner(System.in);
        
        System.out.println("Digite um número:");
        double numero = en.nextDouble();
        
        if(numero == Math.round(numero)) {
            System.out.println(numero + " é um número inteiro.");
        } else {
            System.out.println(numero + " é um número decimal.");
        }
        
        en.close();
    }
}