package armazenamento;

import java.util.ArrayList;
import models.Secretaria;

public class Secretaria_db {
    private final ArrayList<Secretaria> secretarias;

    public Secretaria_db() {
        secretarias = new ArrayList<>();
    }

    public void adicionar(Secretaria secretaria) {
        secretarias.add(secretaria);
    }

    public void remover(Secretaria secretaria) {
        secretarias.remove(secretaria);
    }

    public ArrayList<Secretaria> getSecretarias() {
        return secretarias;
    }
}
