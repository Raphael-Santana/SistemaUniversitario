package models;

public class Setor {
    private String nome;
    private String localizacao;
    private String telefone;
    private String responsavel;
    private String departamento;
    private String horarioFuncionamento;

    public Setor(String nome, String localizacao, String telefone, String responsavel, String departamento, String horarioFuncionamento) {
        this.nome = nome;
        this.localizacao = localizacao;
        this.telefone = telefone;
        this.responsavel = responsavel;
        this.departamento = departamento;
        this.horarioFuncionamento = horarioFuncionamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getHorarioFuncionamento() {
        return horarioFuncionamento;
    }

    public void setHorarioFuncionamento(String horarioFuncionamento) {
        this.horarioFuncionamento = horarioFuncionamento;
    }

    @Override
    public String toString() {
        return "Setor: " + getNome() + " / Localização: " + getLocalizacao() + " / Telefone: " + getTelefone() +
                " / Responsável: " + getResponsavel() + " / Departamento: " + getDepartamento() +
                " / Horário de Funcionamento: " + getHorarioFuncionamento();
    }
}
