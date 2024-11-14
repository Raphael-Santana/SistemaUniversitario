package local_db;

import java.util.ArrayList;
import models.Aluno;

public class Armazenamento {

    private final ArrayList<Aluno> alunos;

    // Construtor
    public Armazenamento() {
        alunos = new ArrayList<>();
    }

    // Métodos
    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void removerAluno(Aluno aluno) {
        alunos.remove(aluno);
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }
}
