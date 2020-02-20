package src.br.com.solid.openClosedPrinciple;

public class Enfermeira extends Funcionario {
    public Enfermeira(int id, String nome, String departmento, boolean trabalhando) {
        super(id, nome, departmento, trabalhando);
        System.out.println("Enfermeira em ação ");
    }
    //Enfermeiras
    private void checarSinaisVitais(){
        System.out.println("Checando os Sinais Vitais");
    }
    private  void tirarSangue(){
        System.out.println("Tirando sangue");
    }
    private void limparAreaPaciente(){
        System.out.println("Limpando a area do paciente");
    }
    @Override
    public void fazerTarefas() {
        checarSinaisVitais();
        tirarSangue();
        limparAreaPaciente();
    }
}
