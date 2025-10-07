package ExercicioAssociacaoCarroMotorPessoa;

public class MainCarroMotorPessoa {
    public static void main(String[] args) {
        
        System.out.println("Criando Pessoa:");
        Pessoa dono = new Pessoa();
        dono.setNome("Maria Santos");
        dono.setEndereco("Avenida Brasil, 1000");
        System.out.println(dono.toString());
        System.out.println();
        
        System.out.println("Criando Motor:");
        Motor motor = new Motor();
        motor.setMarca("Volkswagen");
        motor.setPotencia(116.0f);
        motor.setCilindros(4);
        motor.setCombustivel("Flex");
        System.out.println(motor.toString());
        System.out.println();
        
        System.out.println("Criando Carro:");
        Carro carro = new Carro();
        carro.setFabricante("Volkswagen");
        carro.setModelo("Golf");
        carro.setCor("Preto");
        carro.setAno(2023);
        carro.setDono(dono);
        carro.setMotor(motor);
        System.out.println(carro.toString());
        System.out.println();
        
        System.out.println("Demonstrando Agregação:");
        Carro carro2 = new Carro();
        carro2.setFabricante("Audi");
        carro2.setModelo("A3");
        carro2.setCor("Branco");
        carro2.setAno(2024);
        carro2.setDono(dono);  
        carro2.setMotor(motor); 
    
        System.out.println("Informações Detalhadas:");
        System.out.println("Dono do carro: " + carro.getDono().getNome());
        System.out.println("Endereço: " + carro.getDono().getEndereco());
        System.out.println("Motor: " + carro.getMotor().getMarca() + 
                          " " + carro.getMotor().getPotencia() + "cv");
        System.out.println("Combustível: " + carro.getMotor().getCombustivel());
        System.out.println();
        
        Motor motorNovo = new Motor();
        motorNovo.setMarca("BMW");
        motorNovo.setPotencia(184.0f);
        motorNovo.setCilindros(4);
        motorNovo.setCombustivel("Gasolina");
        
        carro.setMotor(motorNovo);
        System.out.println("Carro atualizado:");
        System.out.println("Novo motor: " + carro.getMotor().getMarca() + 
                          " " + carro.getMotor().getPotencia() + "cv");
        System.out.println();
        
        System.out.println("Criando Novo Dono:");
        Pessoa dono2 = new Pessoa();
        dono2.setNome("Carlos Oliveira");
        dono2.setEndereco("Rua das Palmeiras, 500");
        
        carro2.setDono(dono2);
        System.out.println("Novo dono do " + carro2.getFabricante() + ": " + 
                          carro2.getDono().getNome());
        System.out.println();
        
        System.out.println("Carro 1: " + carro.getFabricante() + " " + carro.getModelo());
        System.out.println("  Dono: " + carro.getDono().getNome());
        System.out.println("  Motor: " + carro.getMotor().getMarca() + " " + 
                          carro.getMotor().getPotencia() + "cv");
        
        System.out.println("Carro 2: " + carro2.getFabricante() + " " + carro2.getModelo());
        System.out.println("  Dono: " + carro2.getDono().getNome());
        System.out.println("  Motor: " + carro2.getMotor().getMarca() + " " + 
                          carro2.getMotor().getPotencia() + "cv");
    }
}