package src.ThreadSyncronized;

import src.Threads.MinhaThread;

public class TesteMain {
    public static void main(String[] args) {
        int [] array ={1,2,3,4,5};
        ThreadSoma t1 = new ThreadSoma("#1",array);
        ThreadSoma t2 = new ThreadSoma("#2",array);

    }
}
