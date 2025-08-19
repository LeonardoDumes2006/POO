package Lista2;
import java.util.Scanner;

public class Atividade28 {
    public static void main(String[] args) {
    	/*
    	 * 28. Faça um Programa que leia 2 números e em seguida pergunte ao usuário qual operação
			ele deseja realizar. O resultado da operação deve ser acompanhado de uma frase que diga
			se o número é:
			
			o par ou ímpar;
			o positivo ou negativo;
			o inteiro ou decimal.
    	 */
        Scanner en = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número:");
        double num1 = en.nextDouble();
        
        System.out.println("Digite o segundo número:");
        double num2 = en.nextDouble();
        
        System.out.println("Escolha a operação:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        int operacao = en.nextInt();
        
        double resultado = 0;
        
        switch(operacao) {
            case 1: 
            	resultado = num1 + num2; 
            break;
            case 2: 
            	resultado = num1 - num2;
            break;
            case 3: 
            	resultado = num1 * num2; 
            break;
            case 4: 
            	resultado = num1 / num2; 
            break;
            default:
                System.out.println("Operação inválida!");
                en.close();
            return;
        }
        
        if(resultado == (int)resultado) {
            System.out.println("Tipo: Inteiro");
            System.out.println("Paridade: " + ((int)resultado % 2 == 0 ? "Par" : "Ímpar"));
        } else {
            System.out.println("Tipo: Decimal");
            System.out.println("Paridade: Não se aplica");
        }
        
        System.out.println("Sinal: " + (resultado >= 0 ? "Positivo" : "Negativo"));
        
        en.close();
    }
}