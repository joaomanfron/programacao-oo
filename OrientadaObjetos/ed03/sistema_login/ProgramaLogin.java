/**
 * Classe principal que demonstra o funcionamento do sistema de login.
 */
public class ProgramaLogin {
    public static void main(String[] args) {
        // Criando instâncias dos diferentes tipos de usuários
        Administrador admin = new Administrador("admin", "admin123");
        Visitante visitante = new Visitante("guest", "qualquer");
        Cliente cliente = new Cliente("joao", "segredo123");

        // Testando o administrador
        System.out.println("=== Administrador ===");
        admin.exibirLogin();
        System.out.println("Autenticação com 'admin123': " + admin.autenticar("admin123"));
        System.out.println("Autenticação com 'errada': " + admin.autenticar("errada"));
        admin.alterarSenha("novaSenha123");
        admin.bloquearUsuario();
        admin.registrarLog("Exclusão de conta");
        System.out.println();

        // Testando o visitante
        System.out.println("=== Visitante ===");
        visitante.exibirLogin();
        System.out.println();

        // Testando o cliente
        System.out.println("=== Cliente ===");
        cliente.exibirLogin();
        System.out.println("Autenticação com 'segredo123': " + cliente.autenticar("segredo123"));
        System.out.println("Autenticação com '12345': " + cliente.autenticar("12345"));
    }
} 