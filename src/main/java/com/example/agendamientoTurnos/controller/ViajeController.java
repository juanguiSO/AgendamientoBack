package com.example.agendamientoTurnos.controller;


import com.example.agendamientoTurnos.entity.Usuario;
import com.example.agendamientoTurnos.entity.Viaje;
import com.example.agendamientoTurnos.serviceUsuario.UsuarioService;
import com.example.agendamientoTurnos.serviceUsuario.ViajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("http://localhost:5173")
@RequestMapping(path="api/v1/viajes")
public class ViajeController {
    @Autowired
    private ViajeService viajeService;



    @GetMapping
    public List<Viaje> getAll(){
        return viajeService.getViajes();
    }


    @PostMapping
    public Viaje saveUpadate(@RequestBody Viaje viaje){
        viajeService.saveOrUpdate(viaje);
        return viaje;
    }

    @PutMapping("/{id_viaje}")
    public Viaje update(@PathVariable ("id_viaje") Long id_viaje, @RequestBody Viaje viaje){
        viajeService.saveOrUpdate(viaje);
        return viaje;
    }

    @DeleteMapping("/{id_viaje}")
    public void delete(@PathVariable ("id_viaje") Long  id_viaje){
        viajeService.delete(id_viaje);
    }
    @GetMapping("/{idusuario}")
    public Optional<Viaje> getBId(@PathVariable("idusuario") Long id_viaje){
        return viajeService.getViaje(id_viaje);
    }
}
