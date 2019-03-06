package br.edu.ifpb.modelo;

import java.util.Objects;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 06/03/2019, 10:15:53
 */
public class Pessoa {

    private String nome;
    private String cpf;

    public Pessoa(String nome,String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Pessoa{" + nome + ", " + cpf + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.nome);
        hash = 23 * hash + Objects.hashCode(this.cpf);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pessoa other = (Pessoa) obj;
        if (!Objects.equals(this.nome,other.nome)) {
            return false;
        }
        if (!Objects.equals(this.cpf,other.cpf)) {
            return false;
        }
        return true;
    }
    

}
