package models;

import local_db.Armazenamento;

public interface Pessoa {

    public String getNome();
    public void setNome(String nome);

    public String getEndereco();
    public void setEndereco(String endereco);

    public String getEmail();
    public void setEmail(String email);

    public int getTelefone();
    public void setTelefone(int telefone);

}
