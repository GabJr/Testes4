package src.br.com.java8.functions;

import java.util.function.Function;

public class FunctionTest {
    public static void main(String[] args) {
        //Contndo o numero de letras.
        //Usando Function Inteface para retornas os números de Strings
        Function<String, Integer>f = s -> s.length();
        System.out.println(f.apply("Fulaninho"));
        System.out.println(f.apply("Pedro"));

    }
}
