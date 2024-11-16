package models;

public class Atendente extends Funcionario{
    private String responsabilidade;

    public Atendente(String nome, String endereco, String email, int telefone, int horarioTrabalho, String responsabilidade) {
        super(nome, endereco, email, telefone, horarioTrabalho);
        this.responsabilidade = responsabilidade;
    }

    @Override
    public void definirSalario(double salario) {
        setSalario(salario);
    }

    public String getResponsabilidade() {
        return responsabilidade;
    }

    public void setResponsabilidade(String responsabilidade) {
        this.responsabilidade = responsabilidade;
    }

    @Override
    public String toString() {
        return super.toString() +
                " / Responsabilidade: " + this.responsabilidade;
    }
}
