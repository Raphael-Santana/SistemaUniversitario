package armazenamento;

import models.*;

import java.util.ArrayList;

public class Armazenamento {
    private final ArrayList<Aluno> alunos;
    private final ArrayList<Atendente> atendentes;
    private final ArrayList<Disciplina> disciplinas;
    private final ArrayList<Professor> professores;
    private final ArrayList<Coordenacao> coordenacoes;
    private final ArrayList<Curso> cursos;
    private final ArrayList<Secretaria> secretarias;

    public Armazenamento() {
        this.alunos = new ArrayList<>();
        this.atendentes = new ArrayList<>();
        this.disciplinas = new ArrayList<>();
        this.professores = new ArrayList<>();
        this.coordenacoes = new ArrayList<>();
        this.cursos = new ArrayList<>();
        this.secretarias = new ArrayList<>();
    }

    // Inicializar objetos
    public void inicializarDados() {
        // Criando Professores
        Professor professor1 = new Professor("Carlos Almeida", "Rua A", "carlos@universidade.com", 12345678, 8, new ArrayList<>(), "Doutor");
        professor1.definirSalario(3000.0);
        Professor professor2 = new Professor("Ana Souza", "Rua B", "ana@universidade.com", 87654321, 10, new ArrayList<>(), "Mestre");
        professor2.definirSalario(5000.0);
        Professor professor3 = new Professor("Paulo Silva", "Rua C", "paulo@universidade.com", 12348765, 6, new ArrayList<>(), "Especialista");
        professor1.definirSalario(2000.0);
        professores.add(professor1);
        professores.add(professor2);
        professores.add(professor3);

        // Criando Cursos
        Curso curso1 = new Curso("Engenharia de Software", 101, "Tecnologia", 8, new ArrayList<>(), null);
        Curso curso2 = new Curso("Administração", 102, "Negócios", 8, new ArrayList<>(), null);
        Curso curso3 = new Curso("Design Gráfico", 103, "Artes", 6, new ArrayList<>(), null);
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);

        // Criando Disciplinas
        Disciplina disciplina1 = new Disciplina("Estrutura de dados", 201, "60h", professor1, curso1, 4);
        Disciplina disciplina2 = new Disciplina("Projeto de Programação", 202, "45h", professor2, curso2, 3);
        Disciplina disciplina3 = new Disciplina("Inteligência Artificial", 203, "50h", professor3, curso3, 3);
        disciplinas.add(disciplina1);
        disciplinas.add(disciplina2);
        disciplinas.add(disciplina3);

        // Atualizando as disciplinas dos professores
        professor1.getDisciplinasMinistradas().add(disciplina1);
        professor2.getDisciplinasMinistradas().add(disciplina2);
        professor3.getDisciplinasMinistradas().add(disciplina3);

        // Atualizando as disciplinas dos cursos
        curso1.getDisciplinas().add(disciplina1);
        curso2.getDisciplinas().add(disciplina2);
        curso3.getDisciplinas().add(disciplina3);

        // Criando Alunos
        ArrayList<Disciplina> disciplinasAluno1 = new ArrayList<>();
        disciplinasAluno1.add(disciplina1);
        Aluno aluno1 = new Aluno("João Mendes", "Rua D", "joao@universidade.com", 12312312, 1111, 5, "Engenharia de Software", disciplinasAluno1);

        ArrayList<Disciplina> disciplinasAluno2 = new ArrayList<>();
        disciplinasAluno2.add(disciplina2);
        Aluno aluno2 = new Aluno("Maria Fernanda", "Rua E", "maria@universidade.com", 32132132, 2222, 3, "Administração", disciplinasAluno2);

        ArrayList<Disciplina> disciplinasAluno3 = new ArrayList<>();
        disciplinasAluno3.add(disciplina3);
        Aluno aluno3 = new Aluno("Lucas Braga", "Rua F", "lucas@universidade.com", 12332123, 3333, 2, "Design Gráfico", disciplinasAluno3);

        alunos.add(aluno1);
        alunos.add(aluno2);
        alunos.add(aluno3);

