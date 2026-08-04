public class Main {
    public static void main(String[] args) {
        SuperHeroi h = new SuperHeroi();
        h.nome = "Lisiane Reips";
        h.sexo = 1;
        h.altura = 1.75;
        h.identidadeSecreta = true;
        h.habilidades = new String[]{"super força", "visão de raio-x", "voar",
                "super velocidade", "sopro congelante"};
        h.mostrar();

        // O vilão consegue fazer isto. Por quê?
        h.altura = -300;
        h.nome = "";
        h.mostrar();
    }
}