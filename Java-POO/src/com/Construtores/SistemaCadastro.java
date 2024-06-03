package com.Construtores;

public class SistemaCadastro {
    public static void main(String[] args) {
        Pessoa marcos = new Pessoa("125463", "Marcos");

        marcos.setEndereco("Rua das Marias");

        System.out.println(marcos.getNome() + "-" + marcos.getCpf());
    }
}
