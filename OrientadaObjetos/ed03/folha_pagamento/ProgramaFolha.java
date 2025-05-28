/**
 * Classe principal que demonstra o funcionamento do sistema de folha de pagamento.
 */
public class ProgramaFolha {
    public static void main(String[] args) {
        // Criando instâncias dos funcionários
        FuncionarioCLT carlos = new FuncionarioCLT("Carlos", 2000.0);
        FuncionarioTemporario ana = new FuncionarioTemporario("Ana", 2000.0);

        // Exibindo dados e salários dos funcionários
        System.out.println("=== Funcionário CLT ===");
        carlos.exibirDados();
        System.out.println("Salário Final: " + carlos.calcularSalario());
        System.out.println();

        System.out.println("=== Funcionário Temporário ===");
        ana.exibirDados();
        System.out.println("Salário Final: " + ana.calcularSalario());
    }
} 