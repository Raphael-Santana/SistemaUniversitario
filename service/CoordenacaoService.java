package service;

import armazenamento.Coordenacao_db;
import models.Coordenacao;

import java.util.ArrayList;
import java.util.Scanner;

public class CoordenacaoService implements Acoes {

    private final Coordenacao_db armazenamento;

    public CoordenacaoService(){
        this.armazenamento = new Coordenacao_db();
    }

    Scanner scanner = new Scanner(System.in);

    @Override
    public void cadastrar(){
        System.out.println("Digite o nome da coordenação: ");
        String nome = scanner.nextLine();

        System.out.println("Digite a localização da coordenação: ");
        String localizacao = scanner.nextLine();

        System.out.println("Digite o telefone da coordenação: ");
        String telefone = scanner.nextLine();

        System.out.println("Digite o nome do responsável pela coordenação: ");
        String responsavel = scanner.nextLine();

        System.out.println("Digite o departamento da coordenação: ");
        String departamento = scanner.nextLine();

        System.out.println("Digite o horário de funcionamento da coordenação: ");
        String horarioFuncionamento = scanner.nextLine();

        System.out.println("Digite o nome do professor responsável: ");
        String professorResponsavel = scanner.nextLine();

        System.out.println("Digite os cursos coordenados: ");
        String cursosCoordenados = scanner.nextLine();

        Coordenacao coordenacao = new Coordenacao(nome, localizacao, telefone, responsavel, departamento, horarioFuncionamento, professorResponsavel, cursosCoordenados);
        armazenamento.adicionar(coordenacao);
    }

    @Override
    public void remover(){
        System.out.println("Digite o nome da coordenação que deseja remover: ");
        String nome = scanner.nextLine();

        ArrayList<Coordenacao> coordenacoes = armazenamento.getCoordenacoes();

        Coordenacao coordenacaoARemover = null;

        for (Coordenacao coordenacao : coordenacoes) {
            if (nome.equals(coordenacao.getNome())) {
                coordenacaoARemover = coordenacao;
            }
        }

        if (coordenacaoARemover != null) {
            armazenamento.remover(coordenacaoARemover);
            System.out.println("--------------------");
            System.out.println("Coordenação removida.");
            System.out.println("--------------------");
        } else {
            System.out.println("--------------------");
            System.out.println("Coordenação com o nome " + nome + " não encontrada!");
            System.out.println("--------------------");
        }
    }

    @Override
    public void exibirRelatorio(){
        ArrayList<Coordenacao> coordenacoes = armazenamento.getCoordenacoes();

        if (coordenacoes == null || coordenacoes.isEmpty()) {
            System.out.println("--------------------");
            System.out.println("Nenhuma coordenação encontrada.");
            System.out.println("--------------------");
            return;
        }

        System.out.println("Relatório de Coordenações: ");

        for (Coordenacao coordenacao : coordenacoes) {
            System.out.println(coordenacao.toString());
            System.out.println("--------------------");
        }
    }
}
