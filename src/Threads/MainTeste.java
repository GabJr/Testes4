package src.Threads;

public class MainTeste {
    public static void main(String[] args) {

        //Executamos três tarefas ao mesmo tempo.Porém com tempos diferentes.
        MinhaThread thread = new MinhaThread("Thread #1",600);
        MinhaThread thread2 = new MinhaThread("Thread #2",900);
        MinhaThread thread3 = new MinhaThread("Thread #3",500);
        // Apenas intanciar a classe MinhaThread não ira aparecer nada.Pois
        // para uma thread realmente conseguir ser executada e necessario
        // subescrever o método run.
    }
}
