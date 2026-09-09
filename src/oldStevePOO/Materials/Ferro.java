package oldStevePOO.Materials;

import oldStevePOO.Interfaces.Material;

public class Ferro implements Material {
    @Override
    public String getNome() {
        return "Ferro";
    }
    @Override
    public int getDurabilidade() {
        return 100;
    }
    @Override
    public int getForca() {
        return 12;
    }
}
