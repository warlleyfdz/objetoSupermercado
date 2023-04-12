package com.primeirotranpodev.objetoSupermercado.Service;

import com.primeirotranpodev.objetoSupermercado.Entity.Carrinho;
import com.primeirotranpodev.objetoSupermercado.Entity.Produto;
import com.primeirotranpodev.objetoSupermercado.Entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarrinhoService {

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private ProdutoService produtoService;

    public Carrinho retornoCarrinhocompra (String nome,String telefone, List<Integer> produtoIdList){


        Carrinho carrinho = new Carrinho(); // estancia um novo carrinho

        Usuario usuario = usuarioService.getUsuario(nome,telefone);

        carrinho.setUsuario(usuario);

        List<Produto>produtoList = produtoService.retornaListaProdutos(produtoIdList);
        carrinho.setProdutoList(produtoList);

        return carrinho;

    }
}
