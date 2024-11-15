package service;

import armazenamento.Disciplina_db;
import models.Disciplina;

import java.util.ArrayList;
import java.util.Scanner;

public class DisciplinaService implements Acoes{

    private final Disciplina_db armazenamento;

    public DisciplinaService(){
        this.armazenamento = new Disciplina_db();
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

        System.out.println("Digite o nome do professor responsável: ");
        String professorResponsavel = scanner.nextLine();

        System.out.println("Digite o curso relacionado à disciplina: ");
        String cursoRelacionado = scanner.nextLine();

        System.out.println("Digite a quantidade de créditos da disciplina: ");
        int quantidadeCreditos = scanner.nextInt();

        Disciplina disciplina = new Disciplina(nome, codigo, cargaHoraria, professorResponsavel, cursoRelacionado, quantidadeCreditos);
        armazenamento.adicionar(disciplina);
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
            armazenamento.remover(disciplinaARemover);
            System.out.println("--------------------");
            System.out.println("Disciplina removida.");
            System.out.println("--------------------");
        } else{
            System.out.println("--------------------");
            System.out.println("Disciplina com código " + codigo + " não encontrado!");
            System.out.println("--------------------");
        }


    }
    @Override
    public void exibirRelatorio(){
        ArrayList<Disciplina> disciplinas = armazenamento.getDisciplinas();

        if(disciplinas == null || disciplinas.isEmpty()){
            System.out.println("--------------------");
            System.out.println("Nenhuma disciplina encontrada.");
            System.out.println("--------------------");
            return;
        }

        System.out.println("Relatório de Disciplinas: ");

        for(Disciplina disciplina:disciplinas){
            System.out.println(disciplina.toString());
            System.out.println("--------------------");
        }

    }

}
