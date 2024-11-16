package models;

public class Disciplina {
    private String nome;
    private int codigo;
    private String cargaHoraria;
    private Professor professorResponsavel;
    private Curso cursoRelacionado;
    private int quantidadeCreditos;

    public Disciplina(String nome, int codigo, String cargaHoraria, Professor professorResponsavel, Curso cursoRelacionado, int quantidadeCreditos) {
        this.nome = nome;
        this.codigo = codigo;
        this.cargaHoraria = cargaHoraria;
        this.professorResponsavel = professorResponsavel;
        this.cursoRelacionado = cursoRelacionado;
        this.quantidadeCreditos = quantidadeCreditos;
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

    public String getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(String cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Professor getProfessorResponsavel() {
        return professorResponsavel;
    }

    public void setProfessorResponsavel(Professor professorResponsavel){
        this.professorResponsavel = professorResponsavel;
    }

    public Curso getCursoRelacionado() {
        return cursoRelacionado;
    }

    public void setCursoRelacionado(Curso cursoRelacionado) {
        this.cursoRelacionado = cursoRelacionado;
    }

    public int getQuantidadeCreditos() {
        return quantidadeCreditos;
    }

    public void setQuantidadeCreditos(int quantidadeCreditos) {
        this.quantidadeCreditos = quantidadeCreditos;
    }


    public String toString(){
       return "Disciplina: " + this.nome + " / Carga Horária: " + this.cargaHoraria + " / Professor Responsável: " +
               this.professorResponsavel.getNome() + " / Curso Relacionado: " + this.cursoRelacionado.getNome() + " / Quantidade de Créditos: " + this.quantidadeCreditos;

    }
}
