package com.java.List.OperacoesBasicas.Exemplo_1;

public class Tarefa {
    private String descricao;

    public String getDescricao() {
        return descricao;
    }

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }

    
}
