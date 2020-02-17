package src.br.com.designPattern;

public class ChaBuilder extends CafeteriaBuilder {
    @Override
    public void buildTamanho() {
        cafeteria.setTamanho("grande");
        System.out.println(" feito com tamanho grande");
    }

    @Override
    public void buildBebida() {
        cafeteria.setBebida("Chá");
        System.out.println("Chá feito");
    }
}
