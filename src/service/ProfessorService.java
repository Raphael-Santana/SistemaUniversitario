package service;

import armazenamento.Professor_db;
import models.Professor;

import java.util.ArrayList;
import java.util.Scanner;

public class ProfessorService implements Acoes {

    private final Professor_db armazenamento;

    public ProfessorService() {
        this.armazenamento = new Professor_db();
    }

    Scanner scanner = new Scanner(System.in);

    @Override
    public void cadastrar() {
        System.out.println("Digite o nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o endereço: ");
        String endereco = scanner.nextLine();

        System.out.println("Digite o e-mail: ");
        String email = scanner.nextLine();

        System.out.println("Digite o telefone: ");
        int telefone = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Digite as horas de trabalho mensais: ");
        int horarioTrabalho = scanner.nextInt();

        System.out.println("Digite o salario: ");
        double salario = scanner.nextDouble();

        scanner.nextLine();

        System.out.println("Digite a titulação: ");
        String titulacao = scanner.nextLine();

        Professor professor = new Professor(nome, endereco, email, telefone, horarioTrabalho, titulacao);
        professor.definirSalario(salario);
        armazenamento.adicionar(professor);
    }


    @Override
    public void remover() {
        System.out.println("Digite o e-mail do professor: ");
        String email = scanner.nextLine();

        // Pega a lista de professores armazenados
        ArrayList<Professor> professores = armazenamento.getProfessores();

        Professor professorARemover = null;

        for (Professor professor : professores) {
            if (professor.getEmail().equals(email)) {
                professorARemover = professor;
                break;
            }
        }

        // Se o professor existir, remove-o
        if (professorARemover != null) {
            armazenamento.remover(professorARemover);
            System.out.println("--------------------");
            System.out.println("Professor removido.");
            System.out.println("--------------------");
        } else {
            System.out.println("--------------------");
            System.out.println("Professor com e-mail " + email + " não encontrado.");
            System.out.println("--------------------");
        }
    }


    @Override
    public void exibirRelatorio() {
        ArrayList<Professor> professores = armazenamento.getProfessores();

        if (professores == null || professores.isEmpty()) {
            System.out.println("--------------------");
            System.out.println("Nenhum professor encontrado.");
            System.out.println("--------------------");
            return;
        }

        System.out.println("Relatório dos Alunos:");

        for (Professor professor : professores) {
            System.out.println(professor.toString());
            System.out.println("--------------------");
        }
    }
}
