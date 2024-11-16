package models;

import models.Pessoa;

import java.util.ArrayList;

public class Aluno extends Pessoa {
    private int matricula;
    private int periodo;
    private String curso;
    private ArrayList<Disciplina> disciplinasMatriculadas;

    // Construtor
    public Aluno(String nome, String endereco, String email, int telefone, int matricula, int periodo, String curso, ArrayList<Disciplina> disciplinasMatriculadas) {
        super(nome, endereco, email, telefone);
        this.matricula = matricula;
        this.periodo = periodo;
        this.curso = curso;
        this.disciplinasMatriculadas = disciplinasMatriculadas;
    }

    // Getters and Setters
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public ArrayList<Disciplina> getDisciplinasMatriculadas() {
        return disciplinasMatriculadas;
    }

    public void setDisciplinasMatriculadas(ArrayList<Disciplina> disciplinasMatriculadas) {
        this.disciplinasMatriculadas = disciplinasMatriculadas;
    }

    // ToString para apresentação de informações
    @Override
    public String toString() {
        return super.toString() +
                " / Matrícula: " + this.matricula +
                " / Período: " + this.periodo +
                " / Curso: " + this.curso +
                " / Disciplinas Matriculadas: " + this.disciplinasMatriculadas;
    }
}
