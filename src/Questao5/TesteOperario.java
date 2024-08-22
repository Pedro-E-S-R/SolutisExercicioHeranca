package Questao5;

public class TesteOperario {
    public static void main(String[] args) {
        Operario o = new Operario("pedro","111111111","rua");
        o.setCodigoSetor(2024);
        o.setSalarioBase(2540.00);
        o.setImposto(15);
        o.setValorProducao(15000);
        o.setComissao(5);
        o.calcularSalario();// Estou supondo que o imposta calculo emcima das comissões
    }
}
