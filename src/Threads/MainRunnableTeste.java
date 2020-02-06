package src.Threads;

public class MainRunnableTeste {
    public static void main(String[] args) {
        MinhaThreadRunnable mtr1 = new MinhaThreadRunnable("Thread #1",600);
        //Ao executar somente isso nada ira acontecer. A classe MinhaThhreadRunnable
        //apenas implementa a interface Runnable. Ela não é de fato uma Thread.
        //Para "realmente" ser um thread é necessario que a classe MinhaThreadRunnable "passe"
        //para a thread.

/*      Thread t1 = new Thread(mtr1);
        t1.start();*/
//      Se for instanciar mais de uma classe, coloque no construtor se precisar.
        MinhaThreadRunnable mtr2 = new MinhaThreadRunnable("Thread #2",500);
        MinhaThreadRunnable mtr3 = new MinhaThreadRunnable("Thread #3",800);

        Thread t1 =new Thread(mtr1);
        Thread t2 =new Thread(mtr2);
        Thread t3 =new Thread(mtr3);

        t1.start();
        t2.start();
        t3.start();
 /*       Thread class provides the join() method which allows one
        thread to wait until another thread completes
        its execution.*/

        /*Iremos iniciar as 3 threads, onde elas terão sua execução.
        * Logo depois o metodo join ira esperar execução das 3 threads acabarem.
        * Para depois imprimir a mensagem.*/
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
            System.out.println("Programa finalizado");
    }
}
