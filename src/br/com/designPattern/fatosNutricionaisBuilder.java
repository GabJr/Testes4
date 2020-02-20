package src.br.com.designPattern;


import javafx.util.Builder;

public class fatosNutricionaisBuilder {
    private final int tamanhoPorcao;
    private final int porcao;
    private final int caloria;
    private final int gordura;
    private final int sodio;
    private final int carbo;

    public fatosNutricionaisBuilder(Builder builder) {
        this.tamanhoPorcao = builder.tamanhoPorcao;
        this.porcao =  builder.porcao;
        this.caloria =  builder.caloria;
        this.gordura =  builder.gordura;
        this.sodio = builder.sodio;
        this.carbo = builder.carbo;
    }


    public static class Builder {
        private int tamanhoPorcao;
        private int porcao;
        private int caloria;
        private int gordura;
        private int sodio;
        private int carbo;


        public Builder (int tamanhoPorcao, int porcao){
            this.tamanhoPorcao = tamanhoPorcao;
            this.porcao = porcao;
        }
        public Builder caloria (int caloria){
            this.caloria = caloria;
            return this;
        }
        public Builder gordura (int gordura){
            this.gordura = gordura;
            return this;
        }
        public Builder sodio (int sodio){
            this.sodio=sodio;
            return this;
        }

        public Builder carbo (int carbo){
            this.carbo=carbo;
            return this;
        }
        public fatosNutricionaisBuilder build(){
            return new fatosNutricionaisBuilder(this);
        }

    }

    @Override
    public String toString() {
        return "fatosNutricionaisBuilder{" +
                "tamanhoPorcao=" + tamanhoPorcao +
                ", porcao=" + porcao +
                ", caloria=" + caloria +
                ", gordura=" + gordura +
                ", sodio=" + sodio +
                ", carbo=" + carbo +
                '}';
    }
}
