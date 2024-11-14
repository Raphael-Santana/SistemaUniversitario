import java.util.Scanner;

import service.AlunoService;
import service.AtendenteService;
import service.ProfessorService;

public class Main {
    public static void main(String[] args) {

        // Instanciando o Service da classe
        AlunoService alunoService = new AlunoService();
        ProfessorService professorService = new ProfessorService();
        AtendenteService atendenteService = new AtendenteService();

        Scanner scanner = new Scanner(System.in);

        int opcao;
        int escolhaEspecifica;

        do {
            System.out.println("----- Menu -----");
            System.out.println("1. Gerenciar alunos");
            System.out.println("2. Gerenciar funcionários");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();


            if (opcao == 1) {
                System.out.println("------- Ação -------");
                System.out.println("1. Adicionar aluno");
                System.out.println("2. Remover aluno");
                System.out.print("Escolha uma opção: ");
                escolhaEspecifica = scanner.nextInt();

                if (escolhaEspecifica == 1) {
                    System.out.println("--------------");
                    alunoService.cadastrar();
                }
                else if (escolhaEspecifica == 2) {
                    System.out.println("--------------");
                    alunoService.remover();
                }
                else {
                    System.out.println("Parece que você digitou errado");
                }
            }

            else if (opcao == 2) {
                System.out.println("------- Qual funcionário -------");
                System.out.println("1. Professor");
                System.out.println("2. Atendente");
                System.out.print("Escolha uma opção: ");
                escolhaEspecifica = scanner.nextInt();

                if (escolhaEspecifica == 1) {
                    System.out.println("------- Ação -------");
                    System.out.println("1. Adicionar professor");
                    System.out.println("2. Remover professor");
                    System.out.print("Escolha uma opção: ");
                    escolhaEspecifica = scanner.nextInt();

                    if (escolhaEspecifica == 1) {
                        System.out.println("--------------");
                        professorService.cadastrar();
                    }
                    else if (escolhaEspecifica == 2) {
                        System.out.println("--------------");
                        professorService.remover();
                    }
                    else {
                        System.out.println("Parece que você digitou errado");
                    }
                }
                else if (escolhaEspecifica == 2) {
                    System.out.println("------- Ação -------");
                    System.out.println("1. Adicionar atendente");
                    System.out.println("2. Remover atendente");
                    System.out.print("Escolha uma opção: ");
                    escolhaEspecifica = scanner.nextInt();

                    if (escolhaEspecifica == 1) {
                        System.out.println("--------------");
                        atendenteService.cadastrar();
                    }
                    else if (escolhaEspecifica == 2) {
                        System.out.println("--------------");
                        atendenteService.remover();
                    }
                    else {
                        System.out.println("Parece que você digitou errado");
                    }
                }

            }
        } while (opcao != 3);

    }

}