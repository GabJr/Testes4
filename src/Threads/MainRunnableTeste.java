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
//      Se for instanciar mais de uma classe, coloque no construtor
        MinhaThreadRunnable mtr2 = new MinhaThreadRunnable("Thread #2",500);
        MinhaThreadRunnable mtr3 = new MinhaThreadRunnable("Thread #3",800);

    }
}
