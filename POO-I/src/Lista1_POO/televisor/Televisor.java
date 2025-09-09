package Lista1_POO.televisor;

public class Televisor {
    private int canal;
    private int volume;

    // Faixas válidas
    private final int MIN_CANAL = 1;
    private final int MAX_CANAL = 100;
    private final int MIN_VOLUME = 0;
    private final int MAX_VOLUME = 50;

    public Televisor() {
        this.canal = 1;   // canal inicial
        this.volume = 10; // volume inicial
    }

    public int getCanal() {
        return canal;
    }

    public int getVolume() {
        return volume;
    }

    public void setCanal(int canal) {
        if (canal >= MIN_CANAL && canal <= MAX_CANAL) {
            this.canal = canal;
        } else {
            System.out.println("Canal inválido! (válido: " + MIN_CANAL + " a " + MAX_CANAL + ")");
        }
    }

    public void aumentarVolume() {
        if (volume < MAX_VOLUME) {
            volume++;
        } else {
            System.out.println("Volume máximo atingido!");
        }
    }

    public void diminuirVolume() {
        if (volume > MIN_VOLUME) {
            volume--;
        } else {
            System.out.println("Volume mínimo atingido!");
        }
    }

    @Override
    public String toString() {
        return "Canal: " + canal + " | Volume: " + volume;
    }
}
