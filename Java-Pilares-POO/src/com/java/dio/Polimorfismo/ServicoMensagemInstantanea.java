package com.java.dio.Polimorfismo;

public abstract class ServicoMensagemInstantanea {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    protected void validarConectadoInternet() {
        System.out.println("Validando se está concetado a internet");
    }
}
