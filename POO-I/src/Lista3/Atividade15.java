package Lista3;

public class Atividade15 {
    public static void main(String[] args) {
        /*
         * 15. Mostre e calcule a série:
         * S = (37*38)/1 + (36*37)/2 + (35*36)/3 + ... + (1*2)/37
         */
        
        double soma = 0;
        int numerador = 37;

        System.out.print("S = ");

        for (int d = 1; d <= 37; d++) {
        	
            System.out.print("(" + numerador + "*" + (numerador + 1) + ")/" + d);
            
            if (d < 37) {
                System.out.print(" + ");
            }
            
            soma += (double) (numerador * (numerador + 1)) / d;
            
            numerador--;
        }

        System.out.println("\n\nA soma da série é: " + soma);
        
    }
}
