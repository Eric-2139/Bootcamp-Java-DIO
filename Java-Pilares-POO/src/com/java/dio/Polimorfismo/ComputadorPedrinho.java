package com.java.dio.Polimorfismo;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        ServicoMensagemInstantanea smi = null;

        String appEscolhido = "msn";

        if (appEscolhido.equals("msn")) {
            smi = new MSNMenseger();
        }

        if (appEscolhido.equals("fcb")) {
            smi = new FacebookMenseger();
        }

        if (appEscolhido.equals("tlg")) {
            smi = new Telegram();
        }

        smi.enviarMensagem();
        smi.receberMensagem();
    }
}
 