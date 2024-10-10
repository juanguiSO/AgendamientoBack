package com.example.agendamientoTurnos.controller;


import com.example.agendamientoTurnos.entity.Grado;
import com.example.agendamientoTurnos.entity.Municipio;
import com.example.agendamientoTurnos.serviceUsuario.GradoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path="api/v1/grados")
public class GradoController {
    @Autowired
    private GradoService gradoService;



    @GetMapping
    public List<Grado> getAll(){
        return gradoService.getGrados();
    }


    @PostMapping
    public Grado saveUpadate(@RequestBody Grado grado){
        gradoService.saveOrUpdate(grado);
        return grado;
    }

    @DeleteMapping("/{idGrado}")
    public void saveUpadate(@PathVariable ("idGrado") Long  idGrado){
        gradoService.delete(idGrado);
    }
    @GetMapping("/{idGrado}")
    public Optional<Grado> getBId(@PathVariable("idGrado") Long idGrado){
        return gradoService.getGrado(idGrado);
    }
}
