package Lista2;
import java.util.Scanner;

public class Atividade14 {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);

        System.out.println("Digite um número de 1 a 7:");
        int numero = en.nextInt();

        String diaSemana;
        
        switch(numero) {
            case 1:
                diaSemana = "Domingo";
                break;
            case 2:
                diaSemana = "Segunda-feira";
                break;
            case 3:
                diaSemana = "Terça-feira";
                break;
            case 4:
                diaSemana = "Quarta-feira";
                break;
            case 5:
                diaSemana = "Quinta-feira";
                break;
            case 6:
                diaSemana = "Sexta-feira";
                break;
            case 7:
                diaSemana = "Sábado";
                break;
            default:
                diaSemana = "Valor inválido";
        }

        System.out.println(diaSemana);

        en.close();
    }
}