package src.pkg;

import java.util.ArrayList;
import java.util.List;

public class SuperHeroi {
    private String nome;
    private Sexo sexo;
    private double altura;
    private boolean identidadeSecreta;
    private List<String> habilidades;

    public SuperHeroi(String nome, double altura) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser vazio.");
        }
        if (altura < 0.5 || altura > 3.0) {
            throw new IllegalArgumentException("Altura deve estar entre 0.5 e 3.0.");
        }
        this.nome = nome;
        this.altura = altura;
        this.habilidades = new ArrayList<>();
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

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public double getAltura() {
        return altura;
    }

    public List<String> getHabilidades() {
        return new ArrayList<>(this.habilidades);
    }

    public void adicionarHabilidade(String habilidade) {
        this.habilidades.add(habilidade);
    }

    public void mostrar() {
        System.out.println(getIdentidade() + " - " + sexo + " - " + altura);
        for (String habilidade : habilidades) {
            System.out.println("- " + habilidade);
        }
    }
}