package src.br.com.designPattern;

public class CafeBuilder extends CafeteriaBuilder {

    @Override
    public void buildTamanho() {
        cafeteria.setTamanho("medio");
        System.out.println(" feito no tamanho medio");
    }

    @Override
    public void buildBebida() {
        cafeteria.setBebida("cafe");
        System.out.println(" cafe feito");
    }
}


