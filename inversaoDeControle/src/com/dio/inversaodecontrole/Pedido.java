package com.dio.inversaodecontrole;

public class Pedido {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();

        pedido.gravar();
    }

    private final EnviarEmail enviar = EnviarEmail.obterDadosEmail();

    private void gravar() {
        enviar.retornar("Pedido criado!");
    }
}
