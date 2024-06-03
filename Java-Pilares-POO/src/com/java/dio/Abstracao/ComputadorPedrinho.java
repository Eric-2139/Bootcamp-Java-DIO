package com.java.dio.Abstracao;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        System.out.println("MSN");
        MSNMenseger msn = new MSNMenseger();
        msn.enviarMensagem();
        msn.receberMensagem();

        System.out.println("");

        System.out.println("Facebook");
        FacebookMenseger fcb = new FacebookMenseger();
        fcb.enviarMensagem();
        fcb.receberMensagem();

        System.out.println("");

        System.out.println("Telegram");
        Telegram tlg = new Telegram();
        tlg.enviarMensagem();
        tlg.receberMensagem();
    }
}
 