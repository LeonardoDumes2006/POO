package Lista3;

import java.util.Scanner;

public class Atividade28 {
    public static void main(String[] args) {
    	/*
    	 * 28. O Departamento Estadual de Meteorologia lhe contratou para desenvolver um programa 
    	 * que leia as um conjunto indeterminado de temperaturas, e informe ao final a menor e a 
    	 * maior temperaturas informadas, bem como a média das temperaturas.
    	 */
        Scanner en = new Scanner(System.in);
        
        double temperatura;
        double menor = Double.MAX_VALUE;
        double maior = Double.MIN_VALUE; 
        double soma = 0;
        int contador = 0;
        
        System.out.println("Digite as temperaturas (digite 0 para finalizar):");
        
        while (true) {
            System.out.print("Temperatura: ");
            temperatura = en.nextDouble();
            
            if (temperatura == 0) {
                break;
            }
            
            if (temperatura < menor) {
                menor = temperatura;
            }
            
            if (temperatura > maior) {
                maior = temperatura;
            }
            
            soma += temperatura;
            contador++;
        }
        
        if (contador > 0) {
            double media = soma / contador;
            System.out.println("Menor temperatura: " + menor);
            System.out.println("Maior temperatura: " + maior);
            System.out.println("Média das temperaturas: " + media);
        } else {
            System.out.println("Nenhuma temperatura foi informada.");
        }
        
        en.close();
    }
}
