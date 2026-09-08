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

        System.out.println("=== PICARETAS FABRICADAS ===");

        System.out.println(
                madeira.getNome()
                        + " | Durabilidade: " + madeira.getDurabilidade()
                        + " | Força: " + madeira.getForca()
        );

        System.out.println(
                pedra.getNome()
                        + " | Durabilidade: " + pedra.getDurabilidade()
                        + " | Força: " + pedra.getForca()
        );

        System.out.println(
                ferro.getNome()
                        + " | Durabilidade: " + ferro.getDurabilidade()
                        + " | Força: " + ferro.getForca()
        );

        System.out.println(
                ouro.getNome()
                        + " | Durabilidade: " + ouro.getDurabilidade()
                        + " | Força: " + ouro.getForca()
        );

        System.out.println(
                diamante.getNome()
                        + " | Durabilidade: " + diamante.getDurabilidade()
                        + " | Força: " + diamante.getForca()
        );

        System.out.println(
                netherite.getNome()
                        + " | Durabilidade: " + netherite.getDurabilidade()
                        + " | Força: " + netherite.getForca()
        );

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
