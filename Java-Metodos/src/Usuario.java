public class Usuario {
    public static void main(String[] args) throws Exception {

        SistemaSmartTv smartTv = new SistemaSmartTv();

        smartTv.ligar();
        System.out.println("Novo status --> Tv ligada? " + smartTv.ligada);
        smartTv.desligar();
        System.out.println("Novo status --> Tv ligada? " + smartTv.ligada);

        smartTv.mudarCanal(7);

        smartTv.diminiuirVolume();
        smartTv.diminiuirVolume();
        smartTv.diminiuirVolume();
        smartTv.aumentarVolume();

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        



    }
}
