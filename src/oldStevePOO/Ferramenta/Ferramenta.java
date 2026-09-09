package oldStevePOO.Ferramenta;

public interface Ferramenta {
    String getNome();
    int getDurabilidade();
    int getForca();
    void usar();
    String reparar(int quantidade);

    boolean estaQuebrada();
}

