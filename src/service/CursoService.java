package service;

import armazenamento.Armazenamento;
import models.Coordenacao;
import models.Curso;
import models.Disciplina;

import java.util.ArrayList;
import java.util.Scanner;

public class CursoService implements Acoes {

    private final Armazenamento armazenamento;

    public CursoService(Armazenamento armazenamento) {
        this.armazenamento = armazenamento;
    }

    Scanner scanner = new Scanner(System.in);

    @Override
    public void cadastrar() {
        System.out.println("Digite o nome do curso: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o código do curso: ");
        int codigo = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o departamento do curso: ");
        String departamento = scanner.nextLine();

        System.out.println("Digite a duração do curso em semestres: ");
        int duracaoEmSemestres = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Escolha as disciplinas: ");

        ArrayList<Disciplina> disciplinas = armazenamento.getDisciplinas();

        int count = 1;
        for (Disciplina disciplina : disciplinas) {
            System.out.println(count + ". Nome: " + disciplina.getNome());
            System.out.println("--------------------");
            count++;
        }

        System.out.print("Selecione os números (separados por vírgula): ");
        String input = scanner.nextLine();

        String[] indicesEscolhidos = input.split(",");
        ArrayList<Disciplina> disciplinasEscolhidas = new ArrayList<>();

        for (String indiceStr : indicesEscolhidos) {
            int indice = Integer.parseInt(indiceStr.trim()) - 1;
            disciplinasEscolhidas.add(disciplinas.get(indice));
        }
        System.out.println("--------------------");
        System.out.println("Digite o coordenador do curso: ");
        ArrayList<Coordenacao> coordenacaos = armazenamento.getCoordenacoes();

        count = 1;
        for (Coordenacao coordenacao : coordenacaos) {
            System.out.println(count + ". Nome: " + coordenacao.getProfessorResponsavel().getNome());
            System.out.println("--------------------");
            count++;
        }
        System.out.println("Selecione o número: ");

        int indiceCoordenador= scanner.nextInt();
        Coordenacao coordenadorEscolhido = coordenacaos.get(indiceCoordenador - 1);

        Curso curso = new Curso(nome, codigo, departamento, duracaoEmSemestres, disciplinasEscolhidas, coordenadorEscolhido);
        armazenamento.adicionarCurso(curso);
        System.out.println("CURSO CADASTRADO!");
        System.out.println("--------------------");
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
            armazenamento.removerCurso(cursoARemover);
            System.out.println("--------------------");
            System.out.println("CURSO REMOVIDO");
            System.out.println("--------------------");
        } else {
            System.out.println("--------------------");
            System.out.println("CURSO COM CÓDIGO " + codigo + " NÃO ENCONTRADO!");
            System.out.println("--------------------");
        }
    }

    @Override
    public void exibirRelatorio() {
        ArrayList<Curso> cursos = armazenamento.getCursos();

        if (cursos == null || cursos.isEmpty()) {
            System.out.println("--------------------");
            System.out.println("NENHUM CURSO ENCONTRADO.");
            System.out.println("--------------------");
            return;
        }

        System.out.println("RELATÓRIO DOS CURSOS: ");
        System.out.println();
        for (Curso curso : cursos) {
            System.out.println(curso.toString());
            System.out.println("--------------------");
        }
    }
}
