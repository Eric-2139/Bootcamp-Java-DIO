package com.java.Map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atarcao) {
        Evento evento = new Evento(nome, atarcao);
        eventosMap.put(data, evento);
    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);

        for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
          LocalDate dataEvento = entry.getKey();
          Evento evento = entry.getValue();
          System.out.println("Data: " + dataEvento + ", Evento: " + evento.getNome() + ", Atração: " + evento.getAtracao());
        }
    }

    public void obterProximoEvento() {
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;

        for (Map.Entry<LocalDate, Evento> entry : eventosMap.entrySet()) {
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();

                System.out.println("O próximo evento: " + proximoEvento + "acontecerá na data" + proximaData);
                break;
            }
        }

        
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.JUNE, 9), "Evento 1", "Atração 1");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.JUNE, 14), "Meu aniversario", "Boa pergunta");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.JUNE, 21), "Elden Ring Shadow of Erdtree", "Gameplay");

        agendaEventos.exibirAgenda();

        agendaEventos.obterProximoEvento();
    }
}
