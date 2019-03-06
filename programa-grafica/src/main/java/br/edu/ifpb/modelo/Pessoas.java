package br.edu.ifpb.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 06/03/2019, 10:19:13
 */
public class Pessoas {

    private List<Pessoa> pessoas = new ArrayList<>();

    public boolean nova(Pessoa pessoa) {
        return this.pessoas.add(pessoa);
    }

    public List<Pessoa> todas() {
        return this.pessoas;
    }

    public Pessoa localizar(int index) {
        return this.pessoas.get(index);
    }

    public void remover(Pessoa pessoa) {
        this.pessoas.remove(pessoa);
    }
}
