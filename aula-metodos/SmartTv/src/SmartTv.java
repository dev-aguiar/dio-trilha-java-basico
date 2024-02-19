public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void escolherCanal(int novoCanal) {
        canal = novoCanal;
    }

    public void mudarCanal() {
        System.out.println(canal++);
    }

    public void aumentarVolume() {
        System.out.println(volume++);
    }

    public void diminuirVolume() {
        System.out.println(volume--);
    }
}
