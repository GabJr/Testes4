package src.Herenca;

public class Funcionario extends Pessoa {
    private int idFuncionario;

    public Funcionario(String nome, int telefone, int idade, String genero, int idFuncionario) {
        super(nome, telefone, idade, genero);
        this.idFuncionario = idFuncionario;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    @Override
    public void trabalho() {
        if (idFuncionario == 0){
            System.out.println("Funcionario não encontrado");
        }else{
            System.out.println("Empregado como funcionario");
        }

    }
}

