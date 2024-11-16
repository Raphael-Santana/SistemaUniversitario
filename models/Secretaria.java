package models;

public class Secretaria extends Setor {
    private String funcionario;
    private String tipoAtendimento;


    public Secretaria(String nome, String localizacao, String telefone, String responsavel, String departamento,
                      String horarioFuncionamento, String funcionario, String tipoAtendimento) {
        super(nome, localizacao, telefone, responsavel, departamento, horarioFuncionamento);
        this.funcionario = funcionario;
        this.tipoAtendimento = tipoAtendimento;
    }

    public String getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(String funcionario) {
        this.funcionario = funcionario;
    }

    public String getTipoAtendimento() {
        return tipoAtendimento;
    }

    public void setTipoAtendimento(String tipoAtendimento) {
        this.tipoAtendimento = tipoAtendimento;
    }


    public String toString() {
        return "Setor: " + getNome() + " / Funcionario: " + getFuncionario() + " / Tipo de Atendimento: " + getTipoAtendimento();
    }
}
