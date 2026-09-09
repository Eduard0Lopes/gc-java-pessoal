package oldStevePOO;

import oldStevePOO.FabricaDePicareta.FabricaDePicareta;
import oldStevePOO.Interfaces.Fabricador;
import oldStevePOO.Interfaces.Minerador;
import oldStevePOO.Itens.Picareta;
import oldStevePOO.Materials.Diamante;
import oldStevePOO.Materials.Ferro;
import oldStevePOO.Materials.Madeira;
import oldStevePOO.Materials.Netherite;
import oldStevePOO.Materials.Ouro;
import oldStevePOO.Materials.Pedra;
import oldStevePOO.MineradorDeBlocos.MineradorDeBlocos;

public class Main {

    public static void main(String[] args) {

        Fabricador fabricador = new FabricaDePicareta();
        Minerador minerador = new MineradorDeBlocos();

        Picareta madeira = fabricador.fabricar(new Madeira());
        Picareta pedra = fabricador.fabricar(new Pedra());
        Picareta ferro = fabricador.fabricar(new Ferro());
        Picareta ouro = fabricador.fabricar(new Ouro());
        Picareta diamante = fabricador.fabricar(new Diamante());
        Picareta netherite = fabricador.fabricar(new Netherite());

        Picareta[] picaretas = {madeira, pedra, ferro, ouro, diamante, netherite};

        System.out.println("=== PICARETAS FABRICADAS ===");

        for (Picareta p : picaretas) {
            System.out.println(p.getNome() + " | Durabilidade: " + p.getDurabilidade() + " | Força: " + p.getForca());
        }

        System.out.println("\n=== MINERANDO ===");

        int minerados = minerador.minerar(ferro, 50);

        System.out.println("Blocos minerados: " + minerados);
        System.out.println("Durabilidade: " + ferro.getDurabilidade());
        System.out.println("Está quebrada? " + ferro.estaQuebrada());

        System.out.println("\n=== TENTANDO REPARAR ===");

        String resultadoReparo = ferro.reparar(5);

        System.out.println(resultadoReparo);

        System.out.println("\n=== ESTADO FINAL ===");

        System.out.println(
                ferro.getNome()
                        + " | Durabilidade: " + ferro.getDurabilidade()
                        + " | Quebrada: " + ferro.estaQuebrada()
        );
    }
}
