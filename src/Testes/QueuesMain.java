package src.Testes;

import java.util.LinkedList;
import java.util.Queue;

public class QueuesMain {
    public static void main(String[] args) {
        Queue<String> filaBanco = new LinkedList();

        filaBanco.add("Maria");
        filaBanco.add("João");
        filaBanco.add("Marcos");

        //Retiramos o primeiro da fila
        filaBanco.poll();


        System.out.println(filaBanco);
    }
}
