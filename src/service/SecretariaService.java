package service;

import armazenamento.Armazenamento;
import models.Atendente;
import models.Secretaria;

import java.util.ArrayList;
import java.util.Scanner;

public class SecretariaService implements Acoes {

    private final Armazenamento armazenamento;

    public SecretariaService(Armazenamento armazenamento) {
        this.armazenamento = armazenamento;
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

        System.out.println("Digite o horário de funcionamento da secretaria: ");
        String horarioFuncionamento = scanner.nextLine();

        System.out.println("Selecione os funcionários: ");
        ArrayList<Atendente> atendentes = armazenamento.getAtendentes();

        // Exibição das disciplinas
        int count = 1;
        for (Atendente atendente : atendentes) {
            System.out.println(count + ". Nome: " + atendente.getNome());
            System.out.println("--------------------");
            count++;
        }

        // Solicita as escolhas do usuário
        System.out.print("Selecione os números (separados por vírgula): ");
        String input = scanner.nextLine();

        // Processa as escolhas
        String[] indicesEscolhidos = input.split(",");
        ArrayList<Atendente> atendentesEscolhidos = new ArrayList<>();

        // Adiciona as disciplinas escolhidas ao ArrayList
        for (String indiceStr : indicesEscolhidos) {
            int indice = Integer.parseInt(indiceStr.trim()) - 1;
            atendentesEscolhidos.add(atendentes.get(indice));
        }

        System.out.println("Digite o departamento da secretaria: ");
        String departamento = scanner.nextLine();

        Secretaria secretaria = new Secretaria(nome, localizacao, telefone, horarioFuncionamento, atendentesEscolhidos, departamento);
        armazenamento.adicionarSecretaria(secretaria);
        System.out.println("SECRETARIA CADASTRADA");
        System.out.println("--------------------");
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
            armazenamento.removerSecretaria(secretariaARemover);
            System.out.println("--------------------");
            System.out.println("SECRETARIA REMOVIDA");
            System.out.println("--------------------");
        } else {
            System.out.println("--------------------");
            System.out.println("SECRETARIA COM NOME " + nome + " NÃO ENCONTRADA");
            System.out.println("--------------------");
        }
    }

    @Override
    public void exibirRelatorio(){
        ArrayList<Secretaria> secretarias = armazenamento.getSecretarias();

        if (secretarias == null || secretarias.isEmpty()) {
            System.out.println("--------------------");
            System.out.println("NENHUMA SECRETARIA ENCONTRADA");
            System.out.println("--------------------");
            return;
        }

        System.out.println("RELATÓRIO DAS SECRETARIAS");
        System.out.println();
        for (Secretaria secretaria : secretarias) {
            System.out.println(secretaria.toString());
            System.out.println("--------------------");
        }
    }
}
