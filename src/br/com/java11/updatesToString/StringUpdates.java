package src.br.com.java11.updatesToString;

import java.util.stream.Collectors;

public class StringUpdates {
    public static void main(String[] args) {
        String str = "";
        System.out.println(str.isBlank());

        str = "Apenas \numa \nfrase \nsem sentindo";
        System.out.println(str);
        System.out.println(str.lines().collect(Collectors.toList()));


        System.out.println("repetindo ".repeat(10));
    }
}
