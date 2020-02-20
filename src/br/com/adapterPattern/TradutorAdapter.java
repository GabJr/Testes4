package src.br.com.adapterPattern;

public class TradutorAdapter implements ItalianoTarget {
    //Adaptee - A clase na qual estamos adapitando/
    private  JaponesAdaptee japonesAdaptee;
    //Construtor inclui a referencia para o instancia Adaptee
    public TradutorAdapter(JaponesAdaptee japonesAdaptee) {
        this.japonesAdaptee = japonesAdaptee;
    }

    @Override
    public String leDescricao(String palabras) {
        System.out.println("Lendo palavras em Italiano");
        System.out.println(palabras);
        return palabras;
    }

    @Override
    public void mostraImagens() {

    }

   public String traduz(String palavrasEmItaliano){
        System.out.println("Traduzindo as palavras em Italiano");
        palavrasEmItaliano = palavrasEmItaliano + "Buon giorno!!";
       System.out.println(palavrasEmItaliano);
       return palavrasEmItaliano;
    }


}
