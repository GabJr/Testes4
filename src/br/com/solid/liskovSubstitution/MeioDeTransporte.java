package src.br.com.solid.liskovSubstitution;

public class MeioDeTransporte {
    private String nome;
    private double velocidade;

    public MeioDeTransporte(String nome, double velocidade) {
        this.nome = nome;
        this.velocidade = velocidade;
    }

    public void iniciarMotor() {
        System.out.println("Motor iniciado");
    }
}

