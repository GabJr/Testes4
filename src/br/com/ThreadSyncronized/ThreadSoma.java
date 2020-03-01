package src.br.com.ThreadSyncronized;

import java.util.concurrent.Semaphore;

public class ThreadSoma implements Runnable {
    private String nome;
    private int [] nums;
    private static Calculadora calculadora = new Calculadora();
    Semaphore sem;

    public ThreadSoma(String nome, int[] nums, Semaphore sem) {
        this.nome = nome;
        this.nums = nums;
        this.sem = sem;
        new Thread(this, nome).start();
    }

    @Override
    public void run() {
        try {
            sem.acquire();
            System.out.println(this.nome + " iniciada");
            int soma = calculadora.somaArray(this.nums);
            System.out.println("Resultado da soma para thread "+this.nome+" é " +soma);
            System.out.println(this.nome + "terminado");
            sem.release();
        } catch (InterruptedException e) {
            e.printStackTrace();

        }

    }
}
