package models;

import java.util.ArrayList;

public class Professor extends Funcionario {
    private ArrayList<Disciplina> disciplinasMinistradas;
    private String titulacao;

    public Professor(String nome, String endereco, String email, int telefone, int horarioTrabalho, ArrayList<Disciplina> disciplinas, String titulacao) {
        super(nome, endereco, email, telefone, horarioTrabalho);
        this.disciplinasMinistradas = disciplinas;
        this.titulacao = titulacao;
    }

    @Override
    public void definirSalario(double salario) {
        double valorHora = 5;
        setSalario(salario + (getHorarioTrabalho() * valorHora));
    }

    public ArrayList<Disciplina> getDisciplinasMinistradas() {
        return disciplinasMinistradas;
    }

    public void setDisciplinasMinistradas(ArrayList<Disciplina> disciplinasMinistradas) {
        this.disciplinasMinistradas = disciplinasMinistradas;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    @Override
    public String toString() {
        return super.toString() +
                " / Disciplinas Ministradas: " + this.disciplinasMinistradas +
                " / Titulação: " + this.titulacao;
    }
}
