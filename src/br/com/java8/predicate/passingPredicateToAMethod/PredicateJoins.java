package src.br.com.java8.predicate.passingPredicateToAMethod;

import java.util.function.Predicate;

public class PredicateJoins {
    public static void main(String[] args) {
        int [] x = {0,1,3,7,9,10,15,20,26,30,45,50,70,75};
        Predicate<Integer> p1 = i->i>10;
        Calculo c = new Calculo();
        c.method(p1,x);




    }
}
