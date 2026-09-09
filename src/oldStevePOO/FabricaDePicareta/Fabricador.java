package oldStevePOO.FabricaDePicareta;

import oldStevePOO.Materials.Material;
import oldStevePOO.Ferramenta.Picareta;

public interface Fabricador {
    Picareta fabricar(Material material);
}

