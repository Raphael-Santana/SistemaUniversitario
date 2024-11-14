package armazenamento;

import java.util.ArrayList;

import models.Atendente;

public class Atendente_db {
    private final ArrayList<Atendente> atendentes;

    // Construtor
    public Atendente_db() {
        atendentes = new ArrayList<>();
    }

    // Métodos
    public void adicionar(Atendente atendente) {
        atendentes.add(atendente);
    }

    public void remover(Atendente atendente) {
        atendentes.remove(atendente);
    }

    public ArrayList<Atendente> getAtendentes() {
        return atendentes;
    }
}
