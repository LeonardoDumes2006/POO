package Lista2;
import java.util.Scanner;

public class Atividade25 {
    public static void main(String[] args) {
    	/*
    	 * 25. Faça um Programa para um caixa eletrônico. O programa deverá perguntar ao usuário a
			valor do saque e depois informar quantas notas de cada valor serão fornecidas. As notas
			disponíveis serão as de 1, 5, 10, 50 e 100 reais. O valor mínimo é de 10 reais e o máximo de
			600 reais. O programa não deve se preocupar com a quantidade de notas existentes na
			máquina.
			Exemplo 1: Para sacar a quantia de 256 reais, o programa fornece duas notas de 100, uma
			nota de 50, uma nota de 5 e uma nota de 1;
			Exemplo 2: Para sacar a quantia de 399 reais, o programa fornece três notas de 100, uma
			nota de 50, quatro notas de 10, uma nota de 5 e quatro notas de 1.
    	 */
        Scanner en = new Scanner(System.in);
        
        System.out.println("Digite o valor do saque (entre 10 e 600 reais):");
        int valor = en.nextInt();
 
        int notas100 = valor / 100;
        int resto = valor % 100;
            
        int notas50 = resto / 50;
        resto = resto % 50;
            
        int notas10 = resto / 10;
        resto = resto % 10;
            
        int notas5 = resto / 5;
        int notas1 = resto % 5;
            
        if(notas100 > 0) System.out.println(notas100 + " nota(s) de R$ 100");
        if(notas50 > 0) System.out.println(notas50 + " nota(s) de R$ 50");
        if(notas10 > 0) System.out.println(notas10 + " nota(s) de R$ 10");
        if(notas5 > 0) System.out.println(notas5 + " nota(s) de R$ 5");
        if(notas1 > 0) System.out.println(notas1 + " nota(s) de R$ 1");
        
        
        en.close();
    }
}