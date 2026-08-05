package src.pkg;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        SuperHeroi heroi = new SuperHeroi("Batman", 1.88);
        heroi.setIdentidadeSecreta(true);
        heroi.adicionarHabilidade("Artes Marciais");

        System.out.println("Identidade protegida: " + heroi.getIdentidade());
        System.out.println("Identidade revelada: " + heroi.revelarIdentidade());

        List<String> habilidadesExternas = heroi.getHabilidades();
        habilidadesExternas.add("Voar");
        habilidadesExternas.clear();

        System.out.println("\nLista original no objeto após alteração externa:");
        for (String h : heroi.getHabilidades()) {
            System.out.println("- " + h);
        }
    }
}