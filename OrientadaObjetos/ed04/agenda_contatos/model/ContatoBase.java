/**
 * Classe abstrata que implementa a interface Contato e define atributos comuns.
 */
public abstract class ContatoBase implements Contato {
    /** Nome do contato */
    private String nome;
    /** Telefone do contato */
    private String telefone;
    /** Email do contato */
    private String email;
    /** Documento do contato (CPF/CNPJ) */
    private String documento;

    /**
     * Construtor da classe ContatoBase.
     * @param nome Nome do contato
     * @param telefone Telefone do contato
     * @param email Email do contato
     * @param documento Documento do contato
     */
    public ContatoBase(String nome, String telefone, String email, String documento) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.documento = documento;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getTelefone() {
        return telefone;
    }

    @Override
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getDocumento() {
        return documento;
    }

    @Override
    public void setDocumento(String documento) {
        this.documento = documento;
    }

    /**
     * Verifica se o nome é válido (não nulo e com pelo menos 3 caracteres).
     * @return true se o nome for válido, false caso contrário
     */
    protected boolean validarNome() {
        return nome != null && nome.length() >= 3;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s\nTelefone: %s\nEmail: %s\nDocumento: %s",
            nome, telefone, email, documento);
    }
} 