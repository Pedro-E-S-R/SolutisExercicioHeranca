package Questao3;

import Questao1.Pessoa;

public class Empregado extends Pessoa {

    private int codigoSetor;
    private double salarioBase;
    private double imposto;
    public Empregado(String nome, String telefone, String endereco) {
        super(nome, telefone, endereco);
    }
    public Empregado(String nome, String telefone, String endereco, int codigoSetor, double salarioBase, double imposto) {
        super(nome, telefone, endereco);
        this.codigoSetor = codigoSetor;
        this.salarioBase = salarioBase;
        this.imposto = imposto;
    }

    public void calcularSalario(){
        double salario = salarioBase * (1-imposto/100);
        System.out.printf("Salario liquido é : R$%.2f",salario);
    }
    public int getCodigoSetor() {
        return codigoSetor;
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }
}
