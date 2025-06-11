/**
 * Interface que define os métodos obrigatórios para um contato.
 */
public interface Contato {
    /**
     * Retorna o nome do contato.
     * @return Nome do contato
     */
    String getNome();

    /**
     * Define o nome do contato.
     * @param nome Nome do contato
     */
    void setNome(String nome);

    /**
     * Retorna o telefone do contato.
     * @return Telefone do contato
     */
    String getTelefone();

    /**
     * Define o telefone do contato.
     * @param telefone Telefone do contato
     */
    void setTelefone(String telefone);

    /**
     * Retorna o email do contato.
     * @return Email do contato
     */
    String getEmail();

    /**
     * Define o email do contato.
     * @param email Email do contato
     */
    void setEmail(String email);

    /**
     * Retorna o documento (CPF/CNPJ) do contato.
     * @return Documento do contato
     */
    String getDocumento();

    /**
     * Define o documento (CPF/CNPJ) do contato.
     * @param documento Documento do contato
     */
    void setDocumento(String documento);

    /**
     * Verifica se o documento é válido.
     * @return true se o documento for válido, false caso contrário
     */
    boolean validarDocumento();

    /**
     * Retorna uma representação em string do contato.
     * @return String formatada com os dados do contato
     */
    @Override
    String toString();
} 