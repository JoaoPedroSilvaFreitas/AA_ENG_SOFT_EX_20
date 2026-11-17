package padroesestruturais.facade;

public class OnibusFacade {

    public static boolean verificarPendenciasRota(Onibus onibus) {
        if (PontoHU.getInstancia().verificarOnibusPendente(onibus)) {
            return false;
        }
        if (PontoRU.getInstancia().verificarOnibusPendente(onibus)) {
            return false;
        }
        if (PontoDireito.getInstancia().verificarOnibusPendente(onibus)) {
            return false;
        }
        return true;
    }
}
