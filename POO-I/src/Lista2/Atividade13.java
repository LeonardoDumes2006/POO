package Lista2;
import java.util.Scanner;

public class Atividade13 {

    public static void main(String[] args) {
    	
    	/*
		    	 * 13.Faça um programa para o cálculo de uma folha de pagamento, sabendo que os
		descontos são do Imposto de Renda, que depende do salário bruto (conforme tabela
		abaixo) e 3% para o Sindicato e que o FGTS corresponde a 11% do Salário Bruto, mas
		não é descontado (é a empresa que deposita). O Salário Líquido corresponde ao
		Salário Bruto menos os descontos. O programa deverá pedir ao usuário o valor da sua
		hora e a quantidade de horas trabalhadas no mês.
		Desconto do IR:
		Salário Bruto até 900 (inclusive) - isento
		Salário Bruto até 1500 (inclusive) - desconto de 5%
		Salário Bruto até 2500 (inclusive) - desconto de 10%
		Salário Bruto acima de 2500 - desconto de 20% Imprima na tela as informações, dispostas
		conforme o exemplo abaixo. No exemplo o valor da hora é 5 e a quantidade de hora é 220.
		Salário Bruto: (5 * 220) : R$ 1100,00
		(-) IR (5%) : R$ 55,00
		(-) INSS ( 10%) : R$ 110,00
		FGTS (11%) : R$ 121,00
		Total de descontos : R$ 165,00
		Salário Liquido : R$ 935,00
    	 */
        Scanner en = new Scanner(System.in);

        System.out.println("Informe o valor da hora trabalhada");
        double valhora = en.nextDouble();
        
        System.out.println("Informe horas trabalhadas no mês");
        double horastrab = en.nextDouble();
        
        double salbruto = valhora * horastrab;
        double ir = 0;
        double percir = 0;
        
        if(salbruto <= 900) {
            percir = 0;
        } else if(salbruto <= 1500) {
            percir = 5;
        } else if(salbruto <= 2500) {
            percir = 10;
        } else {
            percir = 20;
        }
        
        ir = salbruto * (percir / 100);
        double inss = salbruto * 0.10;
        double fgts = salbruto * 0.11;
        double sindicato = salbruto * 0.03;
        double totaldesc = ir + inss + sindicato;
        double salliquido = salbruto - totaldesc;
        
        System.out.println("Salário Bruto: R$ " + salbruto);
        System.out.println("IR : R$ " + ir);
        System.out.println("INSS (10%): R$ " + inss);
        System.out.println("Sindicato (3%): R$ " + sindicato);
        System.out.println("FGTS (11%): R$ " + fgts);
        System.out.println("Total de descontos: R$ " + totaldesc);
        System.out.println("Salário Líquido: R$ " + salliquido);

        en.close();
    }
}