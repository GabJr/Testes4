package src.br.com.Static;

public class Classe {
     String aluno;
     static String professor;

     //metod static apenas acessam atributos statics
     static void ensinar(){
        System.out.println("Professor "+professor +" pertende a essa classe");
     }



}
