package src.br.com.designPattern;

public class ClienteMain {
    public static void main(String[] args) {
        Garcom garcom = new Garcom();
        CafeteriaBuilder cafeBuilder = new CafeBuilder();

        garcom.setCafeteriaBuilder(cafeBuilder);
        garcom.contructCafeteria();

        Cafeteria bebida = garcom.getCafeteriaBuilder();
    }
}
