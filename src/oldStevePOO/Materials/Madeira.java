package oldStevePOO.Materials;

public class Madeira implements Material {
    @Override
    public String getNome() {
        return "Madeira";
    }
    @Override
    public int getDurabilidade() {
        return 50;
    }
    @Override
    public int getForca() {
        return 5;
    }
}
