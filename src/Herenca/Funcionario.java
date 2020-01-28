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
    //polimorfismo
    public void trabalho() {
        if (idFuncionario == 0 || idFuncionario<0){
            System.out.println("Erro");
        }else{
            System.out.println("Registrado como funcionario");
        }

    }

    @Override
    public String toString() {
        return  "Nome: "+getNome()+
                "\nTelefone: " +getTelefone()+
                "\nIdade: "+getIdade()+
                "\nGenero: "+getGenero()+
                "\nId do Funcionario: "+getIdFuncionario() ;
    }
}

