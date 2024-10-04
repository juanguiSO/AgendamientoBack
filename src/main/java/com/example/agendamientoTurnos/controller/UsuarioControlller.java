package com.example.agendamientoTurnos.controller;

import com.example.agendamientoTurnos.entity.Usuario;
import com.example.agendamientoTurnos.serviceUsuario.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path="api/v1/usuarios")


public class UsuarioControlller {

    @Autowired
    private  UsuarioService usuarioService;



    @GetMapping
    public List<Usuario> getAll(){
        return usuarioService.getUsuarios();
    }


    @PostMapping
    public Usuario saveUpadate(@RequestBody Usuario usuario){
        usuarioService.saveOrUpdate(usuario);
        return usuario;
    }

    @DeleteMapping("/{idusuario}")
    public void saveUpadate(@PathVariable ("idusuario") Long  idusuario){
        usuarioService.delete(idusuario);
    }
    @GetMapping("/{idusuario}")
    public Optional<Usuario> getBId(@PathVariable("idusuario") Long idusuario){
        return usuarioService.getUsuario(idusuario);
    }
}
