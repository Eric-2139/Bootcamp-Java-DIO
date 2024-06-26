package com.java.Generics;

import java.util.HashSet;
import java.util.Set;

public class GenericsExampleSet {
    public static void main(String[] args) {

        // Exemplo sem generics
        /*
         * Set conjuntoSemGenerics = new HashSet();
         * conjuntoSemGenerics.add("Elemento 1");
         * conjuntoSemGenerics.add(10);
         * 
         * for (Object elemento : conjuntoSemGenerics) {
         * String str = (String) elemento;
         * System.out.println(str);
         * }
         */

        Set<String> conjuntoGenerics = new HashSet<>();
        conjuntoGenerics.add("Elemento 1");
        conjuntoGenerics.add("Elemento 2");

        for (String elemento : conjuntoGenerics) {
            System.out.println(elemento);
        }
    }
}
