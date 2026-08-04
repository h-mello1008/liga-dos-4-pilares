// NÃO ALTERE ANTES DE LER OS PASSOS
public class SuperHeroi {
    public String nome;
    public int sexo;                // 1=Mulher, 2=Homem, 3=Outro, 4=Prefiro não dizer
    public double altura;
    public boolean identidadeSecreta;
    public String[] habilidades;

    public void mostrar() {
        System.out.println(nome + " - " + sexo + " - " + altura);
        for (int i = 0; i < habilidades.length; i++) {
            System.out.println(habilidades[i]);
        }
    }
}