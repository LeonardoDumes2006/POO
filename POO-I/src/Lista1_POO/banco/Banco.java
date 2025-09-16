package Lista1_POO.banco;

public class Banco {
    private int numeroConta;
    private String nome;
    private double saldo;

    // Construtor
    public Banco(int numeroConta, String nome, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.nome = nome;
        this.saldo = saldoInicial;
    }

    // Getters e Setters
    public int getNumeroConta() {
        return numeroConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.isEmpty()) {
            this.nome = nome;
        } else {
            System.out.println("Nome inválido!");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.printf("Depósito de R$ %.2f realizado com sucesso.%n", valor);
        } else {
            System.out.println("Valor de depósito inválido!");
        }
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de saque inválido!");
        } else if (valor <= saldo) {
            saldo -= valor;
            System.out.printf("Saque de R$ %.2f realizado com sucesso.%n", valor);
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    @Override
    public String toString() {
        return "Conta: " + numeroConta +
               " | Nome: " + nome +
               " | Saldo: R$ " + String.format("%.2f", saldo);
    }
}
