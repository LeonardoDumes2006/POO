package PinturaSolidos;

public class CuboMain {

    public static void main(String[] args) {
        
        System.out.println("Cubo");
        Cubo cubo1 = new Cubo(4.0, 2.0, 1);
        System.out.println(cubo1.toString());
        System.out.println("--------------------");
        
        System.out.println("Cubo");
        Cubo cubo2 = new Cubo(13.56, 1.5, 3);
        System.out.println(cubo2.toString());
        System.out.println("--------------------");
        
        System.out.println("Cubo");
        Cubo cubo3 = new Cubo(107.45, 12.5, 2);
        System.out.println(cubo3.toString());
        System.out.println("--------------------");
    }
}