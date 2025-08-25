package Lista4;

import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {
        /*
         * 10. Faça um programa que peça uma data no padrão dd/mm/aaaa,
         * valide esta data e coloque cada item em uma posição de um vetor
         * de inteiros de tamanho 3.
         */

        Scanner input = new Scanner(System.in);

        System.out.print("Digite a data (dd/mm/aaaa): ");
        String dataStr = input.nextLine();

        String[] partes = dataStr.split("/");

        int[] data = new int[3];
        data[0] = Integer.parseInt(partes[0]); 
        data[1] = Integer.parseInt(partes[1]); 
        data[2] = Integer.parseInt(partes[2]); 

        if (validaData(data[0], data[1], data[2])) {
            System.out.println("Data válida!");
            System.out.println("Dia: " + data[0]);
            System.out.println("Mês: " + data[1]);
            System.out.println("Ano: " + data[2]);
        } else {
            System.out.println("Data inválida!");
        }

        input.close();
    }

    public static boolean validaData(int dia, int mes, int ano) {
        if (ano <= 0) return false;
        if (mes < 1 || mes > 12) return false;

        int[] diasMes = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        if (mes == 2 && isBissexto(ano)) {
            diasMes[1] = 29;
        }

        return dia >= 1 && dia <= diasMes[mes - 1];
    }

    public static boolean isBissexto(int ano) {
        return (ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0));
    }
}
