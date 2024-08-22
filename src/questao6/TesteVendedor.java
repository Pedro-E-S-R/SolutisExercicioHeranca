package questao6;


public class TesteVendedor {
    public static void main(String[] args) {
        Vendedor v = new Vendedor("pedro","111111111","rua");
        v.setCodigoSetor(2024);
        v.setSalarioBase(2540.00);
        v.setImposto(15);
        v.setValorVendas(30000);
        v.setComissao(5);
        v.calcularSalario();// Estou supondo que o imposta calculo em cima das comissões
    }
}
