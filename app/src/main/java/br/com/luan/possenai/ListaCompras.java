package br.com.luan.possenai;

/**
 * Created by luan on 14/09/2015.
 */
public class ListaCompras {

    private Integer quantidadeCarne;
    private Integer quantidadeLinguica;
    private Integer quantidadeRefri;

    public ListaCompras() {
        this.quantidadeCarne = 0;
        this.quantidadeLinguica = 0;
        this.quantidadeRefri = 0;
    }

    public Integer getQuantidadeCarne() {
        return quantidadeCarne;
    }

    public void setQuantidadeCarne(Integer quantidadeCarne) {
        this.quantidadeCarne = quantidadeCarne;
    }

    public Integer getQuantidadeLinguica() {
        return quantidadeLinguica;
    }

    public void setQuantidadeLinguica(Integer quantidadeLinguica) {
        this.quantidadeLinguica = quantidadeLinguica;
    }

    public Integer getQuantidadeRefri() {
        return quantidadeRefri;
    }

    public void setQuantidadeRefri(Integer quantidadeRefri) {
        this.quantidadeRefri = quantidadeRefri;
    }

    @Override
    public String toString() {
        return "ListaCompras{" +
                "quantidadeCarne=" + quantidadeCarne +
                ", quantidadeLinguica=" + quantidadeLinguica +
                ", quantidadeRefri=" + quantidadeRefri +
                '}';
    }
}
