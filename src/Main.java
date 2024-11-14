import models.Professor;
import service.AlunoService;
import service.ProfessorService;

public class Main {
    public static void main(String[] args) {

        // Instanciando o Service da classe
        ProfessorService professorService = new ProfessorService();

        // Teste simples de funcionamento
        professorService.cadastrar();
        System.out.println("--------------------");
        System.out.println("Professor Cadastrado");
        System.out.println("--------------------");
        professorService.exibirRelatorio();
        professorService.remover();
        professorService.exibirRelatorio();

    }
}