package com.java.dio.PilaresPOO.MSN;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        MSNMenseger msn = new MSNMenseger();

        msn.validarConectadoInternet();
        msn.enviarMensagem();
        msn.salvarHistoricoMensagem();
        msn.receberMensagem();
    }
}
