package src.pkg;

public class Vilao extends Personagem {
    private int nivelDeAmeaca;

    public Vilao(String nome, double altura, Sexo sexo, int nivelDeAmeaca) {
        super(nome, altura, sexo);
        if (nivelDeAmeaca < 1 || nivelDeAmeaca > 10) {
            throw new IllegalArgumentException("O nível de ameaça deve ser de 1 a 10.");
        }
        this.nivelDeAmeaca = nivelDeAmeaca;
    }

    @Override
    public String apresentar() {
        return "Eu sou " + nome + ", minha ameaça é nível " + nivelDeAmeaca + "!";
    }
}