package service;

import local_db.Armazenamento;
import models.Aluno;

import java.util.ArrayList;
import java.util.Scanner;

public class AlunoService {

    private final Armazenamento armazenamento;

    // Construtor
    public AlunoService(Armazenamento armazenamento) {
        this.armazenamento = armazenamento;
    }

    Scanner scanner = new Scanner(System.in);

    public void cadastrarAluno() {
        System.out.println("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o endereço do aluno: ");
        String endereco = scanner.nextLine();

        System.out.println("Digite o e-mail do aluno: ");
        String email = scanner.nextLine();

        System.out.println("Digite o telefone do aluno: ");
        int telefone = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Digite a matrícula do aluno: ");
        int matricula = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Digite o período do aluno: ");
        int periodo = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Digite o curso do aluno: ");
        String curso = scanner.nextLine();

        Aluno aluno = new Aluno(nome, endereco, email, telefone, matricula, periodo, curso);
        armazenamento.adicionarAluno(aluno);
    }

    public void removerAluno() {
        System.out.println("Digite o nome da matrícula do aluno: ");
        int matricula = scanner.nextInt();

        // Pega a lista de alunos armazenados
        ArrayList<Aluno> alunos = armazenamento.getAlunos();

        Aluno alunoARemover = null;

        for (Aluno aluno : alunos) {
            if (aluno.getMatricula() == matricula) {
                alunoARemover = aluno;
                break;
            }
        }

        // Se caso existir o aluno, remove ele
        if (alunoARemover != null) {
            armazenamento.removerAluno(alunoARemover);
            System.out.println("--------------------");
            System.out.println("Aluno removido.");
            System.out.println("--------------------");
        } else {
            System.out.println("--------------------");
            System.out.println("Aluno com matrícula " + matricula + " não encontrado.");
            System.out.println("--------------------");
        }
    }

    public void exibirRelatorioAluno() {
        ArrayList<Aluno> alunos = armazenamento.getAlunos();

        if (alunos == null || alunos.isEmpty()) {
            System.out.println("--------------------");
            System.out.println("Nenhum aluno encontrado.");
            System.out.println("--------------------");
            return;
        }

        System.out.println("Relatório dos Alunos:");

        for (Aluno aluno : alunos) {
            System.out.println(aluno.toString());
            System.out.println("--------------------");
        }
    }
}
