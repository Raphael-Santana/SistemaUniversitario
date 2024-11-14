package models;

import models.Pessoa;

public class Aluno extends Pessoa {
    private int matricula;
    private int periodo;
    private String curso;

    // Construtor
    public Aluno(String nome, String endereco, String email, int telefone, int matricula, int periodo, String curso) {
        super(nome, endereco, email, telefone);
        this.matricula = matricula;
        this.periodo = periodo;
        this.curso = curso;
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

    // ToString para apresentação de informações
    @Override
    public String toString() {
        return "Aluno: " + getNome() +
                " / Matrícula: " + this.matricula +
                " / Período: " + this.periodo +
                " / Curso: " + this.curso;
    }
}
