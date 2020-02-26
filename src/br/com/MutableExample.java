package src.br.com;

public class MutableExample {
    private String nome;

    public MutableExample(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static void main(String[] args) {
        MutableExample mutableExample = new MutableExample("Fulano");
        System.out.println(mutableExample.getNome());

        mutableExample.setNome("Ciclano");
        System.out.println(mutableExample.getNome());
    }
}
