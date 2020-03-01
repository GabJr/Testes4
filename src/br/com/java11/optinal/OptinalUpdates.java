package src.br.com.java11.optinal;

import java.util.Optional;

public class OptinalUpdates {
    public static void main(String[] args) {
        Optional <String> str = Optional.empty();
        //Optional <String> str = Optional.of("fdgf");

/*        if (str.isPresent()) {

        }else{

        }*/
        System.out.println(str.isEmpty());
    }
}
