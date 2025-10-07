package ExercicioAssociacaoHomeTheater;

public class MainHomeTheater {
    public static void main(String[] args) {
        
        SistemaDeSom som = new SistemaDeSom();
        som.setMarca("Sony");
        som.setModelo("HT-S500RF");
        som.setPotencia(500.0f);
        som.setTensao(110.0f);
        som.setConsumo(200.0f);
        System.out.println(som.toString());
        System.out.println();

        SistemaDeVideo video = new SistemaDeVideo();
        video.setMarca("Samsung");
        video.setModelo("QLED 4K 75\"");
        video.setTipo("Smart TV");
        video.setResolucao("3840x2160");
        System.out.println(video.toString());
        System.out.println();
        
        HomeTheater homeTheater = new HomeTheater();
        homeTheater.setSom(som);
        homeTheater.setVideo(video);
        System.out.println(homeTheater.toString());
        System.out.println();
        
        som.setPotencia(600.0f);
        video.setResolucao("7680x4320 (8K)");
        
        System.out.println("Potência do som: " + som.getPotencia() + "W");
        System.out.println("Resolução do vídeo: " + video.getResolucao());
        System.out.println();
        
        System.out.println("Marca do som: " + homeTheater.getSom().getMarca());
        System.out.println("Modelo do vídeo: " + homeTheater.getVideo().getModelo());
        System.out.println("Tensão do equipamento: " + homeTheater.getSom().getTensao() + "V");
        System.out.println();
        
        System.out.println("6. Demonstrando Agregação:");
        
        SistemaDeSom som2 = new SistemaDeSom();
        som2.setMarca("LG");
        som2.setModelo("SL8YG");
        som2.setPotencia(450.0f);
        som2.setTensao(220.0f);
        som2.setConsumo(180.0f);
        
        HomeTheater homeTheater2 = new HomeTheater();
        homeTheater2.setSom(som2);
        homeTheater2.setVideo(video);  
        
        System.out.println(homeTheater2.toString());
        System.out.println();
        
        System.out.println("Home Theater 1 e 2 são o mesmo objeto? " + 
                          (homeTheater == homeTheater2));
        
        System.out.println("Sistema de vídeo é o mesmo nos dois? " + 
                          (homeTheater.getVideo() == homeTheater2.getVideo()));
        
        System.out.println();
        
        System.out.println("Home Theater 1 - " + homeTheater.getSom().getMarca() + 
                         " + " + homeTheater.getVideo().getMarca());
        System.out.println("Home Theater 2 - " + homeTheater2.getSom().getMarca() + 
                         " + " + homeTheater2.getVideo().getMarca());
    }
}