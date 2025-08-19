package Lista3;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Atividade36 {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.00");
        
        int voto1 = 0, voto2 = 0, voto3 = 0, voto4 = 0;
        int nulos = 0, brancos = 0;
        int totalVotos = 0;
        
        System.out.println("Códigos de votação:");
        System.out.println("1 - José");
        System.out.println("2 - João");
        System.out.println("3 - Leonardo");
        System.out.println("4 - Alex");
        System.out.println("5 - Voto Nulo");
        System.out.println("6 - Voto em Branco");
        System.out.println("0 - Finalizar votação\n");
        
        int codigo;
        
        while (true) {
            System.out.print("Digite o código do voto: ");
            codigo = en.nextInt();
            
            if (codigo == 0) {
                break;
            }
            
            switch (codigo) {
                case 1:
                    voto1++;
                    totalVotos++;
                    break;
                case 2:
                    voto2++;
                    totalVotos++;
                    break;
                case 3:
                    voto3++;
                    totalVotos++;
                    break;
                case 4:
                    voto4++;
                    totalVotos++;
                    break;
                case 5:
                    nulos++;
                    totalVotos++;
                    break;
                case 6:
                    brancos++;
                    totalVotos++;
                    break;
                default:
                    System.out.println("Código inválido! Digite novamente.");
            }
        }
        
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Votos José: " + voto1);
        System.out.println("Votos João: " + voto2);
        System.out.println("Votos Leonardo: " + voto3);
        System.out.println("Votos Alex: " + voto4);
        System.out.println("Votos Nulos: " + nulos);
        System.out.println("Votos em Branco: " + brancos);
        
        if (totalVotos > 0) {
            double percNulos = (double) nulos / totalVotos * 100;
            double percBrancos = (double) brancos / totalVotos * 100;
            
            System.out.println("Percentual de votos nulos: " + df.format(percNulos) + "%");
            System.out.println("Percentual de votos em branco: " + df.format(percBrancos) + "%");
        } else {
            System.out.println("Nenhum voto foi computado.");
        }
        
        en.close();
    }
}
