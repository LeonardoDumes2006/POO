package Lista1_POO.intervalo;

public class IntervaloNumeros {
	private int num1 = 0;
	private int num2 = 0;
	
	public IntervaloNumeros() {
		
	}
	
	public IntervaloNumeros(int num1, int num2) {
		setNum1(num1);
		setNum2(num2);
	}
	

	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	public int[] gerarIntervalo() {
		int aux = 0;
		
		if(num2 < num1) {
			aux = num1;
			num1 = num2;
			num2 = aux;
			System.out.println("Valores invertidos! Ordem ajustada.");
		}
		int dif = (num2 - num1) + 1;
		int[] vet = new int[dif];
		int j = 0;
		
		for(int i = num1; i <= num2; i++ ) {
	
			vet[j] = i;
			j++;
			
		}
		return vet;
		
		
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("IntervaloNumeros [num1=");
		builder.append(num1);
		builder.append(", num2=");
		builder.append(num2);
		builder.append("]");
		return builder.toString();
	}
}
