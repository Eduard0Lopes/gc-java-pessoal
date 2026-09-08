package oldStevePOO.FabricaDePicareta;

import oldStevePOO.Interfaces.Fabricador;
import oldStevePOO.Itens.Picareta;
import oldStevePOO.Interfaces.Material;

public class FabricaDePicareta implements Fabricador {
    public Picareta fabricar(Material material) {
        return new Picareta(material);
    }
}

