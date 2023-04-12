package com.primeirotranpodev.objetoSupermercado.Service;

import com.primeirotranpodev.objetoSupermercado.Entity.Usuario;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    public Usuario getUsuario(String nome, String telefone){
        Usuario usuario = new Usuario();

        usuario.setId(1);
        usuario.setNome(nome);
        usuario.setTelefone(telefone);

        return usuario;

    }


}
