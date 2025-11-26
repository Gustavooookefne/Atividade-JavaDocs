package org.example.Casas;

/**
 * Representa o conceito geral de uma casa
 * @author Gustavo da Silva
 * @version 1.0
 * <p></p>
 * @since 2025-11-25
 * */

public interface Casa {
    String material = "";

    /**
     * @return O meterial da casa seria de cimento
     */

      String getMaterial();

    /**
     * @param forcaDoSopro é a força do Sopro do lobo
     * @return A casa resiste ao Sopro do lobo
     */

     boolean resisteAoSopro(int forcaDoSopro);

     /**
      * @return A casa esta de pé
      * */

      String getStatusAtual();
}
