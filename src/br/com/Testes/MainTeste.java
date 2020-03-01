package src.br.com.Testes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainTeste {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Fulano pereira", "1548484");
        Consumidor consumidor2 = new Consumidor("Fulaninho Garcia", "877854");
        Produto produto1 = new Produto("01", "Teclado Multilaser", 30);
        Produto produto2 = new Produto("02", "Mouse Logitech", 20);
        Produto produto3 = new Produto("03", "Sansung J7", 720);
        Produto produto4 = new Produto("04", "Cadeira ", 120);

        Map<Consumidor, List<Produto>> map = new HashMap<>();
//        map.put(consumidor1,produto2);
//        map.put(consumidor2,produto1);

//        for (Map.Entry<Consumidor,Produto> entry : map.entrySet()){
//            System.out.println(entry.getKey().getNome()+" - "+entry.getValue().getNome());
//        }

        List<Produto> produtosCompraConsu1 = new ArrayList<>();
        produtosCompraConsu1.add(produto1);
        produtosCompraConsu1.add(produto2);

        List<Produto> produtosCompraConsu2 = new ArrayList<>();
        produtosCompraConsu2.add(produto3);
        produtosCompraConsu2.add(produto4);


        map.put(consumidor1, produtosCompraConsu1);
        map.put(consumidor1, produtosCompraConsu2);
        map.put(consumidor2, produtosCompraConsu2);

        for (Map.Entry<Consumidor, List<Produto>> entry : map.entrySet()) {
            System.out.println(entry.getKey().getNome() +       ": ");
            for (Produto produto : entry.getValue()) {
                System.out.println(produto.getNome());
            }
        }
    }
}
