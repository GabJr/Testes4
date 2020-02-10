package src.ImmutableAndMutable;

public class UmaClasse {
    public String nome;

    public UmaClasse(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static void main(String[] args) {
        UmaClasse a = new UmaClasse("Gabriel");
        UmaClasse b=a;
       // b.setNome("Novo Nome");

        //memoria
        a.nome = "aaaaaaaaaaaaaaa";

        System.out.println("Esse é o A "+a.nome);
        System.out.println("Esse é o B:"+b.nome);

        //Primitivo
        int x = 5;
        int y=x;

        x=2;
        System.out.println("Esse é o X: "+x);
        System.out.println("Esse é o Y: "+y);

    }
}
