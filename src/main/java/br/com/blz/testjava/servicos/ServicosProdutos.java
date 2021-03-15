package br.com.blz.testjava.servicos;

import br.com.blz.testjava.item.ItemProduto;
import br.com.blz.testjava.repositorio.DadosProduto;

public abstract class ServicosProdutos {

    public ItemProduto listar(){
        return new DadosProduto().listar();
    }
    public ItemProduto deletar(){
        return new DadosProduto().deletar();
    }
    public ItemProduto inserir(){
        return new DadosProduto().inserir();
    }
    public ItemProduto alterar(){
        return new DadosProduto().alterar();
    }




}
