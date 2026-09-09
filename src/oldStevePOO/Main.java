package oldStevePOO;

import oldStevePOO.FabricaDePicareta.FabricaDePicareta;
import oldStevePOO.FabricaDePicareta.Fabricador;
import oldStevePOO.MineradorDeBlocos.Minerador;
import oldStevePOO.Ferramenta.Picareta;
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

        int minerados = minerador.minerar(netherite, 200);

        System.out.println("Blocos minerados: " + minerados);
        System.out.println("Durabilidade: " + netherite.getDurabilidade());
        System.out.println("Está quebrada? " + netherite.estaQuebrada());

        System.out.println("\n=== TENTANDO REPARAR ===");

        String resultadoReparo = netherite.reparar(0);

        System.out.println(resultadoReparo);

        System.out.println("\n=== ESTADO FINAL ===");

        System.out.println(
                netherite.getNome()
                        + " | Durabilidade: " + netherite.getDurabilidade()
                        + " | Quebrada: " + netherite.estaQuebrada()
        );
    }
}
