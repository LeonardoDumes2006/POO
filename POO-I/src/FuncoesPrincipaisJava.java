import java.util.Scanner;

public class FuncoesPrincipaisJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ==== MATH ====
        double numero = 4.7;

        System.out.println("=== FUNÇÕES MATEMÁTICAS ===");
        System.out.println("Math.ceil(4.7) -> arredonda para cima: " + Math.ceil(numero));   // 5.0
        System.out.println("Math.floor(4.7) -> arredonda para baixo: " + Math.floor(numero)); // 4.0
        System.out.println("Math.round(4.7) -> arredonda para o mais próximo: " + Math.round(numero)); // 5
        System.out.println("Math.abs(-10) -> valor absoluto: " + Math.abs(-10)); // 10
        System.out.println("Math.max(10, 20) -> maior número: " + Math.max(10, 20)); // 20
        System.out.println("Math.min(10, 20) -> menor número: " + Math.min(10, 20)); // 10
        System.out.println("Math.sqrt(16) -> raiz quadrada: " + Math.sqrt(16)); // 4.0
        System.out.println("Math.pow(2, 3) -> potência: " + Math.pow(2, 3)); // 8.0
        System.out.println("Math.random() -> número aleatório entre 0 e 1: " + Math.random());

        // ==== STRINGS ====
        String texto = "Java é incrível!";
        System.out.println("\n=== FUNÇÕES DE STRING ===");
        System.out.println("Comprimento: " + texto.length());
        System.out.println("Maiúsculo: " + texto.toUpperCase());
        System.out.println("Minúsculo: " + texto.toLowerCase());
        System.out.println("Contém 'Java'? " + texto.contains("Java"));
        System.out.println("Substituir: " + texto.replace("incrível", "poderoso"));
        System.out.println("Substring: " + texto.substring(0, 4)); // "Java"
        System.out.println("Começa com 'Java'? " + texto.startsWith("Java"));
        System.out.println("Termina com '!': " + texto.endsWith("!"));

        // ==== CONVERSÕES ====
        System.out.println("\n=== CONVERSÕES ===");
        String numeroTexto = "123";
        int valorInt = Integer.parseInt(numeroTexto); // String -> int
        double valorDouble = Double.parseDouble("3.14"); // String -> double
        String convertidoString = String.valueOf(99); // int -> String
        System.out.println("String para int: " + valorInt);
        System.out.println("String para double: " + valorDouble);
        System.out.println("Int para String: " + convertidoString);

        // ==== FORMATAÇÃO COM printf ====
        System.out.println("\n=== PRINTF ===");
        double preco = 59.9;
        System.out.printf("Preço com 2 casas decimais: %.2f%n", preco);
        System.out.printf("Número inteiro com largura fixa: %5d%n", 42);
        System.out.printf("Texto alinhado à esquerda: %-10s Fim%n", "Java");

        sc.close();
    }
}
