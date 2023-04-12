package com.primeirotranpodev.objetoSupermercado.Controller;

import com.primeirotranpodev.objetoSupermercado.Entity.Carrinho;
import com.primeirotranpodev.objetoSupermercado.Entity.Produto;
import com.primeirotranpodev.objetoSupermercado.Service.CarrinhoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/carrinho")
public class CarrinhoController {

    @Autowired
    private CarrinhoService carrinhoService;

    @RequestMapping("/carrinho-compra")
    public Carrinho getCarrinho(@RequestParam("nomeusuario") String nome, @RequestParam("telefone") String telefone, @RequestParam("listaprodutos") List<Integer> produtoIdList){
        return carrinhoService.retornoCarrinhocompra(nome,telefone,produtoIdList);
    }

}
