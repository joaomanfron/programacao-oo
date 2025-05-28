/**
 * Classe abstrata que representa um funcionário genérico.
 * Define a estrutura básica para diferentes tipos de funcionários.
 */
public abstract class Funcionario {
    /** Nome do funcionário */
    protected String nome;
    /** Salário base do funcionário */
    protected double salarioBase;

    /**
     * Construtor da classe Funcionario.
     * @param nome Nome do funcionário
     * @param salarioBase Salário base do funcionário
     */
    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    /**
     * Exibe os dados básicos do funcionário.
     */
    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário Base: " + salarioBase);
    }

    /**
     * Calcula o salário final do funcionário.
     * @return Salário final calculado
     */
    public abstract double calcularSalario();
} 