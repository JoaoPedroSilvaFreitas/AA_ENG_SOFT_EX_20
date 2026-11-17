package padroesestruturais.facade;

import java.text.Normalizer;

public class Onibus {

    public boolean completarRota() {
        return OnibusFacade.verificarPendenciasRota(this);
    }
}
