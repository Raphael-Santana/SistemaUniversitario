package service;

import armazenamento.Curso_db;
import models.Curso;

import java.util.ArrayList;
import java.util.Scanner;

public class CursoService implements Acoes {

    private final Curso_db armazenamento;

    public CursoService() {
        this.armazenamento = new Curso_db();
    }

    Scanner scanner = new Scanner(System.in);

    @Override
    public void cadastrar() {
        System.out.println("Digite o nome do curso: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o código do curso: ");
        int codigo = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer

        System.out.println("Digite o departamento do curso: ");
        String departamento = scanner.nextLine();

        System.out.println("Digite a duração do curso em semestres: ");
        int duracaoEmSemestres = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer

        System.out.println("Digite as disciplinas do curso (separadas por vírgula): ");
        String disciplinas = scanner.nextLine();

        System.out.println("Digite o coordenador do curso: ");
        String coordenador = scanner.nextLine();

        Curso curso = new Curso(nome, codigo, departamento, duracaoEmSemestres, disciplinas, coordenador);
        armazenamento.adicionar(curso);
    }

    @Override
    public void remover() {
        System.out.println("Digite o código do curso que deseja remover: ");
        int codigo = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer

        ArrayList<Curso> cursos = armazenamento.getCursos();

        Curso cursoARemover = null;

        for (Curso curso : cursos) {
            if (codigo == curso.getCodigo()) {
                cursoARemover = curso;
            }
        }

        if (cursoARemover != null) {
            armazenamento.remover(cursoARemover);
            System.out.println("--------------------");
            System.out.println("Curso removido.");
            System.out.println("--------------------");
        } else {
            System.out.println("--------------------");
            System.out.println("Curso com código " + codigo + " não encontrado!");
            System.out.println("--------------------");
        }
    }

    @Override
    public void exibirRelatorio() {
        ArrayList<Curso> cursos = armazenamento.getCursos();

        if (cursos == null || cursos.isEmpty()) {
            System.out.println("--------------------");
            System.out.println("Nenhum curso encontrado.");
            System.out.println("--------------------");
            return;
        }

        System.out.println("Relatório de Cursos: ");
        for (Curso curso : cursos) {
            System.out.println(curso.toString());
            System.out.println("--------------------");
        }
    }
}
