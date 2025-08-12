package Lista2;
import java.util.Scanner;

public class Atividade3 {

    public static void main(String[] args) {
        /*
         * 3. Faça um Programa que verifique se uma letra digitada é "F" ou "M".
         * Conforme a letra escrever: F - Feminino, M - Masculino.
         */

        Scanner en = new Scanner(System.in);

        System.out.println("Digite seu gênero (apenas a primeira letra): ");
        String texto = en.nextLine(); 

        String resultado;

        switch (texto) {
            case "F":
                resultado = "Feminino";
                break;
            case "M":
                resultado = "Masculino";
                break;
            default:
                resultado = "Opção inválida";
                break;
        }

        System.out.println("Seu gênero é: " + resultado);

        en.close();
    }
}
