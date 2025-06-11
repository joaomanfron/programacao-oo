import java.util.List;
import java.util.Scanner;

/**
 * Classe responsável pela interface com o usuário.
 */
public class ContatoView {
    private Scanner scanner;

    /**
     * Construtor da classe ContatoView.
     */
    public ContatoView() {
        this.scanner = new Scanner(System.in);
    }

    /**
     * Exibe o menu principal da aplicação.
     */
    public void exibirMenu() {
        System.out.println("\n=== Agenda de Contatos ===");
        System.out.println("1 - Cadastrar Pessoa Física");
        System.out.println("2 - Cadastrar Pessoa Jurídica");
        System.out.println("3 - Listar Contatos");
        System.out.println("4 - Buscar Contato");
        System.out.println("5 - Atualizar Contato");
        System.out.println("6 - Excluir Contato");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: ");
    }

    /**
     * Lê os dados de um contato do usuário.
     * @return Array com os dados do contato [nome, telefone, email, documento]
     */
    public String[] lerDadosContato() {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Documento (CPF/CNPJ): ");
        String documento = scanner.nextLine();
        return new String[]{nome, telefone, email, documento};
    }

    /**
     * Lê o documento para busca de um contato.
     * @return Documento informado
     */
    public String lerDocumento() {
        System.out.print("Digite o CPF/CNPJ: ");
        return scanner.nextLine();
    }

    /**
     * Exibe uma lista de contatos em formato tabular.
     * @param contatos Lista de contatos a ser exibida
     */
    public void exibirContatos(List<Contato> contatos) {
        if (contatos.isEmpty()) {
            System.out.println("Nenhum contato cadastrado.");
            return;
        }

        System.out.println("\n=== Lista de Contatos ===");
        System.out.printf("%-30s %-15s %-25s %-20s\n", "Nome", "Telefone", "Email", "Documento");
        System.out.println("-".repeat(90));

        for (Contato contato : contatos) {
            System.out.printf("%-30s %-15s %-25s %-20s\n",
                contato.getNome(),
                contato.getTelefone(),
                contato.getEmail(),
                contato.getDocumento());
        }
    }

    /**
     * Exibe uma mensagem para o usuário.
     * @param mensagem Mensagem a ser exibida
     */
    public void exibirMensagem(String mensagem) {
        System.out.println(mensagem);
    }

    /**
     * Lê uma opção do usuário.
     * @return Opção escolhida
     */
    public int lerOpcao() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return -1;
        }
    }
} 