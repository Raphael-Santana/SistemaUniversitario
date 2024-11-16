package service;

import armazenamento.Armazenamento;
import models.Aluno;
import models.Disciplina;

import java.util.ArrayList;
import java.util.Scanner;

public class AlunoService implements Acoes {

    private final Armazenamento armazenamento;

    // Construtor
    public AlunoService(Armazenamento armazenamento) {
        this.armazenamento = armazenamento;
    }

    Scanner scanner = new Scanner(System.in);

    @Override
    public void cadastrar() {
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

        System.out.println("Escolha as disciplinas: ");

        ArrayList<Disciplina> disciplinas = armazenamento.getDisciplinas();

        // Exibição das disciplinas
        int count = 1;
        for (Disciplina disciplina : disciplinas) {
            System.out.println(count + ". Nome: " + disciplina.getNome());
            System.out.println("--------------------");
            count++;
        }

        // Solicita as escolhas do usuário
        System.out.print("Selecione os números (separados por vírgula): ");
        String input = scanner.nextLine();

        // Processa as escolhas
        String[] indicesEscolhidos = input.split(",");
        ArrayList<Disciplina> disciplinasEscolhidas = new ArrayList<>();

        // Adiciona as disciplinas escolhidas ao ArrayList
        for (String indiceStr : indicesEscolhidos) {
            int indice = Integer.parseInt(indiceStr.trim()) - 1;
            disciplinasEscolhidas.add(disciplinas.get(indice));
        }

        Aluno aluno = new Aluno(nome, endereco, email, telefone, matricula, periodo, curso, disciplinasEscolhidas);
        armazenamento.adicionarAluno(aluno);
        System.out.println("ALUNO CADASTRADO!");
        System.out.println("--------------------");
    }

    @Override
    public void remover() {
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
            System.out.println("ALUNO REMOVIDO");
            System.out.println("--------------------");
        } else {
            System.out.println("--------------------");
            System.out.println("ALUNO COM MATRÍCULA " + matricula + " NÃO ENCONTRADO");
            System.out.println("--------------------");
        }
    }

    @Override
    public void exibirRelatorio() {
        ArrayList<Aluno> alunos = armazenamento.getAlunos();

        if (alunos == null || alunos.isEmpty()) {
            System.out.println("--------------------");
            System.out.println("NENHUM ALUNO ENCONTRADO");
            System.out.println("--------------------");
            return;
        }

        System.out.println("RELATÓRIO DOS ALUNOS");
        System.out.println();
        for (Aluno aluno : alunos) {
            System.out.println(aluno.toString());
            System.out.println("--------------------");
        }
    }
}
