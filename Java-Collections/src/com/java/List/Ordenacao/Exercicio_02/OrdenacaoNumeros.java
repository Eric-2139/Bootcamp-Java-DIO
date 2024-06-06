package com.java.List.Ordenacao.Exercicio_02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> numeros;

    public OrdenacaoNumeros() {
        this.numeros = new ArrayList<>();;
    }

    public void adicionarNumeros(int numero) {
        this.numeros.add(numero);
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> numerosAscendentes = new ArrayList<>(this.numeros);
        if (!numerosAscendentes.isEmpty()) {
            Collections.sort(numerosAscendentes);
            return numerosAscendentes;
        }
        else {
            throw new RuntimeException("A lista está vazia");
        }
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> numerosDescendentes = new ArrayList<>(this.numeros);
        if (!numerosDescendentes.isEmpty()) {
            numerosDescendentes.sort(Collections.reverseOrder());
            return numerosDescendentes;
        }
        else {
            throw new RuntimeException("A lista está vazia");
        }
    }

    public void exibirNumeros() {
        if (!numeros.isEmpty()) {
            System.out.println(this.numeros);
        }
        else {
            throw new RuntimeException("A lista está vazia");
        }
    }

    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        ordenacaoNumeros.adicionarNumeros(15);
        ordenacaoNumeros.adicionarNumeros(13);
        ordenacaoNumeros.adicionarNumeros(97);
        ordenacaoNumeros.adicionarNumeros(45);
        ordenacaoNumeros.adicionarNumeros(69);
        ordenacaoNumeros.adicionarNumeros(87);
        ordenacaoNumeros.adicionarNumeros(52);
        ordenacaoNumeros.adicionarNumeros(2);
        ordenacaoNumeros.adicionarNumeros(14);
        ordenacaoNumeros.adicionarNumeros(38);

        ordenacaoNumeros.exibirNumeros();

        System.out.println("");

        System.out.println(ordenacaoNumeros.ordenarAscendente());

        System.out.println("");

        System.out.println(ordenacaoNumeros.ordenarDescendente());
    }
}
