package Questao2;

import Questao1.Pessoa;

public class Fornecedor extends Pessoa {
    private double valorCredito;
    private double valorDivida;


    public Fornecedor(String nome, double valorCredito, double valorDivida) {
        super(nome);
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
    }

    public Fornecedor(String nome, String telefone, double valorCredito, double valorDivida) {
        super(nome, telefone);
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
    }

    public Fornecedor(String nome, String telefone, String endereco, double valorCredito, double valorDivida) {
        super(nome, telefone, endereco);
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
    }

    public void valorSaldo(){
        double valor = this.valorCredito - this.valorDivida;
        if(valor >=0){
            System.out.println("Seu saldo é 0 ou maior, saldo: "+valor);
        }else {
            System.out.println("Seu saldo esta negativo, saldo: "+valor);
        }
    }
}
