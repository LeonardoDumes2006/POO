

public class QuadradoMain {

	public static void main(String[] args) {
		
		Quadrado q = new Quadrado();
		
		q.setCor("liz");
		q.setLado(2);
		
		
		System.out.println("Lado:  " + q.getLado());
		System.out.println("Cor : " + q.getCor());
		System.out.println("Perimetro: " + q.perimetro());
		System.out.println("Perimetro: " + q.area());
		
		System.out.println(q.toString());
		System.out.println(q);
	}

}
