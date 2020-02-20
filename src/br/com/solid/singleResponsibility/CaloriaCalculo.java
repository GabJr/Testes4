package src.br.com.solid.singleResponsibility;

public class CaloriaCalculo {
    private Workout w;

    public CaloriaCalculo(Workout w) {
        this.w = w;
    }

    public int gastoCalorico() {
        int resultado = w.tempoHora*w.peso*w.tempoHora;
        return resultado;
    }

}
