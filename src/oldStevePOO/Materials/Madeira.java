package oldStevePOO.Materials;

import oldStevePOO.Interfaces.Material;

public class Madeira implements Material {
    @Override
    public String getNome() {
        return "Madeira";
    }
    public int getDurabilidade() {
        return 50;
    }
    @Override
    public int getForca() {
        return 5;
    }
}
