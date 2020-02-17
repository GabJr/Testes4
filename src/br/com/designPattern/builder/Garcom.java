package src.br.com.designPattern;

public class Garcom {
    private CafeteriaBuilder cafeteriaBuilder;

    public Garcom(CafeteriaBuilder cafeteriaBuilder) {
        this.cafeteriaBuilder = cafeteriaBuilder;
    }

    public Garcom() {

    }

    public Cafeteria getCafeteriaBuilder() {
        return cafeteriaBuilder.getCafeteria();
    }

    public void setCafeteriaBuilder(CafeteriaBuilder cafeteriaBuilder) {
        this.cafeteriaBuilder = cafeteriaBuilder;
    }



    public void contructCafeteria(){
        cafeteriaBuilder.criandoCafe();
        cafeteriaBuilder.buildBebida();
        cafeteriaBuilder.buildTamanho();
    }
}
