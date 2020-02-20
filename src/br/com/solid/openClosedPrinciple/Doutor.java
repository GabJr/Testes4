package src.br.com.solid.openClosedPrinciple;

public class Doutor extends Funcionario {

    public Doutor(int id, String nome, String departmento, boolean trabalhando) {
        super(id, nome, departmento, trabalhando);
        System.out.println("Doutor em ação  ");
    }

    //Medicos
    private void prescreverRemedio(){
        System.out.println("prescrevendo Remedio");
    }
    private void diagnosticoPaciente(){
        System.out.println("diagnósticando o paciente");
    }

    @Override
    public void fazerTarefas() {
        prescreverRemedio();
        diagnosticoPaciente();
    }


}
