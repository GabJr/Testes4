package src.br.com.Testes;

import java.util.Stack;

public class StackMain {
    public static void main(String[] args) {
        Stack<String> livros = new Stack<String>();
        livros.add("HP");
        livros.add("Livro de Matematica");
        livros.add("Livro de Português");
        //pop ira remover o Livro de Portugues do topo
        System.out.println(livros.pop());
        System.out.println(livros.push("Outro Livro"));
        System.out.println(livros);
    }
}
