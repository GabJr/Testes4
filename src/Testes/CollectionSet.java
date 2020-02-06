package src.Testes;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionSet {
    public static void main(String[]args){
        String[]cores={"verde","amarelo","azul","branco","azul","amarelo","azul","verde"};

        List<String> list = Arrays.asList(cores);
        System.out.println(list);

        //Com a interface SET
        Set<String> set = set = new HashSet<>(list);
        System.out.println(set);


    }
}
    