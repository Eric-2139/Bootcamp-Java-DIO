package com.mastersoft.lanchonete;

import com.mastersoft.lanchonete.area.cliente.Cliente;
import com.mastersoft.lanchonete.atendimento.Atendente;
import com.mastersoft.lanchonete.atendimento.cozinha.Almoxarife;
import com.mastersoft.lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
    public static void main(String[] args) {
        Cozinheiro cozinheiro = new Cozinheiro();
        //ações que o estabelecimento precisa ter ciência
        cozinheiro.adicionarLancheNoBalcao();;
        cozinheiro.adicionarSucoNoBalcao();
        cozinheiro.adiconarComboNoBalcao();

        Almoxarife almoxarife = new Almoxarife();

        Atendente atendente = new Atendente();
        atendente.servindoMesa();
        atendente.receberPagamento();
    
        Cliente cliente = new Cliente();
        cliente.escolherLanche();
        cliente.fazerPedido();
        cliente.pagarConta();
    }
}
