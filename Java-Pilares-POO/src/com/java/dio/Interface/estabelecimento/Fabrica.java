package com.java.dio.Interface.estabelecimento;

import com.java.dio.Interface.equipamentos.copiadora.Copiadora;
import com.java.dio.Interface.equipamentos.digitalizadora.Digitalizadora;
import com.java.dio.Interface.equipamentos.impressora.Impressora;
import com.java.dio.Interface.equipamentos.multifuncional.EquipamentoMultifucional;

public class Fabrica {
    public static void main(String[] args) {
       EquipamentoMultifucional eMultifucional = new EquipamentoMultifucional();
       
       Impressora impressora = eMultifucional;
       Digitalizadora digitalizadora = eMultifucional;
       Copiadora copiadora = eMultifucional;

       impressora.imprimir();
       digitalizadora.digitalizar();
       copiadora.copiar();
    }
}
