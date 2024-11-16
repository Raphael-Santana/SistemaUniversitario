package service;

import armazenamento.Setor_db;
import models.Setor;

import java.util.ArrayList;
import java.util.Scanner;

public class SetorService implements Acoes {

    private final Setor_db armazenamento;

    public SetorService() {
        this.armazenamento = new Setor_db();
    }

    Scanner scanner = new Scanner(System.in);

    @Override
    public void cadastrar() {
        System.out.println("Digite o nome do setor: ");
        String nome = scanner.nextLine();

        System.out.println("Digite a localização do setor: ");
        String localizacao = scanner.nextLine();

        System.out.println("Digite o telefone do setor: ");
        String telefone = scanner.nextLine();

        System.out.println("Digite o nome do responsável pelo setor: ");
        String responsavel = scanner.nextLine();

        System.out.println("Digite o departamento do setor: ");
        String departamento = scanner.nextLine();

        System.out.println("Digite o horário de funcionamento do setor: ");
        String horarioFuncionamento = scanner.nextLine();

        Setor setor = new Setor(nome, localizacao, telefone, responsavel, departamento, horarioFuncionamento);
        armazenamento.adicionar(setor);
    }

    @Override
    public void remover() {
        System.out.println("Digite o nome do Setor que deseja remover: ");
        String nome = scanner.nextLine();

        ArrayList<Setor> setores = armazenamento.getSetores();

        Setor setorARemover = null;

        for (Setor setor : setores) {
            if (nome.equalsIgnoreCase(setor.getNome())) {
                setorARemover = setor;
                break;
            }
        }

        if (setorARemover != null) {
            armazenamento.remover(setorARemover);
            System.out.println("--------------------");
            System.out.println("Setor removido.");
            System.out.println("--------------------");
        } else {
            System.out.println("--------------------");
            System.out.println("Setor com nome \"" + nome + "\" não encontrado!");
            System.out.println("--------------------");
        }
    }

    @Override
    public void exibirRelatorio() {
        ArrayList<Setor> setores = armazenamento.getSetores();

        if (setores == null || setores.isEmpty()) {
            System.out.println("--------------------");
            System.out.println("Nenhum setor encontrado.");
            System.out.println("--------------------");
            return;
        }

        System.out.println("Relatório de Setores: ");
        for (Setor setor : setores) {
            System.out.println(setor.toString());
            System.out.println("--------------------");
        }
    }
}
