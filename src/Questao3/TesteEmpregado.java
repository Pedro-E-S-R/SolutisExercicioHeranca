package Questao3;

public class TesteEmpregado {
    public static void main(String[] args) {
        Empregado e = new Empregado("Pedro","7599999999","Rua com saida");
        e.setSalarioBase(1412.87);
        e.setCodigoSetor(1047);
        e.setImposto(15);

        e.calcularSalario();
    }
}
