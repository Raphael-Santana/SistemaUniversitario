package armazenamento;

import java.util.ArrayList;
import models.Coordenacao;

public class Coordenacao_db {
    private final ArrayList<Coordenacao> coordenacoes;

    public Coordenacao_db() {
        coordenacoes = new ArrayList<>();
    }

    public void adicionar(Coordenacao coordenacao) {
        coordenacoes.add(coordenacao);
    }

    public void remover(Coordenacao coordenacao) {
        coordenacoes.remove(coordenacao);
    }

    public ArrayList<Coordenacao> getCoordenacoes() {
        return coordenacoes;
    }
}
