package service;

import armazenamento.Armazenamento;
import models.Curso;
import models.Disciplina;
import models.Professor;

import java.util.ArrayList;
import java.util.Scanner;

public class DisciplinaService implements Acoes{

    private final Armazenamento armazenamento;

    public DisciplinaService(Armazenamento armazenamento) {
        this.armazenamento = armazenamento;
    }

    Scanner scanner = new Scanner(System.in);

    @Override
    public void cadastrar(){
        System.out.println("Digite o nome da disciplina: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o código da disciplina: ");
        int codigo = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite a carga horária da disciplina: ");
        String cargaHoraria = scanner.nextLine();

        System.out.println("Professor responsável: ");
        ArrayList<Professor> professores = armazenamento.getProfessores();

        int count = 1;
        for (Professor professor : professores) {
            System.out.println(count + ". Nome: " + professor.getNome());
            System.out.println("--------------------");
            count++;
        }
        System.out.println("Selecione o número: ");

        int indiceProfessorResponsavel = scanner.nextInt();
        Professor professorResponsavelEscolhido = professores.get(indiceProfessorResponsavel - 1);

        System.out.println("Qual o curso relacionado à disciplina: ");
        ArrayList<Curso> cursos = armazenamento.getCursos();

        count = 1;
        for (Curso curso : cursos) {
            System.out.println(count + ". Nome: " + curso.getNome());
            System.out.println("--------------------");
            count++;
        }
        System.out.println("Selecione o número: ");

        int indiceCurso = scanner.nextInt();
        Curso cursoEscolhido = cursos.get(indiceCurso - 1);

        System.out.println("Digite a quantidade de créditos da disciplina: ");
        int quantidadeCreditos = scanner.nextInt();

        Disciplina disciplina = new Disciplina(nome, codigo, cargaHoraria, professorResponsavelEscolhido, cursoEscolhido, quantidadeCreditos);
        armazenamento.adicionarDisciplina(disciplina);
        System.out.println("DISCIPLINA CADASTRADA");
        System.out.println("--------------------");
    }
    @Override
    public void remover(){
        System.out.println("Digite o código da Disciplina que deseja remover: ");
        int codigo = scanner.nextInt();

        ArrayList<Disciplina> disciplinas = armazenamento.getDisciplinas();

        Disciplina disciplinaARemover = null;

        for (Disciplina disciplina:disciplinas){
            if (codigo == disciplina.getCodigo()){
                disciplinaARemover = disciplina;
            }
        }

        if(disciplinaARemover != null){
            armazenamento.removerDisciplina(disciplinaARemover);
            System.out.println("--------------------");
            System.out.println("DISCIPLINA REMOVIDA");
            System.out.println("--------------------");
        } else{
            System.out.println("--------------------");
            System.out.println("DISCIPLINA COM CÓDIGO " + codigo + " NÃO ENCONTRADO");
            System.out.println("--------------------");
        }


    }
    @Override
    public void exibirRelatorio(){
        ArrayList<Disciplina> disciplinas = armazenamento.getDisciplinas();

        if(disciplinas == null || disciplinas.isEmpty()){
            System.out.println("--------------------");
            System.out.println("NENHUMA DISCIPLINA ENCONTRADA");
            System.out.println("--------------------");
            return;
        }

        System.out.println("RELATÓRIO DAS DISCIPLINAS: ");
        System.out.println();
        for(Disciplina disciplina:disciplinas){
            System.out.println(disciplina.toString());
            System.out.println("--------------------");
        }

    }

}
