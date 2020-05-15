package br.com.bytebank.main;

import br.com.bytebank.modelo.Cliente;
import br.com.bytebank.modelo.Conta;

public class TestaGetESet {

    public static void main(String[] args) {

        //Utilização do construtor e acesso aos atributos através dos métodos
        Conta conta = new Conta(1111,2222);
        conta.setNumero(1337);
        System.out.println("O número da conta é: " + conta.getNumero());

        Cliente sakura = new Cliente();
        conta.setTitular(sakura);
        sakura.setNome("Sakura");

        Cliente titularDaConta = conta.getTitular();
        titularDaConta.setProfissao("Ninja");

        System.out.println(titularDaConta);
        System.out.println(sakura);
        System.out.println(conta.getTitular());

    }
}
