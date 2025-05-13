/**
 * Classe base para contas bancárias.
 * Representa uma conta genérica com operações básicas.
 */
public abstract class Conta {
    /** Nome do cliente titular da conta */
    protected String cliente;
    /** Saldo atual da conta */
    protected double saldo;

    /**
     * Construtor da conta.
     * @param cliente Nome do cliente
     * @param saldo Saldo inicial
     */
    public Conta(String cliente, double saldo) {
        this.cliente = cliente;
        this.saldo = saldo;
    }

    /**
     * Realiza um depósito na conta.
     * @param valor Valor a ser depositado
     */
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    /**
     * Realiza um saque na conta.
     * @param valor Valor a ser sacado
     * @return true se o saque foi realizado, false caso contrário
     */
    public boolean sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    /**
     * Transfere um valor para outra conta.
     * @param destino Conta de destino
     * @param valor Valor a ser transferido
     * @return true se a transferência foi realizada, false caso contrário
     */
    public boolean transferir(Conta destino, double valor) {
        if (this.sacar(valor)) {
            destino.depositar(valor);
            return true;
        }
        return false;
    }

    /**
     * Retorna o saldo atual da conta.
     * @return Saldo atual
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Imprime o extrato da conta.
     */
    public abstract void imprimirExtrato();

    /**
     * Aplica juros diários conforme o tipo de conta.
     */
    public abstract void aplicarJurosDiarios();
} 