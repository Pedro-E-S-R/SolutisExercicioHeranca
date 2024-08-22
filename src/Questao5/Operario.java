package Questao5;

import Questao3.Empregado;

public class Operario extends Empregado {

    private double valorProducao;
    private double comissao;

    public Operario(String nome, String telefone, String endereco) {
        super(nome, telefone, endereco);
    }

    public Operario(String nome, String telefone, String endereco, int codigoSetor,
                    double salarioBase, double imposto, double valorProducao, double comissao) {
        super(nome, telefone, endereco, codigoSetor, salarioBase, imposto);
        this.valorProducao = valorProducao;
        this.comissao = comissao;
    }
    @Override
    public void calcularSalario(){
        double salario = (getSalarioBase() + (valorProducao)*(comissao/100)) * (1-getImposto()/100);
        System.out.printf("Salario liquido é : R$%.2f",salario);
    }

    public double getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
}
