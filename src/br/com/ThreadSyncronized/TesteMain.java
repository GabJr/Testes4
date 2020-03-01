package src.br.com.ThreadSyncronized;

import java.util.concurrent.Semaphore;

public class TesteMain {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        Semaphore sem = new Semaphore(1);
        ThreadSoma t1 = new ThreadSoma("#1", array, sem);
        ThreadSoma t2 = new ThreadSoma("#2", array, sem);


    }
}
