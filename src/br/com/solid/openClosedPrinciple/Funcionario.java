package src.br.com.solid.openClosedPrinciple;

abstract public class Funcionario {
    private int id;
    private String nome;
    private String departmento;
    private boolean trabalhando;
    public Funcionario(int id, String nome, String departmento, boolean trabalhando) {
        this.id = id;
        this.nome = nome;
        this.departmento = departmento;
        this.trabalhando = trabalhando;
    }
    public abstract void fazerTarefas();

    public String toString() {
        return "Funcionario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", departmento='" + departmento + '\'' +
                ", trabalhando=" + trabalhando +
                '}';
    }
}
