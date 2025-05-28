/**
 * Classe que representa um administrador do sistema.
 */
public class Administrador extends Usuario implements Autenticavel, Gerenciavel, Logavel {
    /**
     * Construtor da classe Administrador.
     * @param login Login do administrador
     * @param senha Senha do administrador
     */
    public Administrador(String login, String senha) {
        super(login, senha);
    }

    /**
     * Verifica se a senha fornecida é igual à senha armazenada.
     * @param senha Senha a ser verificada
     * @return true se a senha for igual, false caso contrário
     */
    @Override
    public boolean autenticar(String senha) {
        return this.senha.equals(senha);
    }

    /**
     * Altera a senha do administrador.
     * @param novaSenha Nova senha a ser definida
     */
    @Override
    public void alterarSenha(String novaSenha) {
        this.senha = novaSenha;
        System.out.println("Senha alterada com sucesso.");
    }

    /**
     * Bloqueia o usuário.
     */
    @Override
    public void bloquearUsuario() {
        System.out.println("Usuário bloqueado com sucesso.");
    }

    /**
     * Registra uma operação no log.
     * @param operacao Operação a ser registrada
     */
    @Override
    public void registrarLog(String operacao) {
        System.out.println("Log registrado: " + operacao);
    }
} 