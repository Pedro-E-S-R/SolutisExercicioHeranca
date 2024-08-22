package questao6;

import Questao3.Empregado;

public class Vendedor extends Empregado {

    private double valorVendas;
    private double comissao;

    public Vendedor(String nome, String telefone, String endereco) {
        super(nome, telefone, endereco);
    }

    public Vendedor(String nome, String telefone, String endereco, int codigoSetor,
                    double salarioBase, double imposto, double valorVendas, double comissao) {
        super(nome, telefone, endereco, codigoSetor, salarioBase, imposto);
        this.valorVendas = valorVendas;
        this.comissao = comissao;
    }
    @Override
    public void calcularSalario(){
        double salario = (getSalarioBase() + (valorVendas)*(comissao/100)) * (1-getImposto()/100);
        System.out.printf("Salario liquido é : R$%.2f",salario);
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
}

