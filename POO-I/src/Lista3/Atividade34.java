package Lista3;
import java.util.Scanner;

public class Atividade34 {
    public static void main(String[] args) {
    	/*
    	 * 34. Faça um programa que leia uma quantidade indeterminada de números positivos e conte
			quantos deles estão nos seguintes intervalos: [0-25], [26-50], [51-75] e [76-100]. A entrada
			de dados deverá terminar quando for lido um número negativo.
    	 */
        Scanner en = new Scanner(System.in);
        
        int numero;
        int intervalo1 = 0; 
        int intervalo2 = 0; 
        int intervalo3 = 0; 
        int intervalo4 = 0; 
        
        System.out.println("Digite números positivos (digite um número negativo para encerrar):");
        
        while (true) {
            System.out.print("Número: ");
            numero = en.nextInt();
            
            if (numero < 0) {
                break; 
            }
            
            if (numero <= 25) {
                intervalo1++;
            } else if (numero <= 50) {
                intervalo2++;
            } else if (numero <= 75) {
                intervalo3++;
            } else if (numero <= 100) {
                intervalo4++;
            }
        }
        
        System.out.println("Números no intervalo [0-25]: " + intervalo1);
        System.out.println("Números no intervalo [26-50]: " + intervalo2);
        System.out.println("Números no intervalo [51-75]: " + intervalo3);
        System.out.println("Números no intervalo [76-100]: " + intervalo4);
        
        en.close();
    }
}
