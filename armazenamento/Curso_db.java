package armazenamento;

import java.util.ArrayList;
import models.Curso;

public class Curso_db {
    private final ArrayList<Curso> cursos;

    public Curso_db() {
        cursos = new ArrayList<>();
    }

    public void adicionar(Curso curso) {
        cursos.add(curso);
    }

    public void remover(Curso curso) {
        cursos.remove(curso);
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }
}