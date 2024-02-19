public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status -> TV Ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("Novo Status -> Volume Atual: " + smartTv.volume);

        smartTv.escolherCanal(15);
        System.out.println("Canal atual: " + smartTv.canal);

    }
}
