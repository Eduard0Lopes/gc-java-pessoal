package oldStevePOO.Interfaces;

public interface Ferramenta {
    String getNome();
    int getDurabilidade();
    int getForca();

    int usar();
    String reparar(int quantidade);

    boolean estaQuebrada();
}

