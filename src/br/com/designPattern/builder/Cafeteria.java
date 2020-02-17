package src.br.com.designPattern;

public class Cafeteria {
    private String tamanho;
    private String bebida;

    public Cafeteria(String tamanho, String bebida) {
        this.tamanho = tamanho;
        this.bebida = bebida;
    }

    public Cafeteria() {

    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getBebida() {
        return bebida;
    }

    public void setBebida(String bebida) {
        this.bebida = bebida;
    }
}
