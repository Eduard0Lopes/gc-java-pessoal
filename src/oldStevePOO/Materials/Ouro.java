package oldStevePOO.Materials;

public class Ouro implements Material {

    @Override
    public String getNome() {
        return "Ouro";
    }
    @Override
    public int getDurabilidade() {
        return 30;
    }
    @Override
    public int getForca() {
        return 10;
    }
}
