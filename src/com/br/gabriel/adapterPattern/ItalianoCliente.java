package src.com.br.gabriel.adapterPattern;

public class ItalianoCliente {
    public static void main(String[] args) {
        JaponesAdaptee japonesAdaptee = new JaponesAdaptee();
        TradutorAdapter tradutorAdapter = new TradutorAdapter(japonesAdaptee);
        String palavras = "Palavras em Italiano";
        String palavrasEmJapones = tradutorAdapter.traduz(tradutorAdapter.leDescricao(palavras));
        japonesAdaptee.apresentaInstrucoes(palavrasEmJapones);
    }
}
