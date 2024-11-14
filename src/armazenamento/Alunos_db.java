package armazenamento;

import java.util.ArrayList;
import models.Aluno;

public class Alunos_db {

    private final ArrayList<Aluno> alunos;

    // Construtor
    public Alunos_db() {
        alunos = new ArrayList<>();
    }

    // Métodos
    public void adicionar(Aluno aluno) {
        alunos.add(aluno);
    }

    public void remover(Aluno aluno) {
        alunos.remove(aluno);
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }
}
