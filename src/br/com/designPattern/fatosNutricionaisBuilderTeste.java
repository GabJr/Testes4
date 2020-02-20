package src.br.com.designPattern;

public class fatosNutricionaisBuilderTeste {
    public static void main(String[] args) {
        int tamanhoPorcao = 70;
        int porcao =40;

        fatosNutricionaisBuilder fnt = new
                fatosNutricionaisBuilder.Builder(tamanhoPorcao,porcao)
                .caloria(70)
                .carbo(18)
                .build();

        System.out.println(fnt.toString());

    }
}
