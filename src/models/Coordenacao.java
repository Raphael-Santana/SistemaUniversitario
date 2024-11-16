package models;

import java.util.ArrayList;

public class Coordenacao extends Setor{
    private Professor professorResponsavel;
    private ArrayList<Curso> cursosCoordenados;

    public Coordenacao(String nome, String localizacao, String telefone, String horarioFuncionamento, Professor professorResponsavel, ArrayList<Curso> cursosCoordenados) {
        super(nome,localizacao,telefone, horarioFuncionamento);
        this.professorResponsavel = professorResponsavel;
        this.cursosCoordenados = cursosCoordenados;
    }

    public Professor getProfessorResponsavel() {
        return professorResponsavel;
    }

    public void setProfessorResponsavel(Professor professorResponsavel) {
        this.professorResponsavel = professorResponsavel;
    }

    public ArrayList<Curso> getCursosCoordenados() {
        return cursosCoordenados;
    }

    public void setCursosCoordenados(ArrayList<Curso> cursosCoordenados) {
        this.cursosCoordenados = cursosCoordenados;
    }

    public String toString() {
        StringBuilder cursos = new StringBuilder();

        if (cursosCoordenados != null && !cursosCoordenados.isEmpty()) {

            for (Curso curso : cursosCoordenados) {
                cursos.append(curso.getNome()).append(", ");
            }

            cursos = new StringBuilder(cursos.substring(0, cursos.length() - 2));
        } else {
            cursos = new StringBuilder("Nenhum curso coordenado");
        }
        return super.toString() + " / Professor Responsável: " + this.professorResponsavel.getNome() + " / Cursos Coordenados: " + cursos;
    }
}
