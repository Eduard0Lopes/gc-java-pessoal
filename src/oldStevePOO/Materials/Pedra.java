package oldStevePOO.Materials;

public class Pedra implements Material {

    @Override
    public String getNome() {
        return "Pedra";
    }
    @Override
    public int getDurabilidade() {
        return 90;
    }
    @Override
    public int getForca() {
        return 11;
    }
}