        // Criando Atendentes
        Atendente atendente1 = new Atendente("Clara Santos", "Rua G", "clara@universidade.com", 5551234, 8, "Atendimento ao público");
        atendente1.definirSalario(1400.0);
        Atendente atendente2 = new Atendente("Fernando Lopes", "Rua H", "fernando@universidade.com", 6664321, 6, "Documentação");
        atendente2.definirSalario(1800.0);
        Atendente atendente3 = new Atendente("Rafael Costa", "Rua I", "rafael@universidade.com", 7776543, 7, "Suporte interno");
        atendente3.definirSalario(1200.0);
        atendentes.add(atendente1);
        atendentes.add(atendente2);
        atendentes.add(atendente3);

        // Criando Secretarias
        ArrayList<Atendente> atendentesSec1 = new ArrayList<>();
        atendentesSec1.add(atendente1);
        Secretaria secretaria1 = new Secretaria("Secretaria Acadêmica", "Prédio A", "1234-5678", "8h às 18h", atendentesSec1, "Departamento Acadêmico");

        ArrayList<Atendente> atendentesSec2 = new ArrayList<>();
        atendentesSec2.add(atendente2);
        Secretaria secretaria2 = new Secretaria("Secretaria de Pós-Graduação", "Prédio B", "8765-4321", "9h às 17h", atendentesSec2, "Pós-Graduação");

        ArrayList<Atendente> atendentesSec3 = new ArrayList<>();
        atendentesSec3.add(atendente3);
        Secretaria secretaria3 = new Secretaria("Secretaria de Extensão", "Prédio C", "1122-3344", "10h às 16h", atendentesSec3, "Extensão Universitária");

        secretarias.add(secretaria1);
        secretarias.add(secretaria2);
        secretarias.add(secretaria3);

        // Criando Coordenações
        ArrayList<Curso> cursosCoord1 = new ArrayList<>();
        cursosCoord1.add(curso1);
        Coordenacao coordenacao1 = new Coordenacao("Coordenação de TI", "Prédio D", "1212-3434", "9h às 17h", professor1, cursosCoord1);

        ArrayList<Curso> cursosCoord2 = new ArrayList<>();
        cursosCoord2.add(curso2);
        Coordenacao coordenacao2 = new Coordenacao("Coordenação de Negócios", "Prédio E", "5656-7878", "8h às 18h", professor2, cursosCoord2);

        ArrayList<Curso> cursosCoord3 = new ArrayList<>();
        cursosCoord3.add(curso3);
        Coordenacao coordenacao3 = new Coordenacao("Coordenação de Artes", "Prédio F", "9090-1212", "7h às 15h", professor3, cursosCoord3);

        coordenacoes.add(coordenacao1);
        coordenacoes.add(coordenacao2);
        coordenacoes.add(coordenacao3);

        // Atualizando coordenadores nos cursos
        curso1.setCoordenador(coordenacao1);
        curso2.setCoordenador(coordenacao2);
        curso3.setCoordenador(coordenacao3);
    }

    // ALUNO
    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void removerAluno(Aluno aluno) {
        alunos.remove(aluno);
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    // ATENDENTE
    public void adicionarAtendente(Atendente atendente) {
        atendentes.add(atendente);
    }

    public void removerAtendente(Atendente atendente) {
        atendentes.remove(atendente);
    }

    public ArrayList<Atendente> getAtendentes() {
        return atendentes;
    }

    // DISCIPLINA
    public void adicionarDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    public void removerDisciplina(Disciplina disciplina) {
        disciplinas.remove(disciplina);
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    // PROFESSOR
    public void adicionarProfessor(Professor professor) {
        professores.add(professor);
    }

    public void removerProfessor(Professor professor) {
        professores.remove(professor);
    }

    public ArrayList<Professor> getProfessores() {
        return professores;
    }

    // COORDENAÇÃO
    public void adicionarCoordenacao(Coordenacao coordenacao) {
        coordenacoes.add(coordenacao);
    }

    public void removerCoorddenacao(Coordenacao coordenacao) {
        coordenacoes.remove(coordenacao);
    }

    public ArrayList<Coordenacao> getCoordenacoes() {
        return coordenacoes;
    }

    // CURSOS
    public void adicionarCurso(Curso curso) {
        cursos.add(curso);
    }

    public void removerCurso(Curso curso) {
        cursos.remove(curso);
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    // SECRETARIAS
    public void adicionarSecretaria(Secretaria secretaria) {
        secretarias.add(secretaria);
    }

    public void removerSecretaria(Secretaria secretaria) {
        secretarias.remove(secretaria);
    }

    public ArrayList<Secretaria> getSecretarias() {
        return secretarias;
    }
}
