package models;

public abstract class Funcionario extends Pessoa {
    private double salario;
    private int horarioTrabalho;

    public Funcionario(String nome, String endereco, String email, int telefone, int horarioTrabalho) {
        super(nome, endereco, email, telefone);
        this.horarioTrabalho = horarioTrabalho;
        this.salario = 0;
    }

    // Metodo abstrato para definição de salário
    public abstract void definirSalario(double salario);

    public double getSalario() {
        return salario;
    }

    protected void setSalario(double salario) {
        this.salario = salario;
    }

    public int getHorarioTrabalho() {
        return horarioTrabalho;
    }

    public void setHorarioTrabalho(int horarioTrabalho) {
        this.horarioTrabalho = horarioTrabalho;
    }

    @Override
    public String toString() {
        // Apenas retorna o nome ou outro atributo que você deseja exibir
        return  super.toString() +
                " / Salário: R$ " + this.salario;
    }
}



