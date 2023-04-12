package com.primeirotranpodev.objetoSupermercado.Controller;

import com.primeirotranpodev.objetoSupermercado.Entity.Produto;
import com.primeirotranpodev.objetoSupermercado.Entity.Usuario;
import com.primeirotranpodev.objetoSupermercado.Service.CarrinhoService;
import com.primeirotranpodev.objetoSupermercado.Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private CarrinhoService carrinhoService;

    @RequestMapping("/compra-supermercado")
    public Usuario retornoCompra (@RequestParam("nome") String nome, @RequestParam("telefone") String telefone, @RequestParam("listaproduto") Integer produtoList){
        return usuarioService.getUsuario(nome,telefone);
    }



}
