package questao4;

import Questao3.Empregado;

public class Administrador extends Empregado {

    private double ajudaDeCusto;

    public Administrador(String nome, String telefone, String endereco) {
        super(nome, telefone, endereco);
    }

    public Administrador(String nome, String telefone, String endereco, int codigoSetor,
                         double salarioBase, double imposto, double ajudaDeCusto) {
        super(nome, telefone, endereco, codigoSetor, salarioBase, imposto);
        this.ajudaDeCusto = ajudaDeCusto;
    }

    @Override
    public void calcularSalario(){
        double salario = getSalarioBase() * (1-getImposto()/100) + this.ajudaDeCusto;
        System.out.printf("Salario liquido é : R$%.2f",salario);
    }

    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }
}
