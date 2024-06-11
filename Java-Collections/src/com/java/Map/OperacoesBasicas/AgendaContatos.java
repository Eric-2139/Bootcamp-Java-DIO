package com.java.Map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    @Override
    public String toString() {
        return "AgendaContatos [agendaContatoMap=" + agendaContatoMap + "]";
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Álvaro", 999765231);
        agendaContatos.adicionarContato("Márcio", 995317794);
        agendaContatos.adicionarContato("Davi", 999845518);
        agendaContatos.adicionarContato("Daniel", 967326246);
        agendaContatos.adicionarContato("Caduh", 996325971);
        agendaContatos.adicionarContato("Davi", 978546213);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Caduh");
        agendaContatos.exibirContatos();

        System.out.println("O número é: " + agendaContatos.pesquisarPorNome("Álvaro"));
    }
}
