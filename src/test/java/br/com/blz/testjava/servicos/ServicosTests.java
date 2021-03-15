package br.com.blz.testjava.servicos;

import br.com.blz.testjava.item.ItemProduto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ServicosTests {

    @Test
    public void contextLoads() {

        //inserir
        //listar
        //alterar
        //deletar

        ServicosProdutos inserir = new ServicosProdutos() {
            @Override
            public ItemProduto inserir() {
                return super.inserir();
            }
        };

        ServicosProdutos listar = new ServicosProdutos() {
            @Override
            public ItemProduto listar() {
                return super.listar();
            }
        };



        ServicosProdutos alterar = new ServicosProdutos() {
            @Override
            public ItemProduto alterar() {
                return super.alterar();
            }
        };

        ServicosProdutos deletar = new ServicosProdutos() {
            @Override
            public ItemProduto deletar() {
                return super.deletar();
            }
        };



    }




}
