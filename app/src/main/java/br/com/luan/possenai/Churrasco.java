package br.com.luan.possenai;

import java.io.Serializable;

/**
 * Created by luan on 12/09/2015.
 */
public class Churrasco implements Serializable{

    private Integer carne;
    private Integer linguica;
    private Integer refrigerante;
    private Integer pessoas;

    public Churrasco() {
        this.carne = 0;
        this.linguica = 0;
        this.refrigerante = 0;
        this.pessoas = 0;
    }

    public Integer getCarne() {
        return carne;
    }

    public void setCarne(Integer carne) {
        this.carne = carne;
    }

    public Integer getLinguica() {
        return linguica;
    }

    public void setLinguica(Integer linguica) {
        this.linguica = linguica;
    }

    public Integer getRefrigerante() {
        return refrigerante;
    }

    public void setRefrigerante(Integer refrigerante) {
        this.refrigerante = refrigerante;
    }

    public Integer getPessoas() {
        return pessoas;
    }

    public void setPessoas(Integer pessoas) {
        this.pessoas = pessoas;
    }

    public ListaCompras calcularListaCompras(){

        ListaCompras lista = new ListaCompras();

        lista.setQuantidadeCarne(this.carne * this.pessoas);
        lista.setQuantidadeLinguica(this.linguica * this.pessoas);
        lista.setQuantidadeRefri(this.refrigerante * this.pessoas);

        return lista;

    }

    @Override
    public String toString() {
        return "Churrasco{" +
                "carne=" + carne +
                ", linguica=" + linguica +
                ", refrigerante=" + refrigerante +
                ", pessoas=" + pessoas +
                '}';
    }
}
