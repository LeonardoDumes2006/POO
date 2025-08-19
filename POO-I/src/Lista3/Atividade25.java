package Lista3;

public class Atividade25 {
    public static void main(String[] args) {
        /*
         * 25. O Sr. Manoel Joaquim possui uma grande loja de artigos de R$ 1,99.
         * O programa deve montar uma tabela de preços de 1 até 50 produtos.
         */

        double precoUnitario = 1.99;

        System.out.println("Lojas Quase Dois - Tabela de preços");
        for (int i = 1; i <= 50; i++) {
            double total = i * precoUnitario;
            System.out.printf("%d - R$ %.2f%n", i, total);
        }
    }
}
