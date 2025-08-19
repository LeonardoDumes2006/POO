package Lista2;
import java.util.Scanner;

public class Atividade22 {
    public static void main(String[] args) {
    	
    	/*
    	 * 22. Faça um Programa que leia um número inteiro menor que 1000 e imprima a quantidade
		de centenas, dezenas e unidades do mesmo.
    	 */
        Scanner en = new Scanner(System.in);
        
        System.out.println("Digite um número inteiro menor que 1000:");
        int numero = en.nextInt();
        int centenas = numero / 100;
        int resto = numero % 100;
        int dezenas = resto / 10;
        int unidades = resto % 10;
            
        System.out.println(centenas + " centena(s)");
        System.out.println(dezenas + " dezena(s)");
        System.out.println(unidades + " unidade(s)");
        
        en.close();
    }
}