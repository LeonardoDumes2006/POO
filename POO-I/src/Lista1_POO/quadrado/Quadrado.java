package Lista1_POO.quadrado;

public class Quadrado {
	private int lado = 0;

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}
	
	public int area(int lado) {
		return lado*lado;
	}
}
