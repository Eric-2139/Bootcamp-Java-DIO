package com.java.Exercicios;

import java.util.Arrays;
import java.util.List;

public class Exercicio_11 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> somaNumerosQuadrado = numeros.stream()
                .map(n -> n * n)
                .toList();

        int resultado = somaNumerosQuadrado.stream()
                .reduce(0, (n1, n2) -> n1 + n2);

        System.out.println(somaNumerosQuadrado);
        System.out.println("A soma dos quadrados dos números da lista é " + resultado);
    }
}
