package pkg;

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

    @Override
    public void agir() {
        usarHabilidade();
    }

    public void usarHabilidade() {
        if (!habilidades.isEmpty()) {
            System.out.println("Usou a habilidade: " + habilidades.get(0));
        }
    }

    public void usarHabilidade(int indice) {
        if (indice >= 0 && indice < habilidades.size()) {
            System.out.println("Usou a habilidade: " + habilidades.get(indice));
        }
    }

    public void usarHabilidade(String nome) {
        if (habilidades.contains(nome)) {
            System.out.println("Usou a habilidade: " + nome);
        }
    }
}