package oldStevePOO.Materials;

import oldStevePOO.Interfaces.Material;

public class Netherite implements Material {
    @Override
    public String getNome() {
        return "netherite";
    }

    public int getDurabilidade() {
        return 200;
    }

    @Override
    public int getForca() {
        return 20;
    }
}
