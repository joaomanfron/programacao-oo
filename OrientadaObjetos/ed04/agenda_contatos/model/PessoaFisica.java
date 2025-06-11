/**
 * Classe que representa uma pessoa física na agenda de contatos.
 */
public class PessoaFisica extends ContatoBase {
    /**
     * Construtor da classe PessoaFisica.
     * @param nome Nome da pessoa
     * @param telefone Telefone da pessoa
     * @param email Email da pessoa
     * @param cpf CPF da pessoa
     */
    public PessoaFisica(String nome, String telefone, String email, String cpf) {
        super(nome, telefone, email, cpf);
    }

    /**
     * Verifica se o CPF é válido (11 dígitos numéricos).
     * @return true se o CPF for válido, false caso contrário
     */
    @Override
    public boolean validarDocumento() {
        String cpf = getDocumento();
        if (cpf == null || cpf.length() != 11) {
            return false;
        }
        // Verifica se todos os caracteres são dígitos
        return cpf.chars().allMatch(Character::isDigit);
    }

    @Override
    public String toString() {
        return "=== Pessoa Física ===\n" + super.toString();
    }
} 