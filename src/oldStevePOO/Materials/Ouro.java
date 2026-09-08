package oldStevePOO.Materials;

import oldStevePOO.Interfaces.Material;

public class Ouro implements Material {

    @Override
    public String getNome() {
        return "Ouro";
    }
    public int getDurabilidade() {
        return 30;
    }

    @Override
    public int getForca() {
        return 10;
    }
}
