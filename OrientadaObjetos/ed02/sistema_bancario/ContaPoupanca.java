/**
 * Conta Poupança: aplica 0.08% de juros ao dia.
 */
public class ContaPoupanca extends Conta {
    /**
     * Construtor da Conta Poupança.
     * @param cliente Nome do cliente
     * @param saldo Saldo inicial
     */
    public ContaPoupanca(String cliente, double saldo) {
        super(cliente, saldo);
    }

    /**
     * Imprime o extrato da Conta Poupança.
     */
    @Override
    public void imprimirExtrato() {
        System.out.println("[Conta Poupança] Cliente: " + cliente + ", Saldo: R$ " + String.format("%.2f", saldo));
    }

    /**
     * Aplica 0.08% de juros ao dia.
     */
    @Override
    public void aplicarJurosDiarios() {
        saldo += saldo * 0.0008;
    }
} 