package Lista1_POO.salario;
import java.util.Scanner;

public class SalarioMain {
	public static void main(String[] args) {
		/*
		 * 4. Faça um Programa que pergunte quanto você ganha por hora e o número de
			horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido
			mês, sabendo-se que são descontados 11% para o Imposto de Renda, 8%
			para o INSS e 5% para o sindicato, faça um programa que nos dê:
			- Salário bruto.
			- Quanto pagou ao INSS.
			- Quanto pagou ao sindicato.
			- O salário líquido.
			Calcule os descontos e o salário líquido, conforme a tabela abaixo:
			+ Salário Bruto : R$
			- IR (11%) : R$
			- INSS (8%) : R$
			- Sindicato ( 5%) : R$
			= Salário Liquido : R$
			Obs.: Salário Bruto - Descontos = Salário Líquido
			Utilize métodos para calcular cada um dos descontos, o total de descontos e
			o salário líquido.
		 */
		 	Scanner input = new Scanner(System.in);
	        Salario salario = new Salario();

	        System.out.print("Quanto você ganha por hora? R$ ");
	        salario.setSalHora(input.nextDouble());

	        System.out.print("Quantas horas trabalhou no mês? ");
	        salario.setHorasTrabalhadas(input.nextDouble());

	        System.out.println("Salário Bruto: R$ " + salario.salarioBruto());
	        System.out.println("IR (11%): R$ " + salario.ir());
	        System.out.println("INSS (8%): R$ " + salario.inss());
	        System.out.println("Sindicato (5%): R$ " + salario.sindicato());
	        System.out.println("Salário Líquido: R$ " + salario.salarioLiquido());
	        
	        input.close();
	}
}
