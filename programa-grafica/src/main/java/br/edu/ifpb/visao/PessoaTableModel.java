package br.edu.ifpb.visao;

import br.edu.ifpb.modelo.Pessoa;
import br.edu.ifpb.modelo.Pessoas;
import javax.swing.table.AbstractTableModel;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 06/03/2019, 10:25:27
 */
public class PessoaTableModel extends AbstractTableModel {

    private final Pessoas pessoas;
    private final String[] colunas = {"Nome","CPF"};

    public PessoaTableModel(Pessoas pessoas) {
        this.pessoas = pessoas;
    }

    public void novaAdicionada(Pessoa pessoa) {
        this.pessoas.nova(pessoa);
        fireTableDataChanged();
    }

    public Pessoa porLinha(int row) {
        return this.pessoas.localizar(row);
    }

    public void remover(Pessoa pessoa) {
        this.pessoas.remover(pessoa);
        fireTableDataChanged();
    }

    @Override
    public String getColumnName(int column) {
        return this.colunas[column];
    }

    @Override
    public int getRowCount() {
        return this.pessoas.todas().size();
    }

    @Override
    public int getColumnCount() {
        // return 2
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex,int columnIndex) {
        Pessoa pessoa = this.pessoas.localizar(rowIndex);
        switch (columnIndex) {
            case 0:
                return pessoa.getNome();
            case 1:
                return pessoa.getCpf();
        }
        return "";
    }

}
