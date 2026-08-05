package pkg;

public class Vilao extends Personagem {
    private int nivelDeAmeaca;

    public Vilao(String nome, double altura, Sexo sexo, int nivelDeAmeaca) {
        super(nome, altura, sexo);
        if (nivelDeAmeaca < 1 || nivelDeAmeaca > 10) {
            throw new IllegalArgumentException("O nível de ameaça deve ser de 1 a 10.");
        }
        this.nivelDeAmeaca = nivelDeAmeaca;
    }

    public int getNivelDeAmeaca() {
        return nivelDeAmeaca;
    }

    @Override
    public String apresentar() {
        return "Eu sou " + getNome() + ", minha ameaça é nível " + nivelDeAmeaca + "!";
    }

    @Override
    public void agir() {
        System.out.println("Atacando com força nível " + nivelDeAmeaca);
    }
}