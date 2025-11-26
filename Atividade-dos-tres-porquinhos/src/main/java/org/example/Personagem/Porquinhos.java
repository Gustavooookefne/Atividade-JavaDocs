package org.example.Personagem;

import org.example.Casas.Casa;

/**
 * <p>Representa a casa construída de Madeira de carvalho.</p>
 * @author Gustavo da Silva
 * @version 1.0
 * <p></p>
 * @since 2025-11-25
 */
public class Porquinhos {

    /**
     * @param tipoCasa Descreve a casa sendo construída
     * @see Casa
     */
    public void construir(Casa tipoCasa) {

    }

    /**
     * @param porquinhoAlvo Descreve o porquinho para o qual está fugindo (ex: o irmão mais esperto).
     * @deprecated Este método não é recomendado. Sugere-se que o porquinho use a casa do irmão em vez de fugir para ela.
     */
    @Deprecated
    public void fugir(Porquinhos porquinhoAlvo) {
    }

    /**
     * Obtém o nome do porquinho.
     *
     * @return Descreve o nome do porquinho: Cícero, Epa ou Prático.
     */
    public String getNome() {
        return "Nome do Porquinho";
    }
}