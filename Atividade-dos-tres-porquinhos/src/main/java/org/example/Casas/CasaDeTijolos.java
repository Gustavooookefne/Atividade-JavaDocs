package org.example.Casas;

/**
 * <p>Representa a casa construída de Tijolos Amarelos.</p>
 * @author Gustavo da Silva
 * @version 1.0
 * <p></p>
 * @since 2025-11-25
 */
public class CasaDeTijolos implements Casa {

    private boolean destruida = false;

    @Override
    public String getMaterial() {
        return "Tijolos Amarelos";
    }

    @Override
    public boolean resisteAoSopro(int forcaDoSopro) {
        destruida = forcaDoSopro > 75;
        return !destruida;
    }

    @Override
    public String getStatusAtual() {
        return destruida ? "Destruída" : "De Pé";
    }

}