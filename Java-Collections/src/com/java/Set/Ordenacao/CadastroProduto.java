package com.java.Set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {
    private Set<Produto> produtoSet;

    public CadastroProduto() {
        this.produtoSet = new HashSet<>() ;
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        produtoSet.add(new Produto(cod, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProduto cadastroProduto = new CadastroProduto();

        cadastroProduto.adicionarProduto(1L, "Produto 1", 15.0, 5);
        cadastroProduto.adicionarProduto(2L, "Produto 2", 20.0, 6);
        cadastroProduto.adicionarProduto(3L, "Produto 3", 30.0, 4);
        cadastroProduto.adicionarProduto(4L, "Produto 4", 45.0, 2);

        System.out.println(cadastroProduto.produtoSet);

        System.out.println("");

        System.out.println(cadastroProduto.exibirProdutosPorNome());

        System.out.println("");

        System.out.println(cadastroProduto.exibirProdutosPorPreco());
    }
}

