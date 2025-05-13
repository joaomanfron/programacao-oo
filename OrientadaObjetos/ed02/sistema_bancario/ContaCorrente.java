/**
 * Conta Corrente: aplica 0.1% de juros ao dia.
 */
public class ContaCorrente extends Conta {
    /**
     * Construtor da Conta Corrente.
     * @param cliente Nome do cliente
     * @param saldo Saldo inicial
     */
    public ContaCorrente(String cliente, double saldo) {
        super(cliente, saldo);
    }

    /**
     * Imprime o extrato da Conta Corrente.
     */
    @Override
    public void imprimirExtrato() {
        System.out.println("[Conta Corrente] Cliente: " + cliente + ", Saldo: R$ " + String.format("%.2f", saldo));
    }

    /**
     * Aplica 0.1% de juros ao dia.
     */
    @Override
    public void aplicarJurosDiarios() {
        saldo += saldo * 0.001;
    }
} 