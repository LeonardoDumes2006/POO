package Lista3;
import java.util.Scanner;

public class Atividade38{
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro positivo: ");
        int numero = en.nextInt();
        int invertido = 0;
        
        while (numero > 0) {
            int digito = numero % 10;
            invertido = invertido * 10 + digito;
            numero /= 10;
        }
        
        System.out.println("Número invertido: " + invertido);
        en.close();
    }
}
