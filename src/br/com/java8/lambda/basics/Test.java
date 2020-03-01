package src.br.com.java8.lambda.basics;

public class Test {
    public static void main(String[] args) {
        Sum s = (x,y)-> System.out.println("Sum is: "+(x+y));
        s.add(10,78);
    }

}
