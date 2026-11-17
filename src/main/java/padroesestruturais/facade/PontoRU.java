package padroesestruturais.facade;

import java.util.ArrayList;

public class PontoRU extends Ponto {

    private static PontoRU pontoRU = new PontoRU();

    private PontoRU() {};

    public static PontoRU getInstancia() {
        return pontoRU;
    }
}
