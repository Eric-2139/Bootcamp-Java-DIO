package com.java.Exercicios;

import java.util.Arrays;
import java.util.List;

public class Exercicio_05 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int resultado = numeros.stream()
                .filter(n -> n > 5)
                .reduce(0, (n1, n2) -> (n1 + n2));

        System.out.println("A média dos numeros superiores a 5 é " + resultado / 5);
    }
}
