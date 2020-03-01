package src.br.com.Threads;

public class MinhaThread extends Thread {
    private String nome;
    private int tempo;

    public MinhaThread(String nome, int tempo) {
        this.nome = nome;
        this.tempo = tempo;
        //Star "chama" o método run. Ele ira executar o run.
    }

    //Sobreescrevendo metodo run.
    public void run(){
        try {
            for (int i=0; i<6; i++){
                System.out.println(nome+ " contador "+i);
                Thread.sleep(tempo);//Milesegundos que será printada
                //Sleep é uma excessão verificada.Quando chamamos esse método
                //existe a possibilidade da InterruptedException ser "lançado".
                //InterruptedException significa que a thread foi interrombida.
            }
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(nome + " terminou a execução");
        //Quando chegamos nessa parte a thread chega no estado de "dead". Ou seja
        //a theread encerrou sua execução.

    }



}
