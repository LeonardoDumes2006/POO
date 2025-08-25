package Lista4;
import java.util.*;

public class Atividade8 {
    public static void main(String[] args) {
    	/* * 8. Dado um vetor contendo todas as letras do nosso alfabeto (minúsculas) 
    	 * gere uma senha para o usuário. Para isto o usuário deve informar o tamanho da senha
    	 *  que deseja, este tamanho deve ser menor que a quantidade de letras no vetor. 
    	 *  A senha gerada deve seguir o padrão consoante+vogal para tamanhos pares e 
    	 *  consoante+vogal e terminada em consoante para tamanhos ímpares. 
    	 *  */
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        char[] alfabeto = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        String vogais = "aeiou";
        String consoantes = "bcdfghjklmnpqrstvwxyz";

        int tamanho;
        do {
            System.out.print("Digite o tamanho da senha (menor que " + alfabeto.length + "): ");
            tamanho = input.nextInt();
        } while(tamanho <= 0 || tamanho >= alfabeto.length);

        StringBuilder senha = new StringBuilder();

        for(int i = 0; i < tamanho; i++) {
            if(i % 2 == 0) { 
                senha.append(consoantes.charAt(random.nextInt(consoantes.length())));
            } else { 
                senha.append(vogais.charAt(random.nextInt(vogais.length())));
            }
        }

        if(tamanho % 2 != 0) {
            senha.setCharAt(tamanho - 1, consoantes.charAt(random.nextInt(consoantes.length())));
        }

        System.out.println("Senha gerada: " + senha.toString());

        input.close();
    }
}
