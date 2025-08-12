package Lista2;
import java.util.Scanner;

public class Atividade13 {

    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);

        System.out.println("Informe o valor da hora trabalhada");
        double valhora = en.nextDouble();
        
        System.out.println("Informe horas trabalhadas no mês");
        double horastrab = en.nextDouble();
        
        double salbruto = valhora * horastrab;
        double ir = 0;
        double percir = 0;
        
        if(salbruto <= 900) {
            percir = 0;
        } else if(salbruto <= 1500) {
            percir = 5;
        } else if(salbruto <= 2500) {
            percir = 10;
        } else {
            percir = 20;
        }
        
        ir = salbruto * (percir / 100);
        double inss = salbruto * 0.10;
        double fgts = salbruto * 0.11;
        double sindicato = salbruto * 0.03;
        double totaldesc = ir + inss + sindicato;
        double salliquido = salbruto - totaldesc;
        
        System.out.println("Salário Bruto: R$ " + salbruto);
        System.out.println("IR : R$ " + ir);
        System.out.println("INSS (10%): R$ " + inss);
        System.out.println("Sindicato (3%): R$ " + sindicato);
        System.out.println("FGTS (11%): R$ " + fgts);
        System.out.println("Total de descontos: R$ " + totaldesc);
        System.out.println("Salário Líquido: R$ " + salliquido);

        en.close();
    }
}