import java.util.ArrayList;
import java.util.Scanner;

import armazenamento.Armazenamento;
import service.*;

public class Main {
    public static void main(String[] args) {

        // Instanciando o armazenamento
        Armazenamento armazenamento = new Armazenamento();
        armazenamento.inicializarDados();

        // Instanciando o Service da classe
        AlunoService alunoService = new AlunoService(armazenamento);
        ProfessorService professorService = new ProfessorService(armazenamento);
        AtendenteService atendenteService = new AtendenteService(armazenamento);
        DisciplinaService disciplinaService = new DisciplinaService(armazenamento);
        CursoService cursoService = new CursoService(armazenamento);
        CoordenacaoService coordenacaoService = new CoordenacaoService(armazenamento);
        SecretariaService secretariaService = new SecretariaService(armazenamento);


        Scanner scanner = new Scanner(System.in);

        int opcao;
        int escolhaEspecifica;

        do {
            System.out.println("----- Menu -----");
            System.out.println("1. Gerenciar alunos");
            System.out.println("2. Gerenciar funcionários");
            System.out.println("3. Gerenciar coordenação");
            System.out.println("4. Gerenciar secretarias");
            System.out.println("5. Gerenciar cursos");
            System.out.println("6. Gerenciar disciplinas");
            System.out.println("7. Listar informações de alunos");
            System.out.println("8. Listar informações dos funcionários funcionários");
            System.out.println("9. Listar informações das coordenações");
            System.out.println("10. Listar informações das secretarias");
            System.out.println("11. Listar informações dos cursos");
            System.out.println("12. Listar informações das disciplinas");
            System.out.println("13. Sair");
            System.out.println("--------------");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            System.out.println("--------------");


            if (opcao == 1) {
                System.out.println("------- Ação -------");
                System.out.println("1. Adicionar aluno");
                System.out.println("2. Remover aluno");
                System.out.println("3. Voltar");
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
                else if (escolhaEspecifica == 3) {
                    System.out.println("--------------");
                    continue;
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
                    } else if (escolhaEspecifica == 2) {
                        System.out.println("--------------");
                        professorService.remover();
                    } else {
                        System.out.println("Parece que você digitou errado");
                    }
                } else if (escolhaEspecifica == 2) {
                    System.out.println("------- Ação -------");
                    System.out.println("1. Adicionar atendente");
                    System.out.println("2. Remover atendente");
                    System.out.print("Escolha uma opção: ");
                    escolhaEspecifica = scanner.nextInt();

                    if (escolhaEspecifica == 1) {
                        System.out.println("--------------");
                        atendenteService.cadastrar();
                    } else if (escolhaEspecifica == 2) {
                        System.out.println("--------------");
                        atendenteService.remover();
                    } else {
                        System.out.println("Parece que você digitou errado");
                    }
                }
            }

            else if (opcao == 3) {
                System.out.println("------- Ação -------");
                System.out.println("1. Adicionar coordenação");
                System.out.println("2. Remover coordenação");
                System.out.print("Escolha uma opção: ");
                escolhaEspecifica = scanner.nextInt();

                if (escolhaEspecifica == 1) {
                    System.out.println("--------------");
                    coordenacaoService.cadastrar();
                }
                else if (escolhaEspecifica == 2) {
                    System.out.println("--------------");
                    atendenteService.remover();
                }
                else {
                    System.out.println("Parece que você digitou errado");
                }
            }

            else if (opcao == 4) {
                System.out.println("------- Ação -------");
                System.out.println("1. Adicionar secretária");
                System.out.println("2. Remover secretária");
                System.out.print("Escolha uma opção: ");
                escolhaEspecifica = scanner.nextInt();

                if (escolhaEspecifica == 1) {
                    System.out.println("--------------");
                    secretariaService.cadastrar();
                }
                else if (escolhaEspecifica == 2) {
                    System.out.println("--------------");
                    secretariaService.remover();
                }
                else {
                    System.out.println("Parece que você digitou errado");
                }
            }

            else if (opcao == 5) {
                System.out.println("------- Ação -------");
                System.out.println("1. Adicionar curso");
                System.out.println("2. Remover curso");
                System.out.print("Escolha uma opção: ");
                escolhaEspecifica = scanner.nextInt();

                if (escolhaEspecifica == 1) {
                    System.out.println("--------------");
                    cursoService.cadastrar();
                }
                else if (escolhaEspecifica == 2) {
                    System.out.println("--------------");
                    cursoService.remover();
                }
                else {
                    System.out.println("Parece que você digitou errado");
                }
            }

            else if (opcao == 6) {
                System.out.println("------- Ação -------");
                System.out.println("1. Adicionar disciplina");
                System.out.println("2. Remover disciplina");
                System.out.print("Escolha uma opção: ");
                escolhaEspecifica = scanner.nextInt();

                if (escolhaEspecifica == 1) {
                    System.out.println("--------------");
                    disciplinaService.cadastrar();
                }
                else if (escolhaEspecifica == 2) {
                    System.out.println("--------------");
                    disciplinaService.remover();
                }
                else {
                    System.out.println("Parece que você digitou errado");
                }
            }

            else if (opcao == 7) {
                alunoService.exibirRelatorio();
            }

            else if (opcao == 8) {
                professorService.exibirRelatorio();
                System.out.println("----------------------");
                atendenteService.exibirRelatorio();
            }

            else if (opcao == 9) {
                coordenacaoService.exibirRelatorio();
            }

            else if (opcao == 10) {
                secretariaService.exibirRelatorio();
            }

            else if (opcao == 11) {
                cursoService.exibirRelatorio();
            }

            else if (opcao == 12) {
                disciplinaService.exibirRelatorio();
            }

            else {
                System.out.println("Parece que digitou algo errado!");
            }

        } while (opcao != 13);

    }

}