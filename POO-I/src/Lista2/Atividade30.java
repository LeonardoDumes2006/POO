package Lista2;
import java.util.Scanner;

public class Atividade30 {
    public static void main(String[] args) {
    	/*
    	 * 30. Um posto está vendendo combustíveis com a seguinte tabela de descontos:
			Álcool:
			até 20 litros, desconto de 3% por litro
			acima de 20 litros, desconto de 5% por litro
			Gasolina:
			até 20 litros, desconto de 4% por litro
			acima de 20 litros, desconto de 6% por litro
			Escreva um algoritmo que leia o número de litros vendidos, o tipo de combustível (codificado
			da seguinte forma: A-álcool, G-gasolina), calcule e imprima o valor a ser pago pelo cliente
			sabendo-se que o preço do litro da gasolina é R$ 2,50 o preço do litro do álcool é R$ 1,90.
    	 */
        Scanner en = new Scanner(System.in);
        
        System.out.println("Digite o tipo de combustível (A-Álcool, G-Gasolina):");
        char tipo = en.next().charAt(0);
        
        System.out.println("Digite a quantidade de litros vendidos:");
        double litros = en.nextDouble();
        
        double precoLitro;
        double descontoPorLitro;
        double valorTotal;
        
        if(tipo == 'A' || tipo == 'a') {
            precoLitro = 1.90;
            if(litros <= 20) {
                descontoPorLitro = 0.03; // 3%
            } else {
                descontoPorLitro = 0.05; // 5%
            }
        } else if(tipo == 'G' || tipo == 'g') {
            precoLitro = 2.50;
            if(litros <= 20) {
                descontoPorLitro = 0.04; // 4%
            } else {
                descontoPorLitro = 0.06; // 6%
            }
        } else {
            System.out.println("Tipo de combustível inválido!");
            en.close();
            return;
        }
        
        valorTotal = litros * precoLitro * (1 - descontoPorLitro);
        
        System.out.printf("Valor a ser pago: R$ %.2f%n", valorTotal);
        
        en.close();
    }
}