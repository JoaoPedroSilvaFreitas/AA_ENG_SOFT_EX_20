package padroesestruturais.facade;

public class PontoDireito extends Ponto {

    private static PontoDireito finaceiro = new PontoDireito();

    private PontoDireito() {};

    public static PontoDireito getInstancia() {
        return finaceiro;
    }
}
