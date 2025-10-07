package ExercicioAssociacaoContaAvancada;

public class MainContaAvancada {
    public static void main(String[] args) {
  
        System.out.println("Criando Banco:");
        Banco banco = new Banco();
        banco.setCodigo(001);
        banco.setNome("Banco Digital POO");
        banco.setNumeroAgencias(50);
        System.out.println(banco.toString());
        System.out.println();
        
        System.out.println("Criando Correntistas:");
        Pessoa cliente1 = new Pessoa();
        cliente1.setNome("João Silva");
        cliente1.setEndereco("Rua das Flores, 123");
        
        Pessoa cliente2 = new Pessoa();
        cliente2.setNome("Maria Santos");
        cliente2.setEndereco("Avenida Central, 456");
        
        System.out.println("Cliente 1: " + cliente1.toString());
        System.out.println("Cliente 2: " + cliente2.toString());
        System.out.println();
        
        System.out.println("Criando Conta Bancária Simples:");
        ContaBancaria contaSimples = new ContaBancaria();
        contaSimples.setBanco(banco);
        contaSimples.setAgencia(1234);
        contaSimples.setNumeroDaConta(1001);
        contaSimples.setCorrentista(cliente1);
        
        contaSimples.deposito(1500.0);
        System.out.println("Saldo após depósito: R$ " + contaSimples.getSaldo());
        
        contaSimples.saque(300.0);
        System.out.println("Saldo após saque: R$ " + contaSimples.getSaldo());
        
        System.out.println(contaSimples.toString());
        System.out.println();
        
        System.out.println("Criando Conta Simples com Poupança:");
        ContaSimples contaComPoupanca = new ContaSimples();
        contaComPoupanca.setBanco(banco);
        contaComPoupanca.setAgencia(1234);
        contaComPoupanca.setNumeroDaConta(1002);
        contaComPoupanca.setCorrentista(cliente2);
        contaComPoupanca.setSaldoPoupanca(2000.0);
        
        contaComPoupanca.deposito(800.0);
        contaComPoupanca.saque(150.0);
        
        System.out.println("Saldo corrente: R$ " + contaComPoupanca.getSaldo());
        System.out.println("Saldo poupança: R$ " + contaComPoupanca.getSaldoPoupanca());
        System.out.println();
        
        System.out.println("Mesmo Banco em Múltiplas Contas:");
        System.out.println("Conta 1 - Banco: " + contaSimples.getBanco().getNome());
        System.out.println("Conta 2 - Banco: " + contaComPoupanca.getBanco().getNome());
        System.out.println();
        
        System.out.println("Banco: " + banco.getNome() + " (Agências: " + 
        banco.getNumeroAgencias() + ")");
        
        System.out.println("\nCONTA BANCÁRIA SIMPLES:");
        System.out.println("Titular: " + contaSimples.getCorrentista().getNome());
        System.out.println("Agência: " + contaSimples.getAgencia() + 
                          " Conta: " + contaSimples.getNumeroDaConta());
        System.out.println("Saldo: R$ " + contaSimples.getSaldo());
        
        System.out.println("\nCONTA SIMPLES COM POUPANÇA:");
        System.out.println("Titular: " + contaComPoupanca.getCorrentista().getNome());
        System.out.println("Agência: " + contaComPoupanca.getAgencia() + 
                          " Conta: " + contaComPoupanca.getNumeroDaConta());
        
        System.out.println("Saldo Corrente: R$ " + contaComPoupanca.getSaldo());
        System.out.println("Saldo Poupança: R$ " + contaComPoupanca.getSaldoPoupanca());
        System.out.println("Saldo Total: R$ " + 
                          (contaComPoupanca.getSaldo() + contaComPoupanca.getSaldoPoupanca()));
    }
}