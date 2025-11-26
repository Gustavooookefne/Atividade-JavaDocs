package org.example.Casas;

/**
 * <p>Representa a casa construída de Madeira de carvalho.</p>
 * @author Gustavo da Silva
 * @version 1.0
 * <p></p>
 * @since 2025-11-25
 */
public class CasaDeMadeira implements Casa {

    private boolean destruida = false;

    @Override
    public String getMaterial() {
        return "Madeira de Carvalho";
    }

    @Override
    public boolean resisteAoSopro(int forcaDoSopro) {
        destruida = forcaDoSopro > 25;
        return !destruida;
    }

    @Override
    public String getStatusAtual() {
        return destruida ? "Destruída" : "De Pé";
    }

}