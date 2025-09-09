package Lista1_POO.operacao;

public class Operacao {
	private int num1 = 0;
	private int num2 = 0;
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
	
	public int soma(int num1, int num2) {
		return num1 + num2;
	}
	public int subtracao(int num1, int num2) {
		return num1 - num2; 
	}
	public int multiplicacao(int num1, int num2) {
		return num1 * num2;
	}
	public double divisao(int num1, int num2) {
	    if (num2 == 0) {
	        System.out.println("Erro: divisão por zero!");
	        return 0;
	    }
	    return (double) num1 / num2;
	}
}
