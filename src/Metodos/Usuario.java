package Metodos;

public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();
        smartTv.mudarCanal(3);
        smartTv.diminuirVolume();
        System.out.println("TV ligada ? " + smartTv.ligada);
        System.out.println("Canal atual ? " + smartTv.canal);
        System.out.println("Volume atual ? " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status da tv ligada ? " + smartTv.ligada);


    }

}
