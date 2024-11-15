package service;

import armazenamento.Secretaria_db;
import models.Secretaria;

import java.util.ArrayList;
import java.util.Scanner;

public class SecretariaService implements Acoes {

    private final Secretaria_db armazenamento;

    public SecretariaService(){
        this.armazenamento = new Secretaria_db();
    }

    Scanner scanner = new Scanner(System.in);

    @Override
    public void cadastrar(){
        System.out.println("Digite o nome da secretaria: ");
        String nome = scanner.nextLine();

        System.out.println("Digite a localização da secretaria: ");
        String localizacao = scanner.nextLine();

        System.out.println("Digite o telefone da secretaria: ");
        String telefone = scanner.nextLine();

        System.out.println("Digite o nome do responsável pela secretaria: ");
        String responsavel = scanner.nextLine();

        System.out.println("Digite o departamento da secretaria: ");
        String departamento = scanner.nextLine();

        System.out.println("Digite o horário de funcionamento da secretaria: ");
        String horarioFuncionamento = scanner.nextLine();

        System.out.println("Digite o nome do funcionário: ");
        String funcionario = scanner.nextLine();

        System.out.println("Digite o tipo de atendimento da secretaria: ");
        String tipoAtendimento = scanner.nextLine();

        Secretaria secretaria = new Secretaria(nome, localizacao, telefone, responsavel, departamento, horarioFuncionamento, funcionario, tipoAtendimento);
        armazenamento.adicionar(secretaria);
    }

    @Override
    public void remover(){
        System.out.println("Digite o nome da secretaria que deseja remover: ");
        String nome = scanner.nextLine();

        ArrayList<Secretaria> secretarias = armazenamento.getSecretarias();

        Secretaria secretariaARemover = null;

        for (Secretaria secretaria : secretarias) {
            if (nome.equals(secretaria.getNome())) {
                secretariaARemover = secretaria;
            }
        }

        if (secretariaARemover != null) {
            armazenamento.remover(secretariaARemover);
            System.out.println("--------------------");
            System.out.println("Secretaria removida.");
            System.out.println("--------------------");
        } else {
            System.out.println("--------------------");
            System.out.println("Secretaria com o nome " + nome + " não encontrado!");
            System.out.println("--------------------");
        }
    }

    @Override
    public void exibirRelatorio(){
        ArrayList<Secretaria> secretarias = armazenamento.getSecretarias();

        if (secretarias == null || secretarias.isEmpty()) {
            System.out.println("--------------------");
            System.out.println("Nenhuma secretaria encontrada.");
            System.out.println("--------------------");
            return;
        }

        System.out.println("Relatório de Secretarias: ");

        for (Secretaria secretaria : secretarias) {
            System.out.println(secretaria.toString());
            System.out.println("--------------------");
        }
    }
}
