package models;

public class Disciplina {
    private String nome;
    private int codigo;
    private String cargaHoraria;
    private String professorResponsavel;
    private String cursoRelacionado;
    private int quantidadeCreditos;

    public Disciplina(String nome, int codigo, String cargaHoraria, String professorResponsavel, String cursoRelacionado, int quantidadeCreditos) {
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
   public int getCodigo(){
       return codigo;
   }
   public void setCodigo(int codigo){
       this.codigo = codigo;
   }
    public String getCargaHoraria(){
       return cargaHoraria;
    }
    public void setCargaHoraria(String cargaHoraria){
       this.cargaHoraria = cargaHoraria;
    }
    public String getProfessorResponsavel(){
       return professorResponsavel;
    }
    public void setProfessorResponsavel(String professorResponsavel){
       this.professorResponsavel = professorResponsavel;
    }
    public String getCursoRelacionado(){
       return cursoRelacionado;
    }
    public void setCursoRelacionado(String cursoRelacionado){
       this.cursoRelacionado = cursoRelacionado;
    }
    public int getQuantidadeCreditos(){
       return quantidadeCreditos;
    }
    public void setQuantidadeCreditos(int quantidadeCreditos){
       this.quantidadeCreditos = quantidadeCreditos;
    }

    public String toString(){
       return "Disciplina: " + getNome() + " / Codigo: " + getCodigo() + " / Carga Horária: " + getCargaHoraria() + " / Professor Responsável: " +
               getProfessorResponsavel() + " / Curso Relacionado: " + getCursoRelacionado() + " / Quantidade de Créditos: " + getQuantidadeCreditos();

    }
}
