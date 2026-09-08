package oldStevePOO.MineradorDeBlocos;

import oldStevePOO.Interfaces.Ferramenta;
import oldStevePOO.Interfaces.Minerador;

public class MineradorDeBlocos implements Minerador {

    public int minerar(Ferramenta ferramenta, int blocos) {
        int minerados = 0;

        for (int i = 0; i < blocos; i++) {

            if (ferramenta.estaQuebrada()) {
                break;
            }

            ferramenta.usar();
            minerados++;
        }

        return minerados;
    }
}

