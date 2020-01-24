package src.Herenca;

public abstract class Pessoa {
    private String nome;
    private int telefone;
    private int idade;
    private String genero;
    //Metodo Abstrato
    public abstract void trabalho();

    public Pessoa(String nome, int telefone, int idade, String genero) {
        this.nome = nome;
        this.telefone = telefone;
        this.idade = idade;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return  "Nome: " + nome + '\'' +
                ", Telefone=" + telefone +
                ", Idade=" + idade +
                ", Genero='" + genero + '\'' ;
    }
}
