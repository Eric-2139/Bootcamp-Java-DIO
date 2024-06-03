package com.java.dio.Encapsulamento;

public class MSNMenseger {
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem");
        salvarHistoricoMensagem();
    }

    public void receberMensagem() {
        validarConectadoInternet();
        System.out.println("Recebendo mensagem");
        salvarHistoricoMensagem();
    }

    private void validarConectadoInternet() {
        System.out.println("Validando se esta conectado a internet");
    }

    private void salvarHistoricoMensagem() {
        System.out.println("Salvando o historico da mensagem");
    }
} 
