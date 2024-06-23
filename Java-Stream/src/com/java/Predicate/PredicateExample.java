package com.java.Predicate;

import java.util.Arrays;
import java.util.List;
//import java.util.function.Predicate;

/*Representa uma função que aceita um argumento do tipo T e retorna um valor booleano (verdadeiro ou falso). É comumente usada para filtrar os elementos do Stream com base em alguma condição.*/

public class PredicateExample {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("java", "kotlin", "python", "javascript", "c", "go", "ruby", "c#");

        /*Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;

        palavras.stream()
                .filter(maisDeCincoCaracteres)
                .forEach(p -> System.out.println(p));*/

        palavras.stream()
                .filter(p -> p.length() < 5)
                .forEach(f -> System.out.println(f));
    }
}
