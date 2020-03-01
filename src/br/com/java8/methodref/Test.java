package src.br.com.java8.methodref;

public class Test {
    public static void main(String[] args) {
        Runnable r = MethodRefDemo ::myMethod;

        Thread t = new Thread(r);
        t.start();

        for (int i = 0; i <10 ; i++) {
            System.out.println("Parent Thread");
        }
    }
}
