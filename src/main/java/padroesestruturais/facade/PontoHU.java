package padroesestruturais.facade;

public class PontoHU extends Ponto {

    private static PontoHU pontoHU = new PontoHU();

    private PontoHU() {};

    public static PontoHU getInstancia() {
        return pontoHU;
    }

}
