package armazenamento;

import java.util.ArrayList;

import models.Professor;

public class Professor_db {
    private final ArrayList<Professor> professores;

    // Construtor
    public Professor_db() {
        professores = new ArrayList<>();
    }

    // Métodos
    public void adicionar(Professor professor) {
        professores.add(professor);
    }

    public void remover(Professor professor) {
        professores.remove(professor);
    }

    public ArrayList<Professor> getProfessores() {
        return professores;
    }
}
