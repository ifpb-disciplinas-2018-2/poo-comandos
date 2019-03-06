package br.edu.ifpb.modelo;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 06/03/2019, 11:42:47
 */
public enum Categoria {

    ROMANCE("Romance"),
    TERROR("Terror"),
    ACAO("Ação");

    private Categoria(String categoria) {
        this.categoria = categoria;
    }
    private final String categoria;

    @Override
    public String toString() {
        return this.categoria;
    }
    
    
}
