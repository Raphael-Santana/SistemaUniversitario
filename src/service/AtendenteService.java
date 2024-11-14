package service;

import armazenamento.Atendente_db;
import models.Atendente;

import java.util.ArrayList;
import java.util.Scanner;

public class AtendenteService implements Acoes {

    private final Atendente_db armazenamento;

    // Construtor
    public AtendenteService() {
        this.armazenamento = new Atendente_db();
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

        System.out.println("Digite a responsabilidade: ");
        String responsabilidade = scanner.nextLine();

        Atendente atendente = new Atendente(nome, endereco, email, telefone, horarioTrabalho, responsabilidade);
        atendente.definirSalario(salario);
        armazenamento.adicionar(atendente);
    }

    @Override
    public void remover() {
        System.out.println("Digite o e-mail do atendente: ");
        String email = scanner.nextLine();

        // Pega a lista de atendentes armazenados
        ArrayList<Atendente> atendentes = armazenamento.getAtendentes();

        Atendente atendenteARemover = null;

        for (Atendente atendente : atendentes) {
            if (atendente.getEmail().equals(email)) {
                atendenteARemover = atendente;
                break;
            }
        }

        // Se o atendente existir, remove-o
        if (atendenteARemover != null) {
            armazenamento.remover(atendenteARemover);
            System.out.println("--------------------");
            System.out.println("Atendente removido.");
            System.out.println("--------------------");
        } else {
            System.out.println("--------------------");
            System.out.println("Atendente com e-mail " + email + " não encontrado.");
            System.out.println("--------------------");
        }
    }

    @Override
    public void exibirRelatorio() {
        ArrayList<Atendente> atendentes = armazenamento.getAtendentes();

        if (atendentes == null || atendentes.isEmpty()) {
            System.out.println("--------------------");
            System.out.println("Nenhum atendente encontrado.");
            System.out.println("--------------------");
            return;
        }

        System.out.println("Relatório dos atendentes:");

        for (Atendente atendente : atendentes) {
            System.out.println(atendente.toString());
            System.out.println("--------------------");
        }
    }
}
