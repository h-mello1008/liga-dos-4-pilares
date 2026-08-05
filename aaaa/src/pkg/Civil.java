package src.pkg;

public class Civil extends Personagem {
    private String profissao;

    public Civil(String nome, double altura, Sexo sexo, String profissao) {
        super(nome, altura, sexo);
        this.profissao = profissao;
    }

    @Override
    public String apresentar() {
        return "Olá, meu nome é " + nome + " e eu trabalho como " + profissao + ".";
    }
}