package padroesestruturais.facade;

import java.util.ArrayList;
import java.util.List;

public abstract class Ponto {

    private List<Onibus> onibusPendentes = new ArrayList<Onibus>();

    public void addOnibusPendente(Onibus onibus) {
        this.onibusPendentes.add(onibus);
    }

    public boolean verificarOnibusPendente(Onibus onibus) {
        return this.onibusPendentes.contains(onibus);
    }

}

