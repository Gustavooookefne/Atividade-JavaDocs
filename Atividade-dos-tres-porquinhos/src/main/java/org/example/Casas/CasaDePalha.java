package org.example.Casas;

/**
 * <p>Representa a casa construída de palha pelo primeiro Porquinho Cícero. É a casa mais frágil da história e oferece uma resistência baixa contra o sopro do Lobo Mau.</p>
 * @author Victor Daniel Strelow
 * @version 1.0.0
 * @since 2025-11-25
 */
public class CasaDePalha implements Casa {

    private boolean destruida = false;

    @Override
    public String getMaterial() {
        return "Palha";
    }

    @Override
    public boolean resisteAoSopro(int forcaDoSopro) {
        destruida = forcaDoSopro > 10;
        return !destruida;
    }

    @Override
    public String getStatusAtual() {
        return destruida ? "Destruída" : "De Pé";
    }

}