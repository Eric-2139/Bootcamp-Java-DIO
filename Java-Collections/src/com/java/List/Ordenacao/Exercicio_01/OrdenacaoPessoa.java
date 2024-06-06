package com.java.List.Ordenacao.Exercicio_01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenadaPorIdade() {
        List<Pessoa> pessoaPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorIdade);
        return pessoaPorIdade;
    }

    public List<Pessoa> ordenadaPorAltura() {
        List<Pessoa> pessoaPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorAltura, new ComparatorPorAltura());
        return pessoaPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa("Eric", 18, 1.80);
        ordenacaoPessoa.adicionarPessoa("Matheus", 19, 1.70);
        ordenacaoPessoa.adicionarPessoa("Eduardo", 19, 1.82);
        ordenacaoPessoa.adicionarPessoa("Jarbas", 63, 1.76);

        System.out.println(ordenacaoPessoa.ordenadaPorIdade());

        System.out.println("");

        System.out.println(ordenacaoPessoa.ordenadaPorAltura());
    }
}
