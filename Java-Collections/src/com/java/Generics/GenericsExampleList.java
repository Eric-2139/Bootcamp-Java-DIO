package com.java.Generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsExampleList {
    public static void main(String[] args) {

        // Lista sem generics
        /*
         * List listaSemGenerics = new ArrayList();
         * listaSemGenerics.add("Elemento 1");
         * listaSemGenerics.add(10);
         * 
         * for (Object elemento : listaSemGenerics) {
         * String str = (String) elemento;
         * System.out.println(str);
         * }
         */

        // Lista com generics
        List<String> listaGenerics = new ArrayList<>();
        listaGenerics.add("Elemento 1");
        listaGenerics.add("Elemento 2");

        for (String elemento : listaGenerics) {
            System.out.println(elemento);
        }
    }
}