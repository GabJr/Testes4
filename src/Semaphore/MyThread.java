import src.Semaphore.Shared;

import java.util.concurrent.Semaphore;

public class MyThread extends Thread {
    Semaphore sema;
    String nome;

    public MyThread(Semaphore sema, String nome) {
        super(nome);
        this.sema = sema;
        this.nome = nome;
    }

    public void run() {
        if (this.getName().equals("A")) {
            System.out.println("Iniciando " + nome);
            try {
                System.out.println(nome + " está esperando permissão.");
                sema.acquire();
                /*Cada 'acquire' bloqueia se necessario até a permissão
                esteja disponivel*/
                System.out.println(nome + " recebeu permissão");

               /* AGora iremos acessar o que foi compartilhado
                 outras threads irão esperar até esse thread
                  "destravar"*/
                for (int i = 0; i < 7; i++) {
                    Shared.count++;
                    System.out.println(nome + ":" + Shared.count);

                    //Dormir para execução da thread b
                    Thread.sleep(10);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            //Lançando permição para a proxima thread
            System.out.println(nome + "permisão concedida");
            sema.release();

            //Rodando Thread B
        } else {
            System.out.println("Iniciando " + nome);
            try {

                System.out.println(nome + " está esperando permissão.");
                //adquirindo a permissão
                sema.acquire();

                System.out.println(nome + " recebeu permissão");

               /* AGora iremos acessar o que foi compartilhado
                 outras threads irão esperar até esse thread
                  "destravar"*/
                for (int i = 0; i < 7; i++) {
                    Shared.count++;
                    System.out.println(nome + ":" + Shared.count);

                    //Dormir para execução da thread a
                    Thread.sleep(10);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            //Lançando permição para a proxima thread
            System.out.println(nome + "permisão concedida");
            sema.release();
        }

    }


}
