package PinturaSolidos;

import java.lang.Math;

public class Piramide {
    private double ladoBase;
    private double alturaPiramide; 
    private int tipo;
    
    private static final double RENDIMENTO = 4.76;
    private static final double LITROS_POR_LATA = 18.0;
    private static final double PRECO_TIPO1 = 127.90;
    private static final double PRECO_TIPO2 = 258.98;
    private static final double PRECO_TIPO3 = 344.34;

    public Piramide() {}

    public Piramide(double ladoBase, double alturaPiramide, int tipo) {
        setLadoBase(ladoBase);
        setAltura(alturaPiramide);
        setTipo(tipo);
    }
    
    public double getLadoBase() {
        return ladoBase;
    }

    public void setLadoBase(double ladoBase) {
        this.ladoBase = ladoBase;
    }

    public double getAltura() {
        return alturaPiramide;
    }

    public void setAltura(double alturaPiramide) {
        this.alturaPiramide = alturaPiramide;
    }
    
    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public double calcularApotema() {
        return Math.sqrt(Math.pow(this.alturaPiramide, 2) + Math.pow(this.ladoBase, 2));
    }
    
    public double calcularAreaTriangulo() {
        return (this.ladoBase * calcularApotema()) / 2;
    }
    
    public double calcularAreaBase() {
        return Math.pow(this.ladoBase, 2);
    }
    
    public double calcularAreaTotal() {
        return calcularAreaBase() + 4 * calcularAreaTriangulo();
    }
    
    public double calcularVolume() {
        return (1.0/3.0) * calcularAreaBase() * this.alturaPiramide;
    }
    
    public double calcularLitros() {
        return calcularAreaTotal() / RENDIMENTO;
    }
    
    public int calcularLatas() {
        return (int) Math.ceil(calcularLitros() / LITROS_POR_LATA);
    }
    
    public double calcularPreco() {
        double precoLata = 0;
        switch(this.tipo) {
            case 1:
                precoLata = PRECO_TIPO1;
                break;
            case 2:
                precoLata = PRECO_TIPO2;
                break;
            case 3:
                precoLata = PRECO_TIPO3;
                break;
        }
        return calcularLatas() * precoLata;
    }
    
    @Override
    public String toString() {
        return "ab: " + this.ladoBase +
               "\nh: " + this.alturaPiramide +
               "\nal: " + calcularApotema() +
               "\nÁrea Triângulo: " + calcularAreaTriangulo() +
               "\nÁrea Base: " + calcularAreaBase() +
               "\nÁrea Total: " + calcularAreaTotal() +
               "\nTipo de Tinta: " + this.tipo +
               "\nLitros: " + calcularLitros() +
               "\nLatas: " + calcularLatas() +
               "\nPreço: " + calcularPreco() +
               "\nVolume: " + calcularVolume();
    }
}


