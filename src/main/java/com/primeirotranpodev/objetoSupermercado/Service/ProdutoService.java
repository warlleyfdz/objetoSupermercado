package com.primeirotranpodev.objetoSupermercado.Service;

import com.primeirotranpodev.objetoSupermercado.Entity.Produto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProdutoService {

    public List<Produto> retornaListaProdutos(List<Integer> produtoIdList) {

        Produto produto1 = new Produto();
        produto1.setId(1);
        produto1.setNome("abobora");
        produto1.setPreco(4.90);

        Produto produto2 = new Produto();
        produto2.setId(2);
        produto2.setNome("mexirica");
        produto2.setPreco(0.99);

        Produto produto3 = new Produto();
        produto3.setId(3);
        produto3.setNome("melao");
        produto3.setPreco(2.29);

        Produto produto4 = new Produto();
        produto4.setId(4);
        produto4.setNome("banana");
        produto4.setPreco(7.99);

        Produto produto5 = new Produto();
        produto5.setId(5);
        produto5.setNome("melancia");
        produto5.setPreco(2.99);

        Produto produto6 = new Produto();
        produto6.setId(6);
        produto6.setNome("abacaxi");
        produto6.setPreco(5.00);

        Produto produto7 = new Produto();
        produto7.setId(7);
        produto7.setNome("cocoverde");
        produto7.setPreco(1.99);

        List<Produto> produto = new ArrayList<>();

        for (Integer i = 0; i < produtoIdList.size(); i++) {
            Integer idProduto = produtoIdList.get(i);

            if (idProduto.equals(1)) {
                produto.add(produto1);
            } else if (idProduto.equals(2)) {
                produto.add(produto2);
            } else if (idProduto.equals(3)) {
                produto.add(produto3);
            } else if (idProduto.equals(4)) {
                produto.add(produto4);
            } else if (idProduto.equals(5)) {
                produto.add(produto5);
            } else if (idProduto.equals(6)) {
                produto.add(produto6);
            } else if (idProduto.equals(7)) {
                produto.add(produto7);
            }
        }
        return produto;
    }
}






    /*    produto.add(produto1);
        produto.add(produto2);
        produto.add(produto3);
        produto.add(produto4);
        produto.add(produto5);
        produto.add(produto6);
        produto.add(produto7);
*/


