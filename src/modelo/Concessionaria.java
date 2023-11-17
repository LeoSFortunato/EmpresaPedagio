package modelo;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Concessionaria implements Serializable {
    private String nome;
    private Set<Praca> pracas = new HashSet<>();
    private Double totalRecebido;

    protected Concessionaria() {

    }
    public Concessionaria (String nome) {
        this.nome = nome;
        this.totalRecebido = 0.0;
    }
    public Concessionaria (Double totalRecebido) {
        this.totalRecebido = totalRecebido;
    }

    public Concessionaria (String nome, Double totalRecebido) {
        this.nome = nome;
        this.totalRecebido = 0.0;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Praca> getPracas() {
        return pracas;
    }

    public Double getTotalRecebido() {
        return totalRecebido;
    }

    public void setTotalRecebido(Double totalRecebido) {
        this.totalRecebido = totalRecebido;
    }

    public void adicionarPraca(Praca praca) {
        this.pracas.add(praca);
        this.totalRecebido = 0.0;
        for (Praca p : this.pracas) {
            this.totalRecebido = this.totalRecebido + p.getTotalRecebido();
        }
    }
    public void limparPracas() {
        this.pracas = new HashSet();
    }
}
