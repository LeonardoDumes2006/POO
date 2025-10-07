package ExercicioAssociacaoComputador;

public class MainComputador {
    public static void main(String[] args) {
      
        System.out.println("Criando Processador:");
        Processador processador = new Processador();
        processador.setMarca("Intel");
        processador.setModelo("Core i5");
        processador.setCache(9.0f);
        System.out.println(processador.toString());
        
        System.out.println("\nMemória:");
        Memoria memoria = new Memoria();
        memoria.setMarca("Kingston");
        memoria.setModelo("Fury");
        memoria.setCapacidade(16.0f);
        memoria.setVelocidade(3200.0f);
        System.out.println(memoria.toString());
        
        System.out.println("\nHD:");
        HD hd = new HD();
        hd.setMarca("Seagate");
        hd.setModelo("Barracuda");
        hd.setCapacidade(1000.0f);
        hd.setRpm(3000);
        System.out.println(hd.toString());
        
        System.out.println("\nPlaca-Mãe:");
        PlacaMae placaMae = new PlacaMae();
        placaMae.setMarca("ASUS");
        placaMae.setModelo("Prime B660");
        placaMae.setProcessador(processador);
        placaMae.setHd(hd);
        placaMae.setMemoria(memoria);
        System.out.println(placaMae.toString());
        
        System.out.println("\n Gabinete:");
        Gabinete gabinete = new Gabinete();
        gabinete.setModelo("Gamer");
        gabinete.setTipo("ATX");
        gabinete.setBaias(4);
        gabinete.setPlacaMae(placaMae);
        System.out.println(gabinete.toString());
        
        System.out.println("\nCriando Periféricos:");
        
        Teclado teclado = new Teclado();
        teclado.setMarca("Logitech");
        teclado.setTipo("Mecânico");
        
        Mouse mouse = new Mouse();
        mouse.setMarca("Razer");
        mouse.setTipo("Gamer");
        
        Monitor monitor = new Monitor();
        monitor.setMarca("Samsung");
        monitor.setTipo("LED");
        monitor.setResolucao("1920x1080");
        
        System.out.println("Teclado: " + teclado.getMarca() + " - " + teclado.getTipo());
        System.out.println("Mouse: " + mouse.getMarca() + " - " + mouse.getTipo());
        System.out.println("Monitor: " + monitor.getMarca() + " - " + monitor.getResolucao());
        
        System.out.println("\nComputador Completo:");
        Computador computador = new Computador();
        computador.setMarca("Dell");
        computador.setModelo("Gamer Pro");
        computador.setGabinete(gabinete);
        computador.setTeclado(teclado);
        computador.setMouse(mouse);
        computador.setMonitor(monitor);
        
        System.out.println(computador.toString());
    }
}