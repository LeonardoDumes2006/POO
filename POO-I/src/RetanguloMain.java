
public class RetanguloMain {
	public static void main(String[] args) {
		Retangulo r = new Retangulo(5, 6); // cria espaço na momória, novo objeto
		Retangulo r1 = new Retangulo(6, 7, "Amarelo");
		
		//r.setLadoA(4);
		//r.setLadoB(8);
		//r.setCor("Verde Palmeiras");
		System.out.println(r);
		System.out.println(r1);
	}
}
