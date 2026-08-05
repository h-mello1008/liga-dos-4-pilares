package pkg;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SuperHeroi heroi = new SuperHeroi("Bruce Wayne", "Batman", 1.88, Sexo.HOMEM);

        heroi.setIdentidadeSecreta(true);
        heroi.adicionarHabilidade("Artes Marciais");

        System.out.println("Apresentação: " + heroi.apresentar());
        System.out.println("Identidade protegida: " + heroi.getIdentidade());
        System.out.println("Identidade revelada (forçada): " + heroi.revelarIdentidade());

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

        SuperHeroi mulherMaravilha = new SuperHeroi("Diana Prince", "Mulher-Maravilha", 1.83, Sexo.MULHER);
        mulherMaravilha.adicionarHabilidade("Laço da Verdade");

        Vilao lex = new Vilao("Lex Luthor", 1.80, Sexo.HOMEM, 7);
        Civil enfermeira = new Civil("Alice Pemberton", 1.65, Sexo.MULHER, "Enfermeira");

        Batalha batalha = new Batalha();
        batalha.adicionar(heroi);
        batalha.adicionar(civil);
        batalha.adicionar(vilao);
        batalha.adicionar(mulherMaravilha);
        batalha.adicionar(lex);
        batalha.adicionar(enfermeira);

        batalha.iniciar();

        System.out.println("--- Heróis na batalha ---");
        for (SuperHeroi h : batalha.listarHerois()) {
            System.out.println("- " + h.getNomeDeGuerra());
        }

        System.out.println("\n--- Participante mais alto ---");
        System.out.println(batalha.maisAlto().getNome());

        System.out.println("\n--- Removendo o Coringa ---");
        boolean removido = batalha.removerDerrotado("Coringa");
        System.out.println("Removido? " + removido);
        System.out.println("Heróis após remoção: " + batalha.listarHerois().size());
    }
}