public class SistemaSmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void subirCanal() {
        canal++;
    }

    public void diminuirCanal() {
        canal--;
    }

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
    }

    public void aumentarVolume() {
        volume++;
        System.out.println("Aumentando volume para: " + volume);
    }

    public void diminiuirVolume() {
        volume--;
        System.out.println("Diminuindo volume para: " + volume);
    }
}
