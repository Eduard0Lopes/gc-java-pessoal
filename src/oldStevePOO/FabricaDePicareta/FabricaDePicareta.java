package oldStevePOO.FabricaDePicareta;

import oldStevePOO.Ferramenta.Picareta;
import oldStevePOO.Materials.Material;

public class FabricaDePicareta implements Fabricador {
    public Picareta fabricar(Material material) {
        return new Picareta(material);
    }
}

