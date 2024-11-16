package models;

public class Curso {
    private String nome;
    private int codigo;
    private String departamento;
    private int duracaoEmSemestres;
    private String disciplinas;
    private String coordenador;

    public Curso(String nome, int codigo, String departamento, int duracaoEmSemestres, String disciplinas, String coordenador) {
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

    public String getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(String disciplinas) {
        this.disciplinas = disciplinas;
    }

    public String getCoordenador() {
        return coordenador;
    }

    public void setCoordenador(String coordenador) {
        this.coordenador = coordenador;
    }

    public String toString() {
        return "Curso: " + getNome() + " / Código: " + getCodigo() + " / Departamento: " + getDepartamento() + " / Duração: " +
                getDuracaoEmSemestres() + " semestres / Disciplinas: " + getDisciplinas() + " / Coordenador: " + getCoordenador();
    }

}