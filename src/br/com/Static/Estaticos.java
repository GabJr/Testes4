package src.br.com.Static;

public class Estaticos {
    public static void main(String[] args) {
        Classe.professor="Lucas";
        Classe.ensinar();

        Classe a1 = new Classe();
        a1.aluno = "Carlos";

        Classe a2 = new Classe();
        a2.aluno = "Ana";

        System.out.println(a1.professor);
        System.out.println(a2.professor);
    }

    public void sla(){

    }
}
