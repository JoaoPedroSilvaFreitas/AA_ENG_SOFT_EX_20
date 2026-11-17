package padroesestruturais.facade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OnibusTest {

    @Test
    void deveRetornarPendenciaBibliotecaFormatura() {
        Onibus onibus = new Onibus();
        PontoRU.getInstancia().addOnibusPendente(onibus);

        assertEquals(false, onibus.completarRota());
    }

    @Test
    void deveRetornarPendenciaSecretariaFormatura() {
        Onibus onibus = new Onibus();
        PontoHU.getInstancia().addOnibusPendente(onibus);

        assertEquals(false, onibus.completarRota());
    }

    @Test
    void deveRetornarPendenciaFinanceiroFormatura() {
        Onibus onibus = new Onibus();
        PontoDireito.getInstancia().addOnibusPendente(onibus);

        assertEquals(false, onibus.completarRota());
    }

    @Test
    void deveRetornarOnibusSemPendenciaFormatura() {
        Onibus onibus = new Onibus();

        assertEquals(true, onibus.completarRota());
    }

}