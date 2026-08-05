package src.pkg;

import java.util.ArrayList;
import java.util.List;

public class SuperHeroi extends Personagem {

    private String nomeDeGuerra;
    private boolean identidadeSecreta;
    private List<String> habilidades;

    public SuperHeroi(String nome, String nomeDeGuerra, double altura, Sexo sexo) {
        super(nome, altura, sexo);
        this.nomeDeGuerra = nomeDeGuerra;
        this.habilidades = new ArrayList<>();
    }

    @Override
    public String apresentar() {
        return "Eu sou o herói " + nomeDeGuerra + "!";
    }

    public String getIdentidade() {
        if (this.identidadeSecreta) {
            return "??? (identidade protegida)";
        }
        return this.nome;
    }

    public String revelarIdentidade() {
        return this.nome;
    }

    public boolean isIdentidadeSecreta() {
        return identidadeSecreta;
    }

    public void setIdentidadeSecreta(boolean identidadeSecreta) {
        this.identidadeSecreta = identidadeSecreta;
    }

    public List<String> getHabilidades() {
        return new ArrayList<>(this.habilidades);
    }

    public void adicionarHabilidade(String habilidade) {
        this.habilidades.add(habilidade);
    }
}