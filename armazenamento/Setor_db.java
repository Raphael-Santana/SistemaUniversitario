package armazenamento;

import java.util.ArrayList;
import models.Setor;

public class Setor_db {
    private final ArrayList<Setor> setores;

    public Setor_db() {
        setores = new ArrayList<>();
    }

    public void adicionar(Setor setor) {
        setores.add(setor);
    }

    public void remover(Setor setor) {
        setores.remove(setor);
    }

    public ArrayList<Setor> getSetores() {
        return setores;
    }
}
