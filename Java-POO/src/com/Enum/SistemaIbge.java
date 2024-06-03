package com.Enum;

public class SistemaIbge {
    public static void main(String[] args) {
        for (EstadosBrasileiros e : EstadosBrasileiros.values()) {
            System.out.println(e.getSigla() + "-" + e.getNome());
        }

        EstadosBrasileiros eb = EstadosBrasileiros.MARANHAO;
        System.out.println(eb.getSigla() + "-" + eb.getNome());
    }
}
