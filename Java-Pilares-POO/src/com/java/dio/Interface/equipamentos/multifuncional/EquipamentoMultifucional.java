package com.java.dio.Interface.equipamentos.multifuncional;

import com.java.dio.Interface.equipamentos.copiadora.Copiadora;
import com.java.dio.Interface.equipamentos.digitalizadora.Digitalizadora;
import com.java.dio.Interface.equipamentos.impressora.Impressora;

public class EquipamentoMultifucional implements Copiadora, Digitalizadora, Impressora {

    @Override
    public void copiar() {
       System.out.println("Copiando via equipamento multifuncional");
    }

    @Override
    public void digitalizar() {
        System.out.println("Copiando via equipamento multifuncional");
    }

    @Override
    public void imprimir() {
        System.out.println("Copiando via equipamento multifuncional");
    }
    
}
