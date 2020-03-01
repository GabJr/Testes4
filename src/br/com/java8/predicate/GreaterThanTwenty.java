package src.br.com.java8.predicate;

import java.util.function.Predicate;

public class GreaterThanTwenty {
    public static void main(String[] args) {
        Predicate<Integer> p = i->(i>20);
        System.out.println(p.test(15));
        System.out.println(p.test(41));
        System.out.println(p.test(45));

        //Comprimeto de uma string | Length of String
        Predicate<String> p2 = s -> (s.length()>5);
        System.out.println("With String: ");
        System.out.println(p2.test("abc"));
        System.out.println(p2.test("abcdefg"));

        //Contadno o numero de letras.
        //Usanddo Function Inteface para retornas os números

    }
}
