package src.Threads;

import java.util.concurrent.Semaphore;

public class MinhaThreadRunnable implements Runnable {
    private String nome;
    private int tempo;
    Semaphore sem;

    public MinhaThreadRunnable(String nome, int tempo, Semaphore sem) {
        this.nome = nome;
        this.tempo = tempo;
        this.sem = sem;
        // Thread t = new Thread(this);//Como é necessario passar um instancia da classe MinhaThreadRunnable,
        //usa se o this. o This faz referencia a propria classe.
        //t.start();
    }

    public synchronized void run(){
        try {
            sem.acquire();
            for (int i=0; i<6; i++){
                System.out.println(nome+ " contador "+i);
                Thread.sleep(tempo);
            }
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(nome + " terminou a execução");
        sem.release();
    }
}
