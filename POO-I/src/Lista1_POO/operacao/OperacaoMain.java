package Lista1_POO.operacao;
import java.util.Scanner;

public class OperacaoMain {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Operacao op = new Operacao();
		System.out.println("Digite o primeiro número: ");
		op.setNum1(input.nextInt());
		System.out.println("Digite o segundo número: ");
		op.setNum2(input.nextInt());
		
		int somaResultado = op.soma(op.getNum1(), op.getNum2());
		int subtracaoResultado = op.subtracao(op.getNum1(), op.getNum2());
		int multiplicacaoResultado = op.multiplicacao(op.getNum1(), op.getNum2());
		double divisaoResultado = op.divisao(op.getNum1(), op.getNum2());
		
		System.out.println("Soma: " + somaResultado);
		System.out.println("Subtração: " + subtracaoResultado);
		System.out.println("Multiplicação: " + multiplicacaoResultado);
		System.out.println("Divisão: " + divisaoResultado);
		
	}
}
