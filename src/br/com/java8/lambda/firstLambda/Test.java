package src.br.com.java8.lambda.firstLambda;

public class Test {
    public static void main(String[] args) {
     /*   A a = new C();
        a.myMethod();*/

     //With lambda
        A a = () -> System.out.println("Inside my Method");
        a.myMethod();
    }
}
