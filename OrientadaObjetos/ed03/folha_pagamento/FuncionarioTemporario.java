/**
 * Classe que representa um funcionário temporário.
 * Tem um desconto fixo de R$ 100,00 no salário.
 */
public class FuncionarioTemporario extends Funcionario {
    /** Valor do desconto fixo para funcionários temporários */
    private static final double DESCONTO = 100.0;

    /**
     * Construtor da classe FuncionarioTemporario.
     * @param nome Nome do funcionário
     * @param salarioBase Salário base do funcionário
     */
    public FuncionarioTemporario(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    /**
     * Calcula o salário final do funcionário temporário.
     * @return Salário base - desconto fixo
     */
    @Override
    public double calcularSalario() {
        return salarioBase - DESCONTO;
    }
} 