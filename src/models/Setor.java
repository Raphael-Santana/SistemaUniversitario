package models;

public class Setor {
    private String nome;
    private String localizacao;
    private String telefone;;
    private String horarioFuncionamento;

    public Setor(String nome, String localizacao, String telefone, String horarioFuncionamento) {
        this.nome = nome;
        this.localizacao = localizacao;
        this.telefone = telefone;
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

    public String getHorarioFuncionamento() {
        return horarioFuncionamento;
    }

    public void setHorarioFuncionamento(String horarioFuncionamento) {
        this.horarioFuncionamento = horarioFuncionamento;
    }

    @Override
    public String toString() {
        return "Setor: " + this.nome;
    }
}
