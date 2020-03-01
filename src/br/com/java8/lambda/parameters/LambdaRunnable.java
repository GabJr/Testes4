package src.br.com.java8.lambda.parameters;

public class LambdaRunnable {
    public static void main(String[] args) {

        //versão java 7
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Is running");
            }
        }).run();


        //versão java 8
        new Thread(()-> System.out.println("running with lambda")).run();

    }
}
