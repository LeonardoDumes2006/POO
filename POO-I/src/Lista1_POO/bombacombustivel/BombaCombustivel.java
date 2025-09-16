package Lista1_POO.bombacombustivel;

public class BombaCombustivel {
    private String tipoCombustivel;
    private double valorLitro;
    private double quantidadeCombustivel;
    
    public BombaCombustivel(String tipoCombustivel, double valorLitro, double quantidadeCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
        this.valorLitro = valorLitro;
        this.quantidadeCombustivel = quantidadeCombustivel;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public double getValorLitro() {
        return valorLitro;
    }

    public double getQuantidadeCombustivel() {
        return quantidadeCombustivel;
    }

    public void alterarValor(double novoValor) {
        if (novoValor > 0) {
            this.valorLitro = novoValor;
        } else {
            System.out.println("Valor inválido!");
        }
    }

    public void alterarCombustivel(String novoTipo) {
        if (novoTipo != null && !novoTipo.isEmpty()) {
            this.tipoCombustivel = novoTipo;
        } else {
            System.out.println("Tipo de combustível inválido!");
        }
    }

    public void alterarQuantidadeCombustivel(double novaQuantidade) {
        if (novaQuantidade >= 0) {
            this.quantidadeCombustivel = novaQuantidade;
        } else {
            System.out.println("Quantidade inválida!");
        }
    }

    public void abastecerPorValor(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido para abastecimento!");
            return;
        }

        double litros = valor / valorLitro;

        if (litros > quantidadeCombustivel) {
            System.out.println("Combustível insuficiente na bomba!");
            return;
        }

        quantidadeCombustivel -= litros;
        System.out.printf("Abastecido %.2f litros. Valor pago: R$ %.2f%n", litros, valor);
    }

    public void abastecerPorLitro(double litros) {
        if (litros <= 0) {
            System.out.println("Quantidade de litros inválida!");
            return;
        }

        if (litros > quantidadeCombustivel) {
            System.out.println("Combustível insuficiente na bomba!");
            return;
        }

        double valorTotal = litros * valorLitro;
        quantidadeCombustivel -= litros;
        System.out.printf("Abastecido %.2f litros. Valor a pagar: R$ %.2f%n", litros, valorTotal);
    }

    @Override
    public String toString() {
        return "Tipo: " + tipoCombustivel +
               " | Valor por litro: R$ " + String.format("%.2f", valorLitro) +
               " | Quantidade disponível: " + String.format("%.2f", quantidadeCombustivel) + " litros";
    }
}
