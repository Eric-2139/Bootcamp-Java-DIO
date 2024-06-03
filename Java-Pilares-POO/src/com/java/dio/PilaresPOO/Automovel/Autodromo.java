package com.java.dio.PilaresPOO.Automovel;

public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChassi("1919819");
        jeep.ligar();

        Moto z400 = new Moto();
        z400.setChassi("51526");
        z400.ligar();
    }
}
