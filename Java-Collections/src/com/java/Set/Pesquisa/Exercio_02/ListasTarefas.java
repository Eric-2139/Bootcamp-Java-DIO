package com.java.Set.Pesquisa.Exercio_02;

import java.util.HashSet;
import java.util.Set;

public class ListasTarefas {
    private Set<Tarefa> tarefasSet;

    public ListasTarefas() {
        this.tarefasSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefasSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        Tarefa tarefaParaRemover = null;
        if (!tarefasSet.isEmpty()) {
            for (Tarefa t : tarefasSet) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefaParaRemover = t;
                    break;
                }
            }
            tarefasSet.remove(tarefaParaRemover);
        } else {
            System.out.println("O conjunto está vazio");
        }
    }

    public void exibirTarefas() {
        if (!tarefasSet.isEmpty()) {
            System.out.println(tarefasSet);
        } else {
            System.out.println("Tarefa não encontrada");
        }
    }

    public int contarTarefas() {
        return tarefasSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa t : tarefasSet) {
            if (t.isConcluida()) {
                tarefasConcluidas.add(t);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasNaoConcluidas = new HashSet<>();
        for (Tarefa t : tarefasNaoConcluidas) {
            if (!t.isConcluida()) {
                tarefasNaoConcluidas.add(t);
            }
        }
        return tarefasNaoConcluidas;
    }

    public void marcarTarefaConcluida(String descricao) {
        for (Tarefa t : tarefasSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setConcluida(true);
            }
        }
    }

    public void marcarTarefaPendente(String descricao) {
        Tarefa tarefaParaMarcarComoPendente = null;
        for (Tarefa t : tarefasSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaParaMarcarComoPendente = t;
                break;
            }
        }

        if (tarefaParaMarcarComoPendente != null) {
            if (tarefaParaMarcarComoPendente.isConcluida()) {
                tarefaParaMarcarComoPendente.setConcluida(false);
            }
        } else {
            System.out.println("Tarefa não encotrada na lista");
        }
    }

    public void limparListaTarefas() {
        if (tarefasSet.isEmpty()) {
            System.out.println("A lista ta vazia");
        } else {
            tarefasSet.clear();
        }
    }

    public static void main(String[] args) {
        ListasTarefas listasTarefas = new ListasTarefas();

        listasTarefas.adicionarTarefa("Acordar 5:30");
        listasTarefas.adicionarTarefa("Tomar café da manhã");
        listasTarefas.adicionarTarefa("Correr até eu não aguentar mais");
        listasTarefas.adicionarTarefa("Estudar");
        listasTarefas.adicionarTarefa("Ler um livro");
        listasTarefas.adicionarTarefa("Estudar de novo");

        listasTarefas.exibirTarefas();

        listasTarefas.removerTarefa("Estudar");
        listasTarefas.exibirTarefas();

        System.out.println("Total de tarefas na lista: " + listasTarefas.contarTarefas());

        System.out.println(listasTarefas.obterTarefasPendentes());

        listasTarefas.marcarTarefaConcluida("Ler um livro");
        listasTarefas.marcarTarefaConcluida("Tomar café da manhã");

        System.out.println(listasTarefas.obterTarefasConcluidas());

        listasTarefas.marcarTarefaPendente("Estudar Java");
        listasTarefas.exibirTarefas();

        listasTarefas.limparListaTarefas();
        listasTarefas.exibirTarefas();
    }
}
