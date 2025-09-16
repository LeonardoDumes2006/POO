package PinturaSolidos;

public class ConeMain {
    public static void main(String[] args) {
        
        Cone c1 = new Cone();
        System.out.println(c1);

        Cone c2 = new Cone(3.5, 9, 2);
        System.out.println(c2);

        Cone c3 = new Cone(20, 13.9, 2);
        System.out.println(c3);

        Cone c4 = new Cone(37.78, 16.53, 3);
        System.out.println(c4);
        
        Cone c5 = new Cone(6, 8);
        System.out.println(c5);
        
    }
}
