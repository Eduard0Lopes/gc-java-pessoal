package oldStevePOO.Materials;

public class Diamante implements Material {
    @Override
    public String getNome() {
        return "Diamante";
    }
    @Override
    public int getDurabilidade() {
        return 150;
    }
    @Override
    public int getForca() {
        return 18;
    }
}
