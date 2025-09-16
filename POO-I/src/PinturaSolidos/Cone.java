package PinturaSolidos;

public class Cone {
    private double raio = 1.0;
    private double altura = 2.0;
    private int tipo = 1;
    
    final double PI = 3.14;
    final double RENDIMENTO = 3.45; 
    final double LATA = 18.0;  
    final double TIPO1 = 238.90;
    final double TIPO2 = 467.98;
    final double TIPO3 = 758.34;
    
    public Cone() {
    	
    }
    public Cone(double raio, double altura) {
        this.raio = raio;
        this.altura = altura;
        this.tipo = 1;
    }
    public Cone(double raio, double altura, int tipo) {
        this.raio = raio;
        this.altura = altura;
        this.tipo = tipo;
    }

    public double getRaio() { 
    	return raio;
    }
    
    public void setRaio(double raio) {
    	this.raio = raio;
    }

    public double getAltura() {
    	return altura;
    }
    public void setAltura(double altura) {
    	this.altura = altura;
    }

    public int getTipo() {
    	return tipo;
    }
    public void setTipo(int tipo) {
    	this.tipo = tipo;
    }

    public double areaFundo() {
        return PI * raio * raio;
    }

    public double g() {
        return Math.sqrt((raio * raio) + (altura * altura));
    }

    public double areaLateral() {
        return PI * raio * g();
    }

    public double areaTotal() {
        return areaFundo() + areaLateral();
    }

    public double litros() {
        return areaTotal() / RENDIMENTO;
    }

    public int latas() {
        return (int) Math.ceil(litros() / LATA);
    }

    public double precoTotal() {
        double preco = 0;
        switch (tipo) {
            case 1: preco = TIPO1; 
            	break;
            case 2: preco = TIPO2; 
            	break;
            case 3: preco = TIPO3; 
            	break;
        }
        return latas() * preco;
    }
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cone [raio=");
		builder.append(raio);
		builder.append(", altura=");
		builder.append(altura);
		builder.append(", tipo=");
		builder.append(tipo);
		builder.append(", PI=");
		builder.append(PI);
		builder.append(", RENDIMENTO=");
		builder.append(RENDIMENTO);
		builder.append(", LATA=");
		builder.append(LATA);
		builder.append(", TIPO1=");
		builder.append(TIPO1);
		builder.append(", TIPO2=");
		builder.append(TIPO2);
		builder.append(", TIPO3=");
		builder.append(TIPO3);
		builder.append("]");
		return builder.toString();
	}

   
}
