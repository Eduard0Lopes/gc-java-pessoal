package oldStevePOO.Itens;

import oldStevePOO.Interfaces.Ferramenta;
import oldStevePOO.Interfaces.Material;

public class Picareta implements Ferramenta {

    private Material material;
    private int durabilidade;

    public Picareta(Material material) {
        this.material = material;
        this.durabilidade = material.getDurabilidade();
    }

    public String getNome() {
        return "Picareta de " + material.getNome();
    }

    public int getDurabilidade() {
        return durabilidade;
    }

    public int getForca() {
        return material.getForca();
    }

    public int usar() {

        if (estaQuebrada()) {
            return 0;
        }

        durabilidade--;

        if (estaQuebrada()) {
            System.out.println("A " + getNome() + " quebrou!");
        }

        return durabilidade;
    }

    public String reparar(int quantidade) {

        if (estaQuebrada()) {
            return "A " + getNome() + " está quebrada e não pode ser reparada!";
        }

        if (quantidade <= 0) {
            return "Quantidade de reparo inválida!";
        }

        durabilidade += quantidade;

        if (durabilidade > material.getDurabilidade()) {
            durabilidade = material.getDurabilidade();
        }

        return "Durabilidade após reparo: " + durabilidade;
    }

    public boolean estaQuebrada() {
        return durabilidade <= 0;
    }
}
