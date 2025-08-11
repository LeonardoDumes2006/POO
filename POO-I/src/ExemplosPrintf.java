public class ExemplosPrintf {
    public static void main(String[] args) {
        System.out.println("=== EXEMPLOS DE printf EM JAVA ===");

        // %d → inteiros
        int idade = 25;
        System.out.printf("Idade: %d anos%n", idade);

        // %f → números decimais
        double salario = 2500.7589;
        System.out.printf("Salário: %.2f%n", salario); // 2 casas decimais
        System.out.printf("Salário: %.4f%n", salario); // 4 casas decimais

        // %s → texto (strings)
        String nome = "Leonardo";
        System.out.printf("Nome: %s%n", nome);

        // Largura fixa (espaços)
        System.out.printf("Número com largura fixa: %10d%n", 123);  // alinhado à direita
        System.out.printf("Número alinhado à esquerda: %-10dFim%n", 123);

        // Preenchendo com zeros
        System.out.printf("Número com zeros: %010d%n", 123);

        // Mostrar porcentagem
        double porcentagem = 0.756;
        System.out.printf("Porcentagem: %.2f%%%n", porcentagem * 100);

        // Múltiplos valores
        System.out.printf("Nome: %s | Idade: %d | Salário: %.2f%n", nome, idade, salario);

        // Alinhamento de texto
        System.out.printf("Alinhado à direita: %20s%n", nome);
        System.out.printf("Alinhado à esquerda: %-20sFim%n", nome);

        // Hexadecimal e Octal
        int numero = 255;
        System.out.printf("Decimal: %d | Hexadecimal: %x | Octal: %o%n", numero, numero, numero);

        // Científico
        double grande = 1234567.89;
        System.out.printf("Notação científica: %e%n", grande);

        // Usando parênteses para negativos
        double negativo = -123.45;
        System.out.printf("Número negativo com parênteses: %(f%n", negativo);

        // Agrupando milhar
        System.out.printf("Número com vírgulas: %,d%n", 1000000);

        // Combinação
        System.out.printf("Produto: %-10s Preço: R$ %8.2f%n", "Camiseta", 49.90);
        System.out.printf("Produto: %-10s Preço: R$ %8.2f%n", "Tênis", 199.99);
    }
}
