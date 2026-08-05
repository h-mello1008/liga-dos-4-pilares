package pkg;

public abstract class Personagem {

    private String nome;
    private double altura;
    private Sexo sexo;

    public Personagem(String nome, double altura, Sexo sexo) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome não pode ser vazio.");
        }
        if (altura < 0.5 || altura > 3.0) {
            throw new IllegalArgumentException("Altura deve estar entre 0.5 e 3.0.");
        }
        this.nome = nome;
        this.altura = altura;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public double getAltura() {
        return altura;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public abstract String apresentar();

    public abstract void agir();

    @Override
    public String toString() {
        return "Nome: " + nome + ", Altura: " + altura + ", Sexo: " + sexo;
    }
}