package src.br.com.java10.var;

import java.util.HashMap;
import java.util.List;

public class VarDemo {
    public static void main(String[] args) {
        var x =10;
        var map = new HashMap<String, List<String>>();
        for (var entry : map.entrySet()){
            var value = entry.getValue();
        }
    }
}
