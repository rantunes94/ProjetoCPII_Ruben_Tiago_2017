package projetocp;

import java.io.Serializable;

/**
 * Enumeração que permite declarar os tipos de Avaria possiveis
 */
public enum EstadoAvaria  implements Serializable{
    PORREPARAR,
    REPARADA,
    IRREPARAVEL;

}
