/**
 * Classe que representa um relatório em PDF.
 */
public class RelatorioPDF implements Imprimivel {
    /** Autor do relatório */
    private String autor;
    /** Número de páginas do relatório */
    private int numeroPaginas;

    /**
     * Construtor da classe RelatorioPDF.
     * @param autor Autor do relatório
     * @param numeroPaginas Número de páginas
     */
    public RelatorioPDF(String autor, int numeroPaginas) {
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    /**
     * Imprime informações do relatório.
     */
    @Override
    public void imprimir() {
        System.out.println("Autor: " + autor);
        System.out.println("Total de páginas: " + numeroPaginas);
        System.out.println();
    }
} 