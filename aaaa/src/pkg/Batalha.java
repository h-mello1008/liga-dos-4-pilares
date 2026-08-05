package pkg;

import java.util.ArrayList;
import java.util.List;

public class Batalha {

    private List<Personagem> participantes;

    public Batalha() {
        this.participantes = new ArrayList<>();
    }

    public void adicionar(Personagem p) {
        if (p == null) {
            throw new IllegalArgumentException("Não é possível adicionar um participante nulo.");
        }
        if (participantes.contains(p)) {
            throw new IllegalArgumentException("Participante já está na batalha.");
        }
        participantes.add(p);
    }

    public void iniciar() {
        System.out.println("=== A batalha começou! ===");
        for (Personagem p : participantes) {
            System.out.println(p);
            System.out.println(p.apresentar());
            p.agir();
            System.out.println();
        }
    }

    public List<SuperHeroi> listarHerois() {
        List<SuperHeroi> herois = new ArrayList<>();
        for (Personagem p : participantes) {
            if (p instanceof SuperHeroi) {
                herois.add((SuperHeroi) p);
            }
        }
        return herois;
    }

    public Personagem maisAlto() {
        if (participantes.isEmpty()) {
            return null;
        }
        Personagem maisAlto = participantes.get(0);
        for (Personagem p : participantes) {
            if (p.getAltura() > maisAlto.getAltura()) {
                maisAlto = p;
            }
        }
        return maisAlto;
    }

    public boolean removerDerrotado(String nomeDeGuerra) {
        for (int i = 0; i < participantes.size(); i++) {
            Personagem p = participantes.get(i);
            String identificador = (p instanceof SuperHeroi)
                    ? ((SuperHeroi) p).getNomeDeGuerra()
                    : p.getNome();
            if (identificador.equals(nomeDeGuerra)) {
                participantes.remove(i);
                return true;
            }
        }
        return false;
    }
}
