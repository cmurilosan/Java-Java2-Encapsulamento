package br.com.bytebank.modelo;

public class Conta {

    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total;   //Criação de um contador e abertura de conta

    //Contrutor para abertura de contas
    public Conta(int agencia, int numero) {
        Conta.total ++; //Contador de contas
        this.agencia = agencia;
        this.numero = numero;
    }

    public static int getTotal() {
        return total;
    }

    public void deposita(double valor) {

        this.saldo += valor;
    }

    public boolean saca (double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        } else {
            return false;
        }
    }

    public double getSaldo(){

        return this.saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        if (numero <= 0) {
            System.out.println("Não pode valor menor que zero");
            return;
        }
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero <= 0){
            System.out.println("Não pode valor menor que zero");
            return;
        }
        this.numero = numero;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
}
