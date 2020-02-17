package src.br.com.designPattern;

abstract class CafeteriaBuilder {
    protected Cafeteria cafeteria;

    public Cafeteria getCafeteria() {
        return cafeteria;
    }

    public void setCafeteria(Cafeteria cafeteria) {
        this.cafeteria = cafeteria;
    }

    public void criandoCafe(){
        cafeteria = new Cafeteria();
        System.out.println("uma bebida foi criada");
    }
    public abstract void buildTamanho();
    public abstract void buildBebida();

}
