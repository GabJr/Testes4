package src.ImmutableAndMutable;

public class Imutavel {
    private final String nome;

    public Imutavel(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public static void main(String[] args) {
        Imutavel imutavel =  new Imutavel("Teste");
        System.out.println(imutavel.getNome());


    }
}
