/**
 * Interface que define o comportamento de objetos que podem ser gerenciados.
 */
public interface Gerenciavel {
    /**
     * Altera a senha do usuário.
     * @param novaSenha Nova senha a ser definida
     */
    void alterarSenha(String novaSenha);

    /**
     * Bloqueia o usuário.
     */
    void bloquearUsuario();
} 