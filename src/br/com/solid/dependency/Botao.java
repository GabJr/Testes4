package src.br.com.solid.dependency;

public class Botao {

    private Dispositivo dispositivo;
    public boolean on;

    public Botao(Dispositivo dispositivo, boolean on) {
        this.dispositivo = dispositivo;
        this.on = on;
    }

    public boolean isOn() {
        return this.on;
    }

    public void acionar() {
        boolean checar = isOn();
        if (checar){
            dispositivo.ligar();
        }
    }
}

