package models;

import java.util.ArrayList;

public class Curso {
    private String nome;
    private int codigo;
    private String departamento;
    private int duracaoEmSemestres;
    private ArrayList<Disciplina> disciplinas;
    private Coordenacao coordenador;

    public Curso(String nome, int codigo, String departamento, int duracaoEmSemestres, ArrayList<Disciplina> disciplinas, Coordenacao coordenador) {
        this.nome = nome;
        this.codigo = codigo;
        this.departamento = departamento;
        this.duracaoEmSemestres = duracaoEmSemestres;
        this.disciplinas = disciplinas;
        this.coordenador = coordenador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getDuracaoEmSemestres() {
        return duracaoEmSemestres;
    }

    public void setDuracaoEmSemestres(int duracaoEmSemestres) {
        this.duracaoEmSemestres = duracaoEmSemestres;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public Coordenacao getCoordenador() {
        return coordenador;
    }

    public void setCoordenador(Coordenacao coordenador) {
        this.coordenador = coordenador;
    }

    public String toString() {
        String disciplinasStr = "";


        if (disciplinas != null && !disciplinas.isEmpty()) {

            for (Disciplina disciplina : disciplinas) {
                disciplinasStr += disciplina.getNome() + ", ";
            }

            disciplinasStr = disciplinasStr.substring(0, disciplinasStr.length() - 2);
        } else {
            disciplinasStr = "Nenhuma disciplina ministrada";
        }

        return "Curso: " + this.nome + " / Departamento: " + this.departamento + " / Duração: " +
                this.duracaoEmSemestres + " semestres / Disciplinas: " + disciplinasStr + " / Coordenador: " + this.coordenador.getNome();
    }

}