package src.br.com.java8.predicate.passingPredicateToAMethod;

import java.util.function.Predicate;

public class Calculo {
    public void method(Predicate<Integer> p, int[] x){
        for (int eachValue:x) {
            if (p.test(eachValue)){
                System.out.println(eachValue);
            }
            
        }
    }

}
