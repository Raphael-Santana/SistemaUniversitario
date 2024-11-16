package service;

import armazenamento.Armazenamento;
import models.Disciplina;
import models.Professor;

import java.util.ArrayList;
import java.util.Scanner;

public class ProfessorService implements Acoes {

    private final Armazenamento armazenamento;

    public ProfessorService(Armazenamento armazenamento) {
        this.armazenamento = armazenamento;
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

        System.out.println("Digite a titulação: ");
        String titulacao = scanner.nextLine();

        Professor professor = new Professor(nome, endereco, email, telefone, horarioTrabalho, disciplinasEscolhidas, titulacao);
        professor.definirSalario(salario);
        armazenamento.adicionarProfessor(professor);
        System.out.println("PROFESSOR CADASTRADO");
        System.out.println("--------------------");
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
            armazenamento.removerProfessor(professorARemover);
            System.out.println("--------------------");
            System.out.println("PROFESSOR REMOVIDO");
            System.out.println("--------------------");
        } else {
            System.out.println("--------------------");
            System.out.println("PROFESSOR COM EMAIL " + email + " NÃO ENCONTRADO");
            System.out.println("--------------------");
        }
    }


    @Override
    public void exibirRelatorio() {
        ArrayList<Professor> professores = armazenamento.getProfessores();

        if (professores == null || professores.isEmpty()) {
            System.out.println("--------------------");
            System.out.println("NENHUM PROFESSOR ENCONTRADO");
            System.out.println("--------------------");
            return;
        }

        System.out.println("RELATÓRIO DOS PROFESSORES:");
        System.out.println();
        for (Professor professor : professores) {
            System.out.println(professor.toString());
            System.out.println("--------------------");
        }
    }
}
