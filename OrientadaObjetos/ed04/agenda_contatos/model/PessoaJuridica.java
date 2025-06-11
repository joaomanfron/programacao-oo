/**
 * Classe que representa uma pessoa jurídica na agenda de contatos.
 */
public class PessoaJuridica extends ContatoBase {
    /**
     * Construtor da classe PessoaJuridica.
     * @param nome Nome da empresa
     * @param telefone Telefone da empresa
     * @param email Email da empresa
     * @param cnpj CNPJ da empresa
     */
    public PessoaJuridica(String nome, String telefone, String email, String cnpj) {
        super(nome, telefone, email, cnpj);
    }

    /**
     * Verifica se o CNPJ é válido (14 dígitos numéricos).
     * @return true se o CNPJ for válido, false caso contrário
     */
    @Override
    public boolean validarDocumento() {
        String cnpj = getDocumento();
        if (cnpj == null || cnpj.length() != 14) {
            return false;
        }
        // Verifica se todos os caracteres são dígitos
        return cnpj.chars().allMatch(Character::isDigit);
    }

    @Override
    public String toString() {
        return "=== Pessoa Jurídica ===\n" + super.toString();
    }
} 