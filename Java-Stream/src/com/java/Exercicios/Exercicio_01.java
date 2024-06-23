package com.java.Exercicios;

import java.util.Arrays;
import java.util.List;

public class Exercicio_01 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosEmOrdem = numeros.stream()
                .sorted()
                .toList();

        numerosEmOrdem.forEach(n -> System.out.print(n + ", "));
    }
}
