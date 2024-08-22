package questao4;

public class TesteAdministrador {
    public static void main(String[] args) {
        Administrador adm = new Administrador("pedro","111111111","rua");
        adm.setCodigoSetor(2024);
        adm.setSalarioBase(2540.00);
        adm.setImposto(15);
        adm.setAjudaDeCusto(350);
        adm.calcularSalario();// estou supondo que o imposto não taxe a ajuda de custo
    }
}
