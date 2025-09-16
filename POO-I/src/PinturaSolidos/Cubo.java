package PinturaSolidos;

import java.lang.Math;

public class Cubo {
    private double lado;
    private double rendimento;
    private int tipo;
    
    final double PRECO_TIPO1 = 101.90;
    final double PRECO_TIPO2 = 212.45;
    final double PRECO_TIPO3 = 345.56;
    final double LITROS_POR_LATA = 18.0;

    public Cubo() {
    }

    public Cubo(double lado, double rendimento, int tipo) {
        setLado(lado);
        setRendimento(rendimento);
        setTipo(tipo);
    }
    
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getRendimento() {
        return rendimento;
    }

    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public double calcularAreaBase() {
        return this.lado * this.lado;
    }

    public double calcularAreaTotal() {
        return 5 * calcularAreaBase();
    }

    public double calcularVolume() {
        return Math.pow(this.lado, 3);
    }

    public double calcularDiagonalCubo() {
        return this.lado * Math.sqrt(3);
    }

    public double calcularLitrosTinta() {
        return calcularAreaTotal() / this.rendimento;
    }

    public int calcularLatasTinta() {
        return (int) Math.ceil(calcularLitrosTinta() / LITROS_POR_LATA);
    }

    public double calcularValorTotal() {
        double precoLata;
        switch (this.tipo) {
            case 1:
                precoLata = PRECO_TIPO1;
                break;
            case 2:
                precoLata = PRECO_TIPO2;
                break;
            case 3:
                precoLata = PRECO_TIPO3;
                break;
            default:
                precoLata = 0; 
        }
        return calcularLatasTinta() * precoLata;
    }

    @Override
    public String toString() {
        return "a: " + this.lado +
               "\nRendimento: " + this.rendimento +
               "\nTipo de Tinta: " + this.tipo +
               "\nÁrea da Base: " + this.calcularAreaBase() +
               "\nÁrea Total: " + this.calcularAreaTotal() +
               "\nVolume: " + this.calcularVolume() +
               "\nDiagonal do Cubo: " + this.calcularDiagonalCubo() +
               "\nLitros de Tinta: " + this.calcularLitrosTinta() +
               "\nLatas de Tinta: " + this.calcularLatasTinta() +
               "\nValor Total: " + this.calcularValorTotal();
    }
}