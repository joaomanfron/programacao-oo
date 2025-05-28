/**
 * Classe principal que demonstra o funcionamento do sistema de impressão.
 */
public class ProgramaImpressao {
    public static void main(String[] args) {
        // Criando instâncias dos diferentes tipos de conteúdo
        DocumentoTexto doc = new DocumentoTexto("Documento de Apresentação", "Este é o conteúdo do documento.");
        ImagemDigital img = new ImagemDigital("paisagem.jpg", "1920x1080");
        GraficoEstatistico grafico = new GraficoEstatistico("Distribuição de Vendas", "barra");
        RelatorioPDF relatorio = new RelatorioPDF("João Silva", 12);

        // Imprimindo cada conteúdo
        doc.imprimir();
        img.imprimir();
        grafico.imprimir();
        relatorio.imprimir();
    }
} 