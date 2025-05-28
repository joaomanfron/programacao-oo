/**
 * Classe abstrata que representa um usuário do sistema.
 */
public abstract class Usuario {
    /** Login do usuário */
    protected String login;
    /** Senha do usuário */
    protected String senha;

    /**
     * Construtor da classe Usuario.
     * @param login Login do usuário
     * @param senha Senha do usuário
     */
    public Usuario(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    /**
     * Exibe o login do usuário.
     */
    public void exibirLogin() {
        System.out.println("Login: " + login);
    }
} 