package models;

public class Coordenacao extends Setor{
    private String professorResponsavel;
    private String cursosCoordenados;

    public Coordenacao(String nome, String localizacao, String telefone, String responsavel, String departamento, String horarioFuncionamento, String professorResponsavel, String cursosCoordenados) {
        super(nome,localizacao,telefone,responsavel,departamento,horarioFuncionamento);
        this.professorResponsavel = professorResponsavel;
        this.cursosCoordenados = cursosCoordenados;
    }

    public String getProfessorResponsavel() {
        return professorResponsavel;
    }

    public void setProfessorResponsavel(String professorResponsavel) {
        this.professorResponsavel = professorResponsavel;
    }

    public String getCursosCoordenados() {
        return cursosCoordenados;
    }

    public void setCursosCoordenados(String cursosCoordenados) {
        this.cursosCoordenados = cursosCoordenados;
    }

    public String toString() {
        return "Setor: " + getNome() + "Professor Responsável: " + getProfessorResponsavel() + " / Cursos Coordenados: " + String.join(", ", getCursosCoordenados());
    }
}
