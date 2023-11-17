package modelo;

import java.io.Serializable;
import java.util.Set;

public class Praca implements Serializable {

    private Concessionaria concessionaria;
    private String cidade;
    private Double totalRecebido;
    private Set<Guarita> guaritas;
    private Set<Tarifa> tarifas;

    public Concessionaria getConcessionaria() {
        return concessionaria;
    }

    public void setConcessionaria(Concessionaria concessionaria) {
        this.concessionaria = concessionaria;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Double getTotalRecebido() {
        return totalRecebido;
    }

    public void setTotalRecebido(Double totalRecebido) {
        this.totalRecebido = totalRecebido;
    }

    public Set<Guarita> getGuaritas() {
        return guaritas;
    }

    public void setGuaritas(Set<Guarita> guaritas) {
        this.guaritas = guaritas;
    }

    public Set<Tarifa> getTarifas() {
        return tarifas;
    }

    public void setTarifas(Set<Tarifa> tarifas) {
        this.tarifas = tarifas;
    }
}
