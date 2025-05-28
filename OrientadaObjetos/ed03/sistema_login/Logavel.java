/**
 * Interface que define o comportamento de objetos que podem registrar logs.
 */
public interface Logavel {
    /**
     * Registra uma operação no log.
     * @param operacao Operação a ser registrada
     */
    void registrarLog(String operacao);
} 