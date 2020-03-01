package src.br.com.java10.changeCollectors;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ColletorsDemo {
    public static void main(String[] args) {
        List<Integer> l1 = List.of(11,12,13,14,15);

        System.out.println(l1);

        //Imuttable List
        List<Integer> l2 = l1.stream().filter(i -> i % 2 == 0).collect(Collectors.toUnmodifiableList());
        //l2.add(44);
        System.out.println(l2);
    }
}
