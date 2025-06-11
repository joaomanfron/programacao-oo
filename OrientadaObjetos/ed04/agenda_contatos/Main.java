/**
 * Classe principal que inicia a aplicação.
 */
public class Main {
    public static void main(String[] args) {
        ContatoView view = new ContatoView();
        ContatoController controller = new ContatoController(view);
        boolean executar = true;

        while (executar) {
            view.exibirMenu();
            int opcao = view.lerOpcao();

            switch (opcao) {
                case 1: // Cadastrar Pessoa Física
                    String[] dadosPF = view.lerDadosContato();
                    if (controller.cadastrarPessoaFisica(dadosPF)) {
                        view.exibirMensagem("Pessoa física cadastrada com sucesso!");
                    }
                    break;

                case 2: // Cadastrar Pessoa Jurídica
                    String[] dadosPJ = view.lerDadosContato();
                    if (controller.cadastrarPessoaJuridica(dadosPJ)) {
                        view.exibirMensagem("Pessoa jurídica cadastrada com sucesso!");
                    }
                    break;

                case 3: // Listar Contatos
                    view.exibirContatos(controller.listarContatos());
                    break;

                case 4: // Buscar Contato
                    String documentoBusca = view.lerDocumento();
                    Contato contato = controller.buscarContato(documentoBusca);
                    if (contato != null) {
                        view.exibirMensagem("\nContato encontrado:");
                        view.exibirMensagem(contato.toString());
                    } else {
                        view.exibirMensagem("Contato não encontrado!");
                    }
                    break;

                case 5: // Atualizar Contato
                    String documentoAtualiza = view.lerDocumento();
                    String[] novosDados = view.lerDadosContato();
                    if (controller.atualizarContato(documentoAtualiza, novosDados)) {
                        view.exibirMensagem("Contato atualizado com sucesso!");
                    } else {
                        view.exibirMensagem("Contato não encontrado!");
                    }
                    break;

                case 6: // Excluir Contato
                    String documentoExclui = view.lerDocumento();
                    if (controller.excluirContato(documentoExclui)) {
                        view.exibirMensagem("Contato excluído com sucesso!");
                    } else {
                        view.exibirMensagem("Contato não encontrado!");
                    }
                    break;

                case 0: // Sair
                    executar = false;
                    view.exibirMensagem("Encerrando a aplicação...");
                    break;

                default:
                    view.exibirMensagem("Opção inválida!");
            }
        }
    }
} 