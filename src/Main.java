import local_db.Armazenamento;
import service.AlunoService;

public class Main {
    public static void main(String[] args) {

        // Instanciando o armazenamento e o Service da classe
        Armazenamento ar = new Armazenamento();
        AlunoService alunoService = new AlunoService(ar);

        // Teste simples de funcionamento
        alunoService.cadastrarAluno();
        System.out.println("--------------------");
        System.out.println("Aluno Cadastrado");
        System.out.println("--------------------");
        alunoService.exibirRelatorioAluno();
        alunoService.removerAluno();
        alunoService.exibirRelatorioAluno();

    }
}