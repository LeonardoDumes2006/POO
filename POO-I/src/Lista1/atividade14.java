package Lista1;
import java.util.Scanner;

public class Atividade14 {

	public static void main(String[] args) {
		/*
		 * 14.Faça um Programa que pergunte quanto você ganha por hora e o número de horas
			trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês, sabendo-se
			que são descontados 11% para o Imposto de Renda, 8% para o INSS e 5% para o
			sindicato, faça um programa que nos dê:
			a. salário bruto.
			b. quanto pagou ao INSS.
			c. quanto pagou ao sindicato.
			d. o salário líquido.
			e. calcule os descontos e o salário líquido, conforme a tabela abaixo:
			f. + Salário Bruto : R$
			g. - IR (11%) : R$
			h. - INSS (8%) : R$
			i. - Sindicato ( 5%) : R$
			j. = Salário Liquido : R$
			Obs.: Salário Bruto - Descontos = Salário Líquido.
		 * 
		 */
		Scanner en = new Scanner(System.in);

		System.out.println("Informe quanto você ganha por hora");
		double salhora = en.nextFloat();
		
		System.out.println("Informe número de horas trabalhadas");
		double horas = en.nextFloat();
		
		double salbruto = salhora * horas;
		double inss = salbruto * 0.08;
		double ir = salbruto * 0.11;
		double sindicato = salbruto * 0.05;
		double salliquido = salbruto - (inss + sindicato + ir );
		
		System.out.println("Salário Bruto : " + salbruto);
		System.out.println("Desconto de Imposto de Renda : " + ir);
		System.out.println("Desconto de INSS : " + inss);
		System.out.println("Desconto de Sindicato " + sindicato);
		System.out.println("Salário Líquido : " + salliquido);

		en.close();
	}

}
