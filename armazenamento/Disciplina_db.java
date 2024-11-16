package armazenamento;

import java.util.ArrayList;
import models.Disciplina;

public class Disciplina_db {
    private final ArrayList<Disciplina> disciplinas;

    public Disciplina_db() {
        disciplinas = new ArrayList<>();
    }

    public void adicionar(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    public void remover(Disciplina disciplina) {
        disciplinas.remove(disciplina);
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }
}
