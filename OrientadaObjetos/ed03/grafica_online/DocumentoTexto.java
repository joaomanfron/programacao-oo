/**
 * Classe que representa um documento de texto.
 */
public class DocumentoTexto implements Imprimivel {
    /** Título do documento */
    private String titulo;
    /** Conteúdo do documento */
    private String conteudo;

    /**
     * Construtor da classe DocumentoTexto.
     * @param titulo Título do documento
     * @param conteudo Conteúdo do documento
     */
    public DocumentoTexto(String titulo, String conteudo) {
        this.titulo = titulo;
        this.conteudo = conteudo;
    }

    /**
     * Imprime o documento com o título em maiúsculas seguido do conteúdo.
     */
    @Override
    public void imprimir() {
        System.out.println(titulo.toUpperCase());
        System.out.println(conteudo);
        System.out.println();
    }
} 