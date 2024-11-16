package models;

import java.util.ArrayList;

public class Secretaria extends Setor {
    private ArrayList<Atendente> funcionarios;
    private String departamento;


    public Secretaria(String nome, String localizacao, String telefone, String horarioFuncionamento, ArrayList<Atendente> funcionarios, String departamento) {
        super(nome, localizacao, telefone, horarioFuncionamento);
        this.funcionarios = funcionarios;
        this.departamento = departamento;
    }

    public ArrayList<Atendente> getFuncionario() {
        return funcionarios;
    }

    public void setFuncionario(ArrayList<Atendente> funcionario) {
        this.funcionarios = funcionario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }


    public String toString() {
        return super.toString() + " / Funcionarios: " + this.funcionarios + " / Departamento: " + this.departamento;
    }
}
