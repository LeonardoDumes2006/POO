package Lista1_POO.quadrado;

public class Quadrado {
	private int lado = 0;

	public Quadrado() {
		
	}
	public Quadrado(int lado) {
		setLado(lado);
	}
	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}
	
	public int area(int lado) {
		return lado*lado;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Quadrado [lado=");
		builder.append(lado);
		builder.append("]");
		return builder.toString();
	}
	
	
}
