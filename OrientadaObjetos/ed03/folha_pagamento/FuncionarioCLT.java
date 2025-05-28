/**
 * Classe que representa um funcionário CLT.
 * Recebe um adicional fixo de R$ 300,00 no salário.
 */
public class FuncionarioCLT extends Funcionario {
    /** Valor do adicional fixo para funcionários CLT */
    private static final double ADICIONAL = 300.0;

    /**
     * Construtor da classe FuncionarioCLT.
     * @param nome Nome do funcionário
     * @param salarioBase Salário base do funcionário
     */
    public FuncionarioCLT(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    /**
     * Calcula o salário final do funcionário CLT.
     * @return Salário base + adicional fixo
     */
    @Override
    public double calcularSalario() {
        return salarioBase + ADICIONAL;
    }
} 