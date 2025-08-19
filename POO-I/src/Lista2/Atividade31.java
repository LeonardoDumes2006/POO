package Lista2;
import java.util.Scanner;

public class Atividade31 {
    public static void main(String[] args) {
    	/*
    	 * 31. Uma fruteira está vendendo frutas com a seguinte tabela de preços:
			Até 5 Kg Acima de 5 Kg
			Morango R$ 2,50 por Kg R$ 2,20 por Kg
			Maçã R$ 1,80 por Kg R$ 1,50 por Kg
			
			Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra
			ultrapassar R$ 25,00, receberá ainda um desconto de 10% sobre este total.
			Escreva um algoritmo para ler a quantidade (em Kg) de morangos e a
			quantidade (em Kg) de maças adquiridas e escreva o valor a ser pago pelo
			cliente.
    	 */
        Scanner en = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de morangos (em Kg):");
        double kgMorangos = en.nextDouble();
        
        System.out.println("Digite a quantidade de maçãs (em Kg):");
        double kgMacas = en.nextDouble();

        double precoMorangos;
        if(kgMorangos <= 5) {
            precoMorangos = kgMorangos * 2.50;
        } else {
            precoMorangos = kgMorangos * 2.20;
        }
        
        double precoMacas;
        if(kgMacas <= 5) {
            precoMacas = kgMacas * 1.80;
        } else {
            precoMacas = kgMacas * 1.50;
        }
        
        double valorTotal = precoMorangos + precoMacas;
        double kgTotal = kgMorangos + kgMacas;
        
        if(kgTotal > 8 || valorTotal > 25) {
            valorTotal *= 0.90; 
        }
        
        System.out.printf("Valor a ser pago: R$ %.2f%n", valorTotal);
        
        en.close();
    }
}