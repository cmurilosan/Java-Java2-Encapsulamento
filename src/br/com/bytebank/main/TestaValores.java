package br.com.bytebank.main;

import br.com.bytebank.modelo.Conta;

public class TestaValores {

    public static void main(String[] args) {

        //Construtor em ação
        Conta conta = new Conta(1122, 1234);
        Conta conta1 = new Conta(2233,5678);
        Conta conta2 = new Conta(3344, 9012);

        System.out.println("Total de contas cadastradas: " + Conta.getTotal());

    }
}
