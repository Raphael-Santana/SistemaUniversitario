package service;

import armazenamento.Armazenamento;
import models.Coordenacao;
import models.Curso;
import models.Disciplina;
import models.Professor;

import java.util.ArrayList;
import java.util.Scanner;

public class CoordenacaoService implements Acoes {

    private final Armazenamento armazenamento;

    public CoordenacaoService(Armazenamento armazenamento) {
        this.armazenamento = armazenamento;
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

        System.out.println("Digite o horário de funcionamento da coordenação: ");
        String horarioFuncionamento = scanner.nextLine();

        System.out.println("Selecione o professor responsável: ");
        ArrayList<Professor> professores = armazenamento.getProfessores();

        int count = 1;
        for (Professor professor : professores) {
            System.out.println(count + ". Nome: " + professor.getNome());
            System.out.println("--------------------");
            count++;
        }
        System.out.println("Selecione o número: ");

        int indiceCoordenador= scanner.nextInt();
        Professor professorResponsavelEscolhido = professores.get(indiceCoordenador - 1);

        System.out.println("Digite os cursos coordenados: ");
        ArrayList<Curso> cursos = armazenamento.getCursos();

        // Exibição das disciplinas
        count = 1;
        for (Curso curso : cursos) {
            System.out.println(count + ". Nome: " + curso.getNome());
            System.out.println("--------------------");
            count++;
        }

        // Solicita as escolhas do usuário
        System.out.print("Selecione os números (separados por vírgula): ");
        String input = scanner.nextLine();

        // Processa as escolhas
        String[] indicesEscolhidos = input.split(",");
        ArrayList<Curso> cursosEscolhidos = new ArrayList<>();

        // Adiciona as disciplinas escolhidas ao ArrayList
        for (String indiceStr : indicesEscolhidos) {
            int indice = Integer.parseInt(indiceStr.trim()) - 1;
            cursosEscolhidos.add(cursos.get(indice));
        }

        Coordenacao coordenacao = new Coordenacao(nome, localizacao, telefone, horarioFuncionamento, professorResponsavelEscolhido, cursosEscolhidos);
        armazenamento.adicionarCoordenacao(coordenacao);
        System.out.println("COORDENAÇÃO ADICIONADA");
        System.out.println("--------------------");
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
            armazenamento.removerCoorddenacao(coordenacaoARemover);
            System.out.println("--------------------");
            System.out.println("COORDENAÇÃO REMOVIDA");
            System.out.println("--------------------");
        } else {
            System.out.println("--------------------");
            System.out.println("COORDENAÇÃO COM O NOME " + nome + " NÃO ENCONTRADA");
            System.out.println("--------------------");
        }
    }

    @Override
    public void exibirRelatorio(){
        ArrayList<Coordenacao> coordenacoes = armazenamento.getCoordenacoes();

        if (coordenacoes == null || coordenacoes.isEmpty()) {
            System.out.println("--------------------");
            System.out.println("NENHUMA COORDENAÇÃO ENCONTRADA");
            System.out.println("--------------------");
            return;
        }

        System.out.println("RELATÓRIO DAS COORDENAÇÕES ");
        System.out.println();
        for (Coordenacao coordenacao : coordenacoes) {
            System.out.println(coordenacao.toString());
            System.out.println("--------------------");
        }
    }
}
