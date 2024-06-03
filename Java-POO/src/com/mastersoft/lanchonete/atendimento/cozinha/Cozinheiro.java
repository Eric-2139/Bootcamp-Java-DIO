package com.mastersoft.lanchonete.atendimento.cozinha;

//visibilidade de recursos

public class Cozinheiro {
    public void adicionarLancheNoBalcao() {
        System.out.println("Adicionado lanche natural e hamburguer no balcão");
    }

    public void adicionarSucoNoBalcao() {
        System.out.println("Adicionado suco no balcao");
    }

    public void adiconarComboNoBalcao() {
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }

    private void prepararLanche() {
        selecionarIngredientesLanche();
        lavarIngredientes();
        fritarIngredientesLanche();
        System.out.println("Preparando lanche, tipo: hamburguer");
    }

    private void prepararVitamina() {
        selecionarIngredientesVitamina();
        baterVitaminaLiquidificador();
        System.out.println("Preparando suco");
    }

    private void prepararCombo() {
        prepararLanche();
        prepararVitamina();
    }

    private void selecionarIngredientesLanche() {
        System.out.println("Selecionado pao, ovo, salada e carne");
    }

    private void selecionarIngredientesVitamina() {
        System.out.println("Selecionado fruta, leite e suco");
    }

    private void lavarIngredientes() {
        System.out.println("Lavando ingredientes");
    }

    private void baterVitaminaLiquidificador() {
        System.out.println("Batendo vitamina liquidificador");
    }

    private void fritarIngredientesLanche() {
        System.out.println("Fritando a carne e o ovo para o hamburguer");
    }

    void pedirParaTrocarGas(Almoxarife meuAmigo) {
        meuAmigo.trocarGas();
    }

    void pedirIngredientes(Almoxarife almoxarife) {
        almoxarife.entregarIngredientes();
    }
}
