/**
 * Conta Salário: não aplica juros.
 */
public class ContaSalario extends Conta {
    /**
     * Construtor da Conta Salário.
     * @param cliente Nome do cliente
     * @param saldo Saldo inicial
     */
    public ContaSalario(String cliente, double saldo) {
        super(cliente, saldo);
    }

    /**
     * Imprime o extrato da Conta Salário.
     */
    @Override
    public void imprimirExtrato() {
        System.out.println("[Conta Salário] Cliente: " + cliente + ", Saldo: R$ " + String.format("%.2f", saldo));
    }

    /**
     * Não aplica juros para Conta Salário.
     */
    @Override
    public void aplicarJurosDiarios() {
        // Não aplica juros
    }
} 