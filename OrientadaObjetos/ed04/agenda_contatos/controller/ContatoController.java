import java.util.ArrayList;
import java.util.List;

/**
 * Classe responsável por gerenciar a lógica da aplicação.
 */
public class ContatoController {
    private List<Contato> contatos;
    private ContatoView view;

    /**
     * Construtor da classe ContatoController.
     * @param view Instância da view para interação com o usuário
     */
    public ContatoController(ContatoView view) {
        this.contatos = new ArrayList<>();
        this.view = view;
    }

    /**
     * Cadastra uma pessoa física.
     * @param dados Array com os dados do contato [nome, telefone, email, cpf]
     * @return true se o cadastro foi bem-sucedido, false caso contrário
     */
    public boolean cadastrarPessoaFisica(String[] dados) {
        PessoaFisica pf = new PessoaFisica(dados[0], dados[1], dados[2], dados[3]);
        if (!validarContato(pf)) {
            return false;
        }
        contatos.add(pf);
        return true;
    }

    /**
     * Cadastra uma pessoa jurídica.
     * @param dados Array com os dados do contato [nome, telefone, email, cnpj]
     * @return true se o cadastro foi bem-sucedido, false caso contrário
     */
    public boolean cadastrarPessoaJuridica(String[] dados) {
        PessoaJuridica pj = new PessoaJuridica(dados[0], dados[1], dados[2], dados[3]);
        if (!validarContato(pj)) {
            return false;
        }
        contatos.add(pj);
        return true;
    }

    /**
     * Lista todos os contatos cadastrados.
     * @return Lista de contatos
     */
    public List<Contato> listarContatos() {
        return new ArrayList<>(contatos);
    }

    /**
     * Busca um contato pelo documento.
     * @param documento CPF ou CNPJ do contato
     * @return Contato encontrado ou null se não existir
     */
    public Contato buscarContato(String documento) {
        return contatos.stream()
            .filter(c -> c.getDocumento().equals(documento))
            .findFirst()
            .orElse(null);
    }

    /**
     * Atualiza os dados de um contato.
     * @param documento CPF ou CNPJ do contato
     * @param dados Array com os novos dados [nome, telefone, email]
     * @return true se a atualização foi bem-sucedida, false caso contrário
     */
    public boolean atualizarContato(String documento, String[] dados) {
        Contato contato = buscarContato(documento);
        if (contato == null) {
            return false;
        }

        contato.setNome(dados[0]);
        contato.setTelefone(dados[1]);
        contato.setEmail(dados[2]);
        return true;
    }

    /**
     * Exclui um contato pelo documento.
     * @param documento CPF ou CNPJ do contato
     * @return true se a exclusão foi bem-sucedida, false caso contrário
     */
    public boolean excluirContato(String documento) {
        Contato contato = buscarContato(documento);
        if (contato == null) {
            return false;
        }
        return contatos.remove(contato);
    }

    /**
     * Valida os dados de um contato.
     * @param contato Contato a ser validado
     * @return true se o contato for válido, false caso contrário
     */
    private boolean validarContato(Contato contato) {
        if (!contato.validarDocumento()) {
            view.exibirMensagem("Documento inválido!");
            return false;
        }

        if (buscarContato(contato.getDocumento()) != null) {
            view.exibirMensagem("Contato já cadastrado!");
            return false;
        }

        if (contato.getNome() == null || contato.getNome().length() < 3) {
            view.exibirMensagem("Nome inválido! Deve ter pelo menos 3 caracteres.");
            return false;
        }

        return true;
    }
} 