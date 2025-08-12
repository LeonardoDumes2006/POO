package Lista2;
import java.util.Scanner;

public class Atividade16 {
    public static void main(String[] args) {
    	
    	/*
    	 * 16. Altere o programa que calcula a média do aluno, e mostre a mensagem de acordo com a
    	média. De 0 a 3 - Reprovado, de 3 a 6.9 - Em Exame, de 7 a 10 - Aprovado
    	 */

    	
        Scanner en = new Scanner(System.in);

        System.out.println("Digite a primeira nota:");
        double nota1 = en.nextDouble();

        System.out.println("Digite a segunda nota:");
        double nota2 = en.nextDouble();

    

        double media = (nota1 + nota2) / 2;

        String situacao;
        
        if (media >= 0 && media < 3) {
            situacao = "Reprovado";
        } else if (media >= 3 && media < 7) {
            situacao = "Em Exame";
        } else if (media >= 7 && media <= 10) {
            situacao = "Aprovado";
        } else {
            situacao = "Média inválida";
        }

        System.out.printf("Média: %.1f%n", media);
        System.out.println("Situação: " + situacao);

        en.close();
    }
}