package br.com.blz.testjava.item;

import br.com.blz.testjava.produto.Detalhe;

import java.util.List;

public class ItemProduto {

    private String sku;
    private String nome;
    private List<Detalhe> detalhe;



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List getDetalhe() {
        return detalhe;
    }

    public void setDetalhe(List detalhe) {
        this.detalhe = detalhe;
    }

    public String getSku() {
        return sku;
    }


    public void setSku(String sku) {
        this.sku = sku;
    }



}
