package com.example.agendamientoTurnos.controller;


import com.example.agendamientoTurnos.entity.Especialidad;
import com.example.agendamientoTurnos.entity.Grado;
import com.example.agendamientoTurnos.serviceUsuario.EspecialidadService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path="api/v1/especialidades")
public class EspecialidadController {

    @Autowired
    private EspecialidadService especialidadService;



    @GetMapping
    public List<Especialidad> getAll(){
        return especialidadService.getEspecialidades();
    }


    @PostMapping
    public Especialidad saveUpadate(@RequestBody Especialidad especialidad){
        especialidadService.saveOrUpdate(especialidad);
        return especialidad;
    }

    @DeleteMapping("/{idEspecialidad}")
    public void saveUpadate(@PathVariable ("idEspecialidad") Long  idEspecialidad){
        especialidadService.delete(idEspecialidad);
    }
    @GetMapping("/{idEspecialidad}")
    public Optional<Especialidad> getBId(@PathVariable("idEspecialidad") Long idEspecialidad){
        return especialidadService.getEspecialidad(idEspecialidad);
    }
}
