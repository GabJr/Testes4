package src.br.com.solid.openClosedPrinciple;

public class salaDeEmergencia {
    public static void main(String[] args) {
        HospitalAdmistracao hospitalAdmistracao = new HospitalAdmistracao();
        Funcionario funcionario = new Enfermeira(1,"Fulano","emergencia",true);

        hospitalAdmistracao.chamar(funcionario);
    }
}
