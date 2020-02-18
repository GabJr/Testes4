package src.com.br.gabriel.adapterPattern;

import java.util.stream.IntStream;

public class JaponesAdaptee {
    public void recuperaDescricao (String emJapones){
        IntStream descricao = emJapones.chars();
        System.out.println("Recebendo a descrição do Adapter");
        System.out.println(descricao);
    }
    public void apresentaInstrucoes(String descricoes){
        System.out.println("Apresentando as instruções");
        System.out.println(descricoes);
    }

}
