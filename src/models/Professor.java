package models;

public class Professor extends Funcionario {
    private String titulacao;

    public Professor(String nome, String endereco, String email, int telefone, int horarioTrabalho, String titulacao) {
        super(nome, endereco, email, telefone, horarioTrabalho);
        this.titulacao = titulacao;
    }

    @Override
    public void definirSalario(double salario) {
        double valorHora = 5;
        setSalario(salario + (getHorarioTrabalho() * valorHora));
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    @Override
    public String toString() {
        return "Professor: " + getNome() +
                " / Titulação: " + this.titulacao +
                " / Salário: R$ " + getSalario();
    }
}
