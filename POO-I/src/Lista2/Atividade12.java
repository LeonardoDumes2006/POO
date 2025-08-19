package Lista2;
import java.util.Scanner;

public class Atividade12 {
    public static void main(String[] args) {
    	
    	/*
		    	 * 12.As Organizações Tabajara resolveram dar um aumento de salário aos seus
		colaboradores e lhe contrataram para desenvolver o programa que calculará os
		reajustes.
		o Faça um programa que recebe o salário de um colaborador e calcule o reajuste
		segundo o seguinte critério, baseado no salário atual:
		o salários até R$ 280,00 (incluindo) : aumento de 20%
		o salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
		o salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
		o salários de R$ 1500,00 em diante : aumento de 5% Após o aumento ser
		realizado, informe na tela:
		o o salário antes do reajuste;
		o o percentual de aumento aplicado;
		o o valor do aumento;
		o o novo salário, após o aumento.
    	 */
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o salário atual do colaborador: R$ ");
        double salarioAtual = input.nextDouble();
        
        double percentualAumento;
        double valorAumento;
        double novoSalario;
        
        if (salarioAtual <= 280.00) {
            percentualAumento = 20;
        } else if (salarioAtual <= 700.00) {
            percentualAumento = 15;
        } else if (salarioAtual <= 1500.00) {
            percentualAumento = 10;
        } else {
            percentualAumento = 5;
        }
        
        valorAumento = salarioAtual * (percentualAumento / 100);
        novoSalario = salarioAtual + valorAumento;
     
        System.out.printf("Salário antes do reajuste: R$ %.2f%n", salarioAtual);
        System.out.printf("Percentual de aumento aplicado: %.0f%%%n", percentualAumento);
        System.out.printf("Valor do aumento: R$ %.2f%n", valorAumento);
        System.out.printf("Novo salário após o aumento: R$ %.2f%n", novoSalario);
        
        input.close();
        
    }
}