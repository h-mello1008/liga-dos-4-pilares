package pkg;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // CORREÇÃO: Passando todos os 4 argumentos exigidos pelo construtor de SuperHeroi
        SuperHeroi heroi = new SuperHeroi("Bruce Wayne", "Batman", 1.88, Sexo.HOMEM);

        heroi.setIdentidadeSecreta(true);
        heroi.adicionarHabilidade("Artes Marciais");

        System.out.println("Apresentação: " + heroi.apresentar());
        System.out.println("Identidade protegida: " + heroi.getIdentidade());
        System.out.println("Identidade revelada (forçada): " + heroi.revelarIdentidade());

        // Testando a cópia defensiva de habilidades
        List<String> habilidadesExternas = heroi.getHabilidades();
        habilidadesExternas.add("Voar");
        habilidadesExternas.clear();

        System.out.println("\nLista original no objeto após tentativa de alteração externa:");
        for (String h : heroi.getHabilidades()) {
            System.out.println("- " + h);
        }

        System.out.println();

        Civil civil = new Civil("James Gordon", 1.78, Sexo.HOMEM, "Comissário de Polícia");
        Vilao vilao = new Vilao("Coringa", 1.85, Sexo.HOMEM, 9);

        List<Personagem> personagens = new ArrayList<>();
        personagens.add(heroi);
        personagens.add(civil);
        personagens.add(vilao);

        for (Personagem p : personagens) {
            System.out.println(p.toString());
            System.out.println(p.apresentar());
            p.agir();
            System.out.println();
        }
    }
}