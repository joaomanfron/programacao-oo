/**
 * Classe que representa um visitante do sistema.
 */
public class Visitante extends Usuario {
    /**
     * Construtor da classe Visitante.
     * @param login Login do visitante
     * @param senha Senha do visitante
     */
    public Visitante(String login, String senha) {
        super(login, senha);
    }

    /**
     * Exibe uma mensagem indicando acesso restrito.
     */
    @Override
    public void exibirLogin() {
        System.out.println("Visitante - acesso restrito ao sistema.");
    }
} 