package src.br.com.TelescopeConstructor;

public class fatosNutricionaisTeste {
    public static void main(String[] args) {
        int tamanhoPorcao = 10;
        int porcao = 20;
        fatosNutricionais f = new fatosNutricionais(tamanhoPorcao,porcao);
        System.out.println(f.toString());

        int caloria =45;
        fatosNutricionais f2 = new fatosNutricionais(tamanhoPorcao, porcao, caloria);
        System.out.println(f2.toString());
    }
}
