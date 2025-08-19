package Lista3;

import java.util.Scanner;

public class Atividade30 {
    public static void main(String[] args) {
    	/*
    	 * 30. Uma academia deseja fazer um senso entre seus clientes para descobrir o mais alto, o
			mais baixo, a mais gordo e o mais magro, para isto você deve fazer um programa que
			pergunte a cada um dos clientes da academia seu código, sua altura e seu peso. O final da
			digitação de dados deve ser dada quando o usuário digitar 0 (zero) no campo código. Ao
			encerrar o programa também deve ser informados os códigos e valores do clente mais alto,
			do mais baixo, do mais gordo e do mais magro, além da média das alturas e dos pesos dos
			clientes.
    	 */
        Scanner en = new Scanner(System.in);
        
        int codigo;
        double altura, peso;
        
        double maiorAltura = Double.MIN_VALUE;
        double menorAltura = Double.MAX_VALUE;
        double maiorPeso = Double.MIN_VALUE;
        double menorPeso = Double.MAX_VALUE;
        
        int codigoMaisAlto = 0;
        int codigoMaisBaixo = 0;
        int codigoMaisGordo = 0;
        int codigoMaisMagro = 0;
        
        double somaAlturas = 0;
        double somaPesos = 0;
        int contador = 0;
        
        while (true) {
            System.out.print("Digite o código do cliente (0 para sair): ");
            codigo = en.nextInt();
            
            if (codigo == 0) {
                break; 
            }
            
            System.out.print("Digite a altura do cliente (m): ");
            altura = en.nextDouble();
            
            System.out.print("Digite o peso do cliente (kg): ");
            peso = en.nextDouble();
            
            if (altura > maiorAltura) {
                maiorAltura = altura;
                codigoMaisAlto = codigo;
            }
            
            if (altura < menorAltura) {
                menorAltura = altura;
                codigoMaisBaixo = codigo;
            }
            
            if (peso > maiorPeso) {
                maiorPeso = peso;
                codigoMaisGordo = codigo;
            }
            
            if (peso < menorPeso) {
                menorPeso = peso;
                codigoMaisMagro = codigo;
            }
            
            somaAlturas += altura;
            somaPesos += peso;
            contador++;
            
            System.out.println();
        }
        
        if (contador > 0) {
            double mediaAltura = somaAlturas / contador;
            double mediaPeso = somaPesos / contador;
            
            System.out.println("\n--- RESULTADOS ---");
            System.out.println("Cliente mais alto: Código " + codigoMaisAlto + ", Altura: " + maiorAltura + " m");
            System.out.println("Cliente mais baixo: Código " + codigoMaisBaixo + ", Altura: " + menorAltura + " m");
            System.out.println("Cliente mais gordo: Código " + codigoMaisGordo + ", Peso: " + maiorPeso + " kg");
            System.out.println("Cliente mais magro: Código " + codigoMaisMagro + ", Peso: " + menorPeso + " kg");
            System.out.println("Média das alturas: " + mediaAltura + " m");
            System.out.println("Média dos pesos: " + mediaPeso + " kg");
        } else {
            System.out.println("Nenhum cliente foi cadastrado.");
        }
        
        en.close();
    }
}
