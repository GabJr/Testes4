package src.br.com.java8.lambda.parameters;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <=10 ; i++) {
            System.out.println("Child Thread");
        }
    }
}
