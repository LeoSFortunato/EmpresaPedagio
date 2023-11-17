package modelo;

import java.io.Serializable;

public class Tarifa implements Serializable {
    private Categoria categoria;
    private Double valor;

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
