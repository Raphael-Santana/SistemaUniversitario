package local_db;

import java.util.ArrayList;
import models.Aluno;

public class Armazenamento {

    private final ArrayList<Aluno> alunos;

    // Construtor
    public Armazenamento() {
        alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void removerAluno(int matricula) {
        Aluno alunoARemover = null;

        for (Aluno aluno : alunos) {
            if (aluno.getMatricula() == matricula) {
                alunoARemover = aluno;
                break;
            }
        }

        if (alunoARemover != null) {
            alunos.remove(alunoARemover);
            System.out.println("--------------------");
            System.out.println("Aluno removido.");
            System.out.println("--------------------");
        } else {
            System.out.println("--------------------");
            System.out.println("Aluno com matrícula " + matricula + " não encontrado.");
            System.out.println("--------------------");
        }
    }

    public ArrayList<Aluno> listarAlunos() {
        return alunos;
    }
}
