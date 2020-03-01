package src.br.com.Threads;

public class MainTeste {
    public static void main(String[] args) {

        //Executamos três tarefas ao mesmo tempo.Porém com tempos diferentes.
        MinhaThread thread = new MinhaThread("Thread #1",600);
        MinhaThread thread2 = new MinhaThread("Thread #2",900);
        MinhaThread thread3 = new MinhaThread("Thread #3",500);
        MinhaThread thread4 = new MinhaThread("Thread #4",200);

        Runnable r = () ->{
            try {
                for (int i=0; i<6; i++){
                    System.out.println("Thread #5 contador "+i);
                    Thread.sleep(200);//Milesegundos que será printada
                    //Sleep é uma excessão verificada.Quando chamamos esse método
                    //existe a possibilidade da InterruptedException ser "lançado".
                    //InterruptedException significa que a thread foi interrombida.
                }
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("Contador 5 terminou a execução");
        };
        Thread  t  = new Thread(r);

        t.start();
        thread.start();
        thread2.start();
        thread4.start();

        // Apenas intanciar a classe MinhaThread não ira aparecer nada.Pois
        // para uma thread realmente conseguir ser executada e necessario
        // subescrever o método run.
    }
}
