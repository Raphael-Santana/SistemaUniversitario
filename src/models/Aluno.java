package models;

import models.Pessoa;

public class Aluno implements Pessoa {
    private String nome;
    private String endereco;
    private String email;
    private int telefone;
    private int matricula;
    private int periodo;
    private String curso;

    // Construtor
    public Aluno(String nome, String endereco, String email, int telefone, int matricula, int periodo, String curso) {
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
        this.telefone = telefone;
        this.matricula = matricula;
        this.periodo = periodo;
        this.curso = curso;
    }

    // Métodos da interface Pessoa
    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getEndereco() {
        return endereco;
    }

    @Override
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int getTelefone() {
        return telefone;
    }

    @Override
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

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


    @Override
    public String toString() {
        return "Aluno: " + this.nome +
                " / Matrícula: " + this.matricula +
                " / Período: " + this.periodo +
                " / Curso: " + this.curso;
    }
}
