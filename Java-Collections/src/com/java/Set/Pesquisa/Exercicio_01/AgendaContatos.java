package com.java.Set.Pesquisa.Exercicio_01;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicioanrContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContato() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatoPorNome = new HashSet<>();
        for (Contato c : contatoSet) {
            if (c.getNome().startsWith(nome)) {
                contatoPorNome.add(c);
            }
        }
        return contatoPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContato();

        agendaContatos.adicioanrContato("Álvaro", 999765231);
        agendaContatos.adicioanrContato("Márcio", 995317794);
        agendaContatos.adicioanrContato("Davi", 999845518);
        agendaContatos.adicioanrContato("Daniel", 967326246);
        agendaContatos.adicioanrContato("Caduh", 996325971);
        agendaContatos.adicioanrContato("Davi", 978546213);

        agendaContatos.exibirContato(); 

        System.out.println(agendaContatos.pesquisarPorNome("Álvaro"));

        System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("Márcio", 999474355));
    }
}
