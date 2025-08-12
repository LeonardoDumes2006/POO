package Lista2;
import java.util.Scanner;

public class Atividade15 {
    public static void main(String[] args) {
    	
    	/*
		  * 15. Faça um Programa que tendo como dados de entrada o preço de custo de um produto e
		um código de origem, emita o preço junto de sua procedência. Caso o código não seja
		nenhum dos especificados, o produto deve ser classificado como importado. Código de
		origem: 1 - Sul, 2 - Norte 3 - Leste, 4 - Oeste, 5 ou 6 - nordeste 7 ou 8 Centro-oeste.

    	 */
        Scanner en = new Scanner(System.in);

        System.out.println("Digite o preço de custo do produto:");
        double precoCusto = en.nextDouble();

        System.out.println("Digite o código de origem (1 a 6):");
        int codigoOrigem = en.nextInt();

        String procedencia;

        switch(codigoOrigem) {
            case 1:
                procedencia = "Sul";
                break;
            case 2:
                procedencia = "Norte";
                break;
            case 3:
                procedencia = "Leste";
                break;
            case 4:
                procedencia = "Oeste";
                break;
            case 5:
                procedencia = "Nordeste";
                break;
            case 6:
                procedencia = "Nordeste";
                break;
            case 7:
                procedencia = "Centro-oeste";
                break;
            case 8:
                procedencia = "Centro-oeste";
                break;
            default:
                procedencia = "Importado";
        }

        System.out.printf("Preço: R$ %.2f%n", precoCusto);
        System.out.println("Procedência: " + procedencia);

        en.close();
    }
}