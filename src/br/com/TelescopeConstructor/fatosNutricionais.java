package src.br.com.TelescopeConstructor;

public class fatosNutricionais {
    private int tamanhoPorcao;
    private int porcao;
    private int caloria;
    private int gordura;
    private int sodio;
    private int carbo;

    public fatosNutricionais(int tamanhoPorcao, int porcao) {
        this.tamanhoPorcao = tamanhoPorcao;
        this.porcao = porcao;
    }

    public fatosNutricionais(int tamanhoPorcao, int porcao, int caloria) {
        this.tamanhoPorcao = tamanhoPorcao;
        this.porcao = porcao;
        this.caloria = caloria;
    }

    public fatosNutricionais(int tamanhoPorcao, int porcao, int caloria, int gordura) {
        this.tamanhoPorcao = tamanhoPorcao;
        this.porcao = porcao;
        this.caloria = caloria;
        this.gordura = gordura;
    }

    public fatosNutricionais(int tamanhoPorcao, int porcao, int caloria,
                             int gordura, int sodio) {
        this.tamanhoPorcao = tamanhoPorcao;
        this.porcao = porcao;
        this.caloria = caloria;
        this.gordura = gordura;
        this.sodio = sodio;
    }

    public fatosNutricionais(int tamanhoPorcao, int porcao, int caloria,
                             int gordura, int sodio, int carbo) {
        this.tamanhoPorcao = tamanhoPorcao;
        this.porcao = porcao;
        this.caloria = caloria;
        this.gordura = gordura;
        this.sodio = sodio;
        this.carbo = carbo;
    }

    public int getTamanhoPorcao() {
        return tamanhoPorcao;
    }

    public void setTamanhoPorcao(int tamanhoPorcao) {
        this.tamanhoPorcao = tamanhoPorcao;
    }

    public int getPorcao() {
        return porcao;
    }

    public void setPorcao(int porcao) {
        this.porcao = porcao;
    }

    public int getCaloria() {
        return caloria;
    }

    public void setCaloria(int caloria) {
        this.caloria = caloria;
    }

    public int getGordura() {
        return gordura;
    }

    public void setGordura(int gordura) {
        this.gordura = gordura;
    }

    public int getSodio() {
        return sodio;
    }

    public void setSodio(int sodio) {
        this.sodio = sodio;
    }

    public int getCarbo() {
        return carbo;
    }

    public void setCarbo(int carbo) {
        this.carbo = carbo;
    }

    @Override
    public String toString() {
        return "fatosNutricionais{" +
                "tamanhoPorcao=" + tamanhoPorcao +
                ", porcao=" + porcao +
                ", caloria=" + caloria +
                ", gordura=" + gordura +
                ", sodio=" + sodio +
                ", carbo=" + carbo +
                '}';
    }
}
