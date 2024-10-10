package com.example.agendamientoTurnos.controller;


import com.example.agendamientoTurnos.entity.Municipio;
import com.example.agendamientoTurnos.entity.Usuario;
import com.example.agendamientoTurnos.serviceUsuario.MunicipioService;
import com.example.agendamientoTurnos.serviceUsuario.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path="api/v1/municipios")
public class MunicipioController {
    @Autowired
    private MunicipioService municipioService;



    @GetMapping
    public List<Municipio> getAll(){
        return municipioService.getMunicipios();
    }


    @PostMapping
    public Municipio saveUpadate(@RequestBody Municipio municipio){
        municipioService.saveOrUpdate(municipio);
        return municipio;
    }

    @DeleteMapping("/{idMunicipio}")
    public void saveUpadate(@PathVariable ("idMunicipio") Long  idMunicipio){
        municipioService.delete(idMunicipio);
    }
    @GetMapping("/{idMunicipio}")
    public Optional<Municipio> getBId(@PathVariable("idMunicipio") Long idMunicipio){
        return municipioService.getMunicipio(idMunicipio);
    }

}
