package src.exemplo;

public class Gerente {
    private String nome;
    private String cpd;
    private double salario;
    private int senha;

    public Gerente(String nome, String cpd, double salario, int senha) {
        this.nome = nome;
        this.cpd = cpd;
        this.salario = salario;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpd() {
        return cpd;
    }

    public void setCpd(String cpd) {
        this.cpd = cpd;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autentica(int senha){
        if (this.senha == senha){
            System.out.println("Acesso Permetido");
            return true;
        }else {
            System.out.println("Acesso Negado");
            return false;
        }

    }


}
